// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class DesignatorDeclDot extends DesignatorDecl {

    private String objectName;
    private Integer numberLiteral;

    public DesignatorDeclDot (String objectName, Integer numberLiteral) {
        this.objectName=objectName;
        this.numberLiteral=numberLiteral;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName=objectName;
    }

    public Integer getNumberLiteral() {
        return numberLiteral;
    }

    public void setNumberLiteral(Integer numberLiteral) {
        this.numberLiteral=numberLiteral;
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
        buffer.append("DesignatorDeclDot(\n");

        buffer.append(" "+tab+objectName);
        buffer.append("\n");

        buffer.append(" "+tab+numberLiteral);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorDeclDot]");
        return buffer.toString();
    }
}
