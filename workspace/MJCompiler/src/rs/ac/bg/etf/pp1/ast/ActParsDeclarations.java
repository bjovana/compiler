// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ActParsDeclarations extends ActParsDeclList {

    private ActParsDecl ActParsDecl;

    public ActParsDeclarations (ActParsDecl ActParsDecl) {
        this.ActParsDecl=ActParsDecl;
        if(ActParsDecl!=null) ActParsDecl.setParent(this);
    }

    public ActParsDecl getActParsDecl() {
        return ActParsDecl;
    }

    public void setActParsDecl(ActParsDecl ActParsDecl) {
        this.ActParsDecl=ActParsDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActParsDecl!=null) ActParsDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActParsDecl!=null) ActParsDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActParsDecl!=null) ActParsDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParsDeclarations(\n");

        if(ActParsDecl!=null)
            buffer.append(ActParsDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActParsDeclarations]");
        return buffer.toString();
    }
}
