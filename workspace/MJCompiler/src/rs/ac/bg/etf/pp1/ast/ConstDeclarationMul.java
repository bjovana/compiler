// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarationMul extends ConstDeclMul {

    private ConstDeclMul ConstDeclMul;
    private String constName;
    private ConstVal ConstVal;

    public ConstDeclarationMul (ConstDeclMul ConstDeclMul, String constName, ConstVal ConstVal) {
        this.ConstDeclMul=ConstDeclMul;
        if(ConstDeclMul!=null) ConstDeclMul.setParent(this);
        this.constName=constName;
        this.ConstVal=ConstVal;
        if(ConstVal!=null) ConstVal.setParent(this);
    }

    public ConstDeclMul getConstDeclMul() {
        return ConstDeclMul;
    }

    public void setConstDeclMul(ConstDeclMul ConstDeclMul) {
        this.ConstDeclMul=ConstDeclMul;
    }

    public String getConstName() {
        return constName;
    }

    public void setConstName(String constName) {
        this.constName=constName;
    }

    public ConstVal getConstVal() {
        return ConstVal;
    }

    public void setConstVal(ConstVal ConstVal) {
        this.ConstVal=ConstVal;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDeclMul!=null) ConstDeclMul.accept(visitor);
        if(ConstVal!=null) ConstVal.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclMul!=null) ConstDeclMul.traverseTopDown(visitor);
        if(ConstVal!=null) ConstVal.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclMul!=null) ConstDeclMul.traverseBottomUp(visitor);
        if(ConstVal!=null) ConstVal.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclarationMul(\n");

        if(ConstDeclMul!=null)
            buffer.append(ConstDeclMul.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+constName);
        buffer.append("\n");

        if(ConstVal!=null)
            buffer.append(ConstVal.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarationMul]");
        return buffer.toString();
    }
}
