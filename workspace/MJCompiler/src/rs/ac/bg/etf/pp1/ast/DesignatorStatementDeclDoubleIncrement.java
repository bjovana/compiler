// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementDeclDoubleIncrement extends DesignatorStatementDecl {

    private DesignatorDecl DesignatorDecl;

    public DesignatorStatementDeclDoubleIncrement (DesignatorDecl DesignatorDecl) {
        this.DesignatorDecl=DesignatorDecl;
        if(DesignatorDecl!=null) DesignatorDecl.setParent(this);
    }

    public DesignatorDecl getDesignatorDecl() {
        return DesignatorDecl;
    }

    public void setDesignatorDecl(DesignatorDecl DesignatorDecl) {
        this.DesignatorDecl=DesignatorDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorDecl!=null) DesignatorDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorDecl!=null) DesignatorDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorDecl!=null) DesignatorDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementDeclDoubleIncrement(\n");

        if(DesignatorDecl!=null)
            buffer.append(DesignatorDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementDeclDoubleIncrement]");
        return buffer.toString();
    }
}
