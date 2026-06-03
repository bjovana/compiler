// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ActParsDeclaration extends ActParsDecl {

    private ActParsDecl ActParsDecl;
    private ExprDecl ExprDecl;

    public ActParsDeclaration (ActParsDecl ActParsDecl, ExprDecl ExprDecl) {
        this.ActParsDecl=ActParsDecl;
        if(ActParsDecl!=null) ActParsDecl.setParent(this);
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
    }

    public ActParsDecl getActParsDecl() {
        return ActParsDecl;
    }

    public void setActParsDecl(ActParsDecl ActParsDecl) {
        this.ActParsDecl=ActParsDecl;
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActParsDecl!=null) ActParsDecl.accept(visitor);
        if(ExprDecl!=null) ExprDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActParsDecl!=null) ActParsDecl.traverseTopDown(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActParsDecl!=null) ActParsDecl.traverseBottomUp(visitor);
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParsDeclaration(\n");

        if(ActParsDecl!=null)
            buffer.append(ActParsDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActParsDeclaration]");
        return buffer.toString();
    }
}
