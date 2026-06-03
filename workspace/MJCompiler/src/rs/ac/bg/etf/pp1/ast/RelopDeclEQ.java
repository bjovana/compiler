// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class RelopDeclEQ extends RelopDecl {

    public RelopDeclEQ () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("RelopDeclEQ(\n");

        buffer.append(tab);
        buffer.append(") [RelopDeclEQ]");
        return buffer.toString();
    }
}
