// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ConstValBool extends ConstVal {

    private Boolean boolLiteral;

    public ConstValBool (Boolean boolLiteral) {
        this.boolLiteral=boolLiteral;
    }

    public Boolean getBoolLiteral() {
        return boolLiteral;
    }

    public void setBoolLiteral(Boolean boolLiteral) {
        this.boolLiteral=boolLiteral;
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
        buffer.append("ConstValBool(\n");

        buffer.append(" "+tab+boolLiteral);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstValBool]");
        return buffer.toString();
    }
}
