package nowebDocGems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import nowebDocGems.gram.NowebDocGemsAdBaseListener;
import nowebDocGems.gram.NowebDocGemsAdLexer;
import nowebDocGems.gram.NowebDocGemsAdParser;
import nowebDocGems.line.Instruction;
import nowebDocGems.line.Macro;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Semantic extends NowebDocGemsAdBaseListener {

    Semantic() {
        specificationLst = new ArrayList<>();
    }
    String versao = "nowebdoc-gems-ad (C) 2017, v0.1.1";
    String configuration;
    String snippetName;
    List<String> specificationLst;

    void addSpecification(String specification) {
        specificationLst.add(specification);
    }

    @Override
    public void enterMacro(NowebDocGemsAdParser.MacroContext ctx) {
        if (ctx.mac != null) {
            String macro = ctx.mac.getText().trim();
            Macro m = new Macro(macro);
            owner.addMacro(currentKeyName, m);
            owner.used(macro, currentKeyName);
        }
    }

    @Override
    public void enterRawcode(NowebDocGemsAdParser.RawcodeContext ctx) {
        if (ctx.lin != null) {
            String instruction = ctx.lin.getText();
            Instruction n = new Instruction(instruction);
            owner.addInstruction(currentKeyName, n);
        }
    }

    @Override
    public void exitDefinition(NowebDocGemsAdParser.DefinitionContext ctx) {
        currentKeyName = ctx.def.getText().replace(">>=", ">>");
        owner.createCodeFrag(currentKeyName);
        owner.dic(currentKeyName, currentSpecification);
    }
    String currentKeyName;

    void construir() {
        for (String specification : specificationLst) {
            InputStream is = null;
            try {
                is = new FileInputStream(specification);
                ANTLRInputStream input = null;
                try {
                    input = new ANTLRInputStream(is);
                } catch (IOException ex) {

                }
                currentSpecification = specification;
                NowebDocGemsAdLexer lexer = new NowebDocGemsAdLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                NowebDocGemsAdParser parser = new NowebDocGemsAdParser(tokens);
                parser.setBuildParseTree(true);
                RuleContext arvore = parser.spec();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(this, arvore);
            } catch (FileNotFoundException ex) {

            } finally {
                try {
                    is.close();
                } catch (IOException ex) {

                }
            }
        }
    }
    String currentSpecification;

    void owner(Generator aThis) {
        owner = aThis;
    }
    Generator owner;
}
