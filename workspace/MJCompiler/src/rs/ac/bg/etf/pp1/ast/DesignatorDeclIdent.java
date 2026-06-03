// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class DesignatorDeclIdent extends DesignatorDecl {

    private String objectName;

    public DesignatorDeclIdent (String objectName) {
        this.objectName=objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName=objectName;
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
        buffer.append("DesignatorDeclIdent(\n");

        buffer.append(" "+tab+objectName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorDeclIdent]");
        return buffer.toString();
    }
}
