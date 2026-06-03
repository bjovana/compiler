// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclSwitch extends StatementDecl {

    private Switch Switch;
    private ExprDecl ExprDecl;
    private SwitchOptionalStatementDeclList SwitchOptionalStatementDeclList;

    public StatementDeclSwitch (Switch Switch, ExprDecl ExprDecl, SwitchOptionalStatementDeclList SwitchOptionalStatementDeclList) {
        this.Switch=Switch;
        if(Switch!=null) Switch.setParent(this);
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
        this.SwitchOptionalStatementDeclList=SwitchOptionalStatementDeclList;
        if(SwitchOptionalStatementDeclList!=null) SwitchOptionalStatementDeclList.setParent(this);
    }

    public Switch getSwitch() {
        return Switch;
    }

    public void setSwitch(Switch Switch) {
        this.Switch=Switch;
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public SwitchOptionalStatementDeclList getSwitchOptionalStatementDeclList() {
        return SwitchOptionalStatementDeclList;
    }

    public void setSwitchOptionalStatementDeclList(SwitchOptionalStatementDeclList SwitchOptionalStatementDeclList) {
        this.SwitchOptionalStatementDeclList=SwitchOptionalStatementDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Switch!=null) Switch.accept(visitor);
        if(ExprDecl!=null) ExprDecl.accept(visitor);
        if(SwitchOptionalStatementDeclList!=null) SwitchOptionalStatementDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Switch!=null) Switch.traverseTopDown(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
        if(SwitchOptionalStatementDeclList!=null) SwitchOptionalStatementDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Switch!=null) Switch.traverseBottomUp(visitor);
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        if(SwitchOptionalStatementDeclList!=null) SwitchOptionalStatementDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclSwitch(\n");

        if(Switch!=null)
            buffer.append(Switch.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SwitchOptionalStatementDeclList!=null)
            buffer.append(SwitchOptionalStatementDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclSwitch]");
        return buffer.toString();
    }
}
