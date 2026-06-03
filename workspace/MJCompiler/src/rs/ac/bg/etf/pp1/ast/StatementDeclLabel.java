// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclLabel extends StatementDecl {

    private GotoStmt GotoStmt;
    private StatementDecl StatementDecl;

    public StatementDeclLabel (GotoStmt GotoStmt, StatementDecl StatementDecl) {
        this.GotoStmt=GotoStmt;
        if(GotoStmt!=null) GotoStmt.setParent(this);
        this.StatementDecl=StatementDecl;
        if(StatementDecl!=null) StatementDecl.setParent(this);
    }

    public GotoStmt getGotoStmt() {
        return GotoStmt;
    }

    public void setGotoStmt(GotoStmt GotoStmt) {
        this.GotoStmt=GotoStmt;
    }

    public StatementDecl getStatementDecl() {
        return StatementDecl;
    }

    public void setStatementDecl(StatementDecl StatementDecl) {
        this.StatementDecl=StatementDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(GotoStmt!=null) GotoStmt.accept(visitor);
        if(StatementDecl!=null) StatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(GotoStmt!=null) GotoStmt.traverseTopDown(visitor);
        if(StatementDecl!=null) StatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(GotoStmt!=null) GotoStmt.traverseBottomUp(visitor);
        if(StatementDecl!=null) StatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclLabel(\n");

        if(GotoStmt!=null)
            buffer.append(GotoStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementDecl!=null)
            buffer.append(StatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclLabel]");
        return buffer.toString();
    }
}
