// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclPrint extends StatementDecl {

    private ExprDecl ExprDecl;
    private PrintArgsDecl PrintArgsDecl;

    public StatementDeclPrint (ExprDecl ExprDecl, PrintArgsDecl PrintArgsDecl) {
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
        this.PrintArgsDecl=PrintArgsDecl;
        if(PrintArgsDecl!=null) PrintArgsDecl.setParent(this);
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public PrintArgsDecl getPrintArgsDecl() {
        return PrintArgsDecl;
    }

    public void setPrintArgsDecl(PrintArgsDecl PrintArgsDecl) {
        this.PrintArgsDecl=PrintArgsDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprDecl!=null) ExprDecl.accept(visitor);
        if(PrintArgsDecl!=null) PrintArgsDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
        if(PrintArgsDecl!=null) PrintArgsDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        if(PrintArgsDecl!=null) PrintArgsDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclPrint(\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(PrintArgsDecl!=null)
            buffer.append(PrintArgsDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclPrint]");
        return buffer.toString();
    }
}
