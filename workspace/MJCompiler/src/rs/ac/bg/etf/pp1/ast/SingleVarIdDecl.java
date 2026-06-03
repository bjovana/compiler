// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class SingleVarIdDecl extends VarIdDeclList {

    private String varName;
    private VarArrayDecl VarArrayDecl;

    public SingleVarIdDecl (String varName, VarArrayDecl VarArrayDecl) {
        this.varName=varName;
        this.VarArrayDecl=VarArrayDecl;
        if(VarArrayDecl!=null) VarArrayDecl.setParent(this);
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName=varName;
    }

    public VarArrayDecl getVarArrayDecl() {
        return VarArrayDecl;
    }

    public void setVarArrayDecl(VarArrayDecl VarArrayDecl) {
        this.VarArrayDecl=VarArrayDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarArrayDecl!=null) VarArrayDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarArrayDecl!=null) VarArrayDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarArrayDecl!=null) VarArrayDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleVarIdDecl(\n");

        buffer.append(" "+tab+varName);
        buffer.append("\n");

        if(VarArrayDecl!=null)
            buffer.append(VarArrayDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleVarIdDecl]");
        return buffer.toString();
    }
}
