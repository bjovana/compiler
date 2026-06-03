// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ConstValChar extends ConstVal {

    private Character charLiteral;

    public ConstValChar (Character charLiteral) {
        this.charLiteral=charLiteral;
    }

    public Character getCharLiteral() {
        return charLiteral;
    }

    public void setCharLiteral(Character charLiteral) {
        this.charLiteral=charLiteral;
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
        buffer.append("ConstValChar(\n");

        buffer.append(" "+tab+charLiteral);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstValChar]");
        return buffer.toString();
    }
}
