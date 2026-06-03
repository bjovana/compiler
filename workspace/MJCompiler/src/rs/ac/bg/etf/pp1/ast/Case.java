// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class Case implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Integer numberLiteral;
    private ColonSwitch ColonSwitch;

    public Case (Integer numberLiteral, ColonSwitch ColonSwitch) {
        this.numberLiteral=numberLiteral;
        this.ColonSwitch=ColonSwitch;
        if(ColonSwitch!=null) ColonSwitch.setParent(this);
    }

    public Integer getNumberLiteral() {
        return numberLiteral;
    }

    public void setNumberLiteral(Integer numberLiteral) {
        this.numberLiteral=numberLiteral;
    }

    public ColonSwitch getColonSwitch() {
        return ColonSwitch;
    }

    public void setColonSwitch(ColonSwitch ColonSwitch) {
        this.ColonSwitch=ColonSwitch;
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
        if(ColonSwitch!=null) ColonSwitch.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ColonSwitch!=null) ColonSwitch.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ColonSwitch!=null) ColonSwitch.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Case(\n");

        buffer.append(" "+tab+numberLiteral);
        buffer.append("\n");

        if(ColonSwitch!=null)
            buffer.append(ColonSwitch.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Case]");
        return buffer.toString();
    }
}
