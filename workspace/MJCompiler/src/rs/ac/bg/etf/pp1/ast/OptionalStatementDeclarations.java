// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class OptionalStatementDeclarations extends OptionalStatementDeclList {

    private OptionalStatementDeclList OptionalStatementDeclList;
    private StatementDecl StatementDecl;

    public OptionalStatementDeclarations (OptionalStatementDeclList OptionalStatementDeclList, StatementDecl StatementDecl) {
        this.OptionalStatementDeclList=OptionalStatementDeclList;
        if(OptionalStatementDeclList!=null) OptionalStatementDeclList.setParent(this);
        this.StatementDecl=StatementDecl;
        if(StatementDecl!=null) StatementDecl.setParent(this);
    }

    public OptionalStatementDeclList getOptionalStatementDeclList() {
        return OptionalStatementDeclList;
    }

    public void setOptionalStatementDeclList(OptionalStatementDeclList OptionalStatementDeclList) {
        this.OptionalStatementDeclList=OptionalStatementDeclList;
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
        if(OptionalStatementDeclList!=null) OptionalStatementDeclList.accept(visitor);
        if(StatementDecl!=null) StatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalStatementDeclList!=null) OptionalStatementDeclList.traverseTopDown(visitor);
        if(StatementDecl!=null) StatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalStatementDeclList!=null) OptionalStatementDeclList.traverseBottomUp(visitor);
        if(StatementDecl!=null) StatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OptionalStatementDeclarations(\n");

        if(OptionalStatementDeclList!=null)
            buffer.append(OptionalStatementDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementDecl!=null)
            buffer.append(StatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionalStatementDeclarations]");
        return buffer.toString();
    }
}
