// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class EnumItem implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private String enumItemName;
    private EnumItemAssignValue EnumItemAssignValue;

    public EnumItem (String enumItemName, EnumItemAssignValue EnumItemAssignValue) {
        this.enumItemName=enumItemName;
        this.EnumItemAssignValue=EnumItemAssignValue;
        if(EnumItemAssignValue!=null) EnumItemAssignValue.setParent(this);
    }

    public String getEnumItemName() {
        return enumItemName;
    }

    public void setEnumItemName(String enumItemName) {
        this.enumItemName=enumItemName;
    }

    public EnumItemAssignValue getEnumItemAssignValue() {
        return EnumItemAssignValue;
    }

    public void setEnumItemAssignValue(EnumItemAssignValue EnumItemAssignValue) {
        this.EnumItemAssignValue=EnumItemAssignValue;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(EnumItemAssignValue!=null) EnumItemAssignValue.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(EnumItemAssignValue!=null) EnumItemAssignValue.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(EnumItemAssignValue!=null) EnumItemAssignValue.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("EnumItem(\n");

        buffer.append(" "+tab+enumItemName);
        buffer.append("\n");

        if(EnumItemAssignValue!=null)
            buffer.append(EnumItemAssignValue.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [EnumItem]");
        return buffer.toString();
    }
}
