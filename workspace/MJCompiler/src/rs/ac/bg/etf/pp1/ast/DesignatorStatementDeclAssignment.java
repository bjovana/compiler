// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementDeclAssignment extends DesignatorStatementDecl {

    private DesignatorDecl DesignatorDecl;
    private ExprDecl ExprDecl;

    public DesignatorStatementDeclAssignment (DesignatorDecl DesignatorDecl, ExprDecl ExprDecl) {
        this.DesignatorDecl=DesignatorDecl;
        if(DesignatorDecl!=null) DesignatorDecl.setParent(this);
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
    }

    public DesignatorDecl getDesignatorDecl() {
        return DesignatorDecl;
    }

    public void setDesignatorDecl(DesignatorDecl DesignatorDecl) {
        this.DesignatorDecl=DesignatorDecl;
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorDecl!=null) DesignatorDecl.accept(visitor);
        if(ExprDecl!=null) ExprDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorDecl!=null) DesignatorDecl.traverseTopDown(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorDecl!=null) DesignatorDecl.traverseBottomUp(visitor);
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementDeclAssignment(\n");

        if(DesignatorDecl!=null)
            buffer.append(DesignatorDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementDeclAssignment]");
        return buffer.toString();
    }
}
