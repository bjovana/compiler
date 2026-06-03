// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclIf extends StatementDecl {

    private ConditionDecl ConditionDecl;
    private Rparen Rparen;
    private CondStatementDecl CondStatementDecl;
    private ElseDecl ElseDecl;

    public StatementDeclIf (ConditionDecl ConditionDecl, Rparen Rparen, CondStatementDecl CondStatementDecl, ElseDecl ElseDecl) {
        this.ConditionDecl=ConditionDecl;
        if(ConditionDecl!=null) ConditionDecl.setParent(this);
        this.Rparen=Rparen;
        if(Rparen!=null) Rparen.setParent(this);
        this.CondStatementDecl=CondStatementDecl;
        if(CondStatementDecl!=null) CondStatementDecl.setParent(this);
        this.ElseDecl=ElseDecl;
        if(ElseDecl!=null) ElseDecl.setParent(this);
    }

    public ConditionDecl getConditionDecl() {
        return ConditionDecl;
    }

    public void setConditionDecl(ConditionDecl ConditionDecl) {
        this.ConditionDecl=ConditionDecl;
    }

    public Rparen getRparen() {
        return Rparen;
    }

    public void setRparen(Rparen Rparen) {
        this.Rparen=Rparen;
    }

    public CondStatementDecl getCondStatementDecl() {
        return CondStatementDecl;
    }

    public void setCondStatementDecl(CondStatementDecl CondStatementDecl) {
        this.CondStatementDecl=CondStatementDecl;
    }

    public ElseDecl getElseDecl() {
        return ElseDecl;
    }

    public void setElseDecl(ElseDecl ElseDecl) {
        this.ElseDecl=ElseDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionDecl!=null) ConditionDecl.accept(visitor);
        if(Rparen!=null) Rparen.accept(visitor);
        if(CondStatementDecl!=null) CondStatementDecl.accept(visitor);
        if(ElseDecl!=null) ElseDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionDecl!=null) ConditionDecl.traverseTopDown(visitor);
        if(Rparen!=null) Rparen.traverseTopDown(visitor);
        if(CondStatementDecl!=null) CondStatementDecl.traverseTopDown(visitor);
        if(ElseDecl!=null) ElseDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionDecl!=null) ConditionDecl.traverseBottomUp(visitor);
        if(Rparen!=null) Rparen.traverseBottomUp(visitor);
        if(CondStatementDecl!=null) CondStatementDecl.traverseBottomUp(visitor);
        if(ElseDecl!=null) ElseDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclIf(\n");

        if(ConditionDecl!=null)
            buffer.append(ConditionDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Rparen!=null)
            buffer.append(Rparen.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondStatementDecl!=null)
            buffer.append(CondStatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ElseDecl!=null)
            buffer.append(ElseDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclIf]");
        return buffer.toString();
    }
}
