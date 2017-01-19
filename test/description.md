


[source,java]
----
<<zubs>>=
package nowebDocGems;
<<NowebDocGems::imported modules>>
public class NowebDocGems {
    <<NowebDocGems::constructor>>

    void configure(String[] args) {
        semantic = new NowebDocGemsSemantic();
        semantic.owner(this);
        // Processo a linha de comando e recupero a configuração,
        // o nome do trecho e o nome da especificação:
        NowebDocGemsParams params = new NowebDocGemsParams();
        params.processar(args, semantic);
        // Processo o arquivo de especificação, produzindo
        // um mapa de trechos de código:
        semantic.construir();
    //        System.out.println(this.snippetMap);
    }

    void generate() {
        List<String> prg = expand(semantic.snippetName);
        prg.forEach((lin) -> {
            System.out.print(lin);
        });
    }

    public List<String> expand(String snippetName) {
        if (!snippetMap.containsKey(snippetName)) {
            System.out.printf("*** FATAL! Code snippet\n");
            System.out.printf("\t<<%s>> not found in description '%s'", snippetName, snippetName);
            System.exit(-1);
        }
        List<Line> snippetLst = snippetMap.get(snippetName);
        List<String> program = new ArrayList<>();
        snippetLst.stream().forEach(
            line -> {
                List<String> subProgram = line.expand(this);
                program.addAll(subProgram);
            }
        );
        return program;
    }

    void addMacro(String currentKeyName, Macro m) {
        List<Line> inst = snippetMap.get(currentKeyName);
        inst.add(m);
    }

    void addInstruction(String currentKeyName, Instruction n) {
        List<Line> inst = snippetMap.get(currentKeyName);
        inst.add(n);
    }

    void createCodeFrag(String currentKeyName) {
        snippetMap.put(currentKeyName, new ArrayList<>());
    }

}
----

[source,java]
----
<<NowebDocGems::imported modules>>=
import nowebDocGems.line.Macro;
import nowebDocGems.line.Instruction;
import nowebDocGems.line.Line;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
----

[source,java]
----
<<NowebDocGems::constructor>>=
NowebDocGems() {
    snippetMap = new HashMap<>();
}
NowebDocGemsSemantic semantic;
Map<String, List<Line>> snippetMap;
----


