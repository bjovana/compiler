// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class FactorDeclNumber extends FactorDecl {

    private Integer numberLiteral;

    public FactorDeclNumber (Integer numberLiteral) {
        this.numberLiteral=numberLiteral;
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
        buffer.append("FactorDeclNumber(\n");

        buffer.append(" "+tab+numberLiteral);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorDeclNumber]");
        return buffer.toString();
    }
}
