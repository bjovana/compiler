// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class DesignatorDeclIdentField extends DesignatorDecl {

    private String typeName;
    private String propertyName;

    public DesignatorDeclIdentField (String typeName, String propertyName) {
        this.typeName=typeName;
        this.propertyName=propertyName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName=typeName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName=propertyName;
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
        buffer.append("DesignatorDeclIdentField(\n");

        buffer.append(" "+tab+typeName);
        buffer.append("\n");

        buffer.append(" "+tab+propertyName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorDeclIdentField]");
        return buffer.toString();
    }
}
