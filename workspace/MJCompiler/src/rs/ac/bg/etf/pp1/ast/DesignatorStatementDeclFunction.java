// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementDeclFunction extends DesignatorStatementDecl {

    private DesignatorDecl DesignatorDecl;
    private ActParsDeclList ActParsDeclList;

    public DesignatorStatementDeclFunction (DesignatorDecl DesignatorDecl, ActParsDeclList ActParsDeclList) {
        this.DesignatorDecl=DesignatorDecl;
        if(DesignatorDecl!=null) DesignatorDecl.setParent(this);
        this.ActParsDeclList=ActParsDeclList;
        if(ActParsDeclList!=null) ActParsDeclList.setParent(this);
    }

    public DesignatorDecl getDesignatorDecl() {
        return DesignatorDecl;
    }

    public void setDesignatorDecl(DesignatorDecl DesignatorDecl) {
        this.DesignatorDecl=DesignatorDecl;
    }

    public ActParsDeclList getActParsDeclList() {
        return ActParsDeclList;
    }

    public void setActParsDeclList(ActParsDeclList ActParsDeclList) {
        this.ActParsDeclList=ActParsDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorDecl!=null) DesignatorDecl.accept(visitor);
        if(ActParsDeclList!=null) ActParsDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorDecl!=null) DesignatorDecl.traverseTopDown(visitor);
        if(ActParsDeclList!=null) ActParsDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorDecl!=null) DesignatorDecl.traverseBottomUp(visitor);
        if(ActParsDeclList!=null) ActParsDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementDeclFunction(\n");

        if(DesignatorDecl!=null)
            buffer.append(DesignatorDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ActParsDeclList!=null)
            buffer.append(ActParsDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementDeclFunction]");
        return buffer.toString();
    }
}
