// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ForCondition extends ForConditionOpt {

    private ConditionDecl ConditionDecl;

    public ForCondition (ConditionDecl ConditionDecl) {
        this.ConditionDecl=ConditionDecl;
        if(ConditionDecl!=null) ConditionDecl.setParent(this);
    }

    public ConditionDecl getConditionDecl() {
        return ConditionDecl;
    }

    public void setConditionDecl(ConditionDecl ConditionDecl) {
        this.ConditionDecl=ConditionDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionDecl!=null) ConditionDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionDecl!=null) ConditionDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionDecl!=null) ConditionDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ForCondition(\n");

        if(ConditionDecl!=null)
            buffer.append(ConditionDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ForCondition]");
        return buffer.toString();
    }
}
