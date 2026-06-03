// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ExprDeclaration extends ExprDecl {

    private ExprOptSignDecl ExprOptSignDecl;
    private TermDecl TermDecl;
    private AddopTermDeclList AddopTermDeclList;

    public ExprDeclaration (ExprOptSignDecl ExprOptSignDecl, TermDecl TermDecl, AddopTermDeclList AddopTermDeclList) {
        this.ExprOptSignDecl=ExprOptSignDecl;
        if(ExprOptSignDecl!=null) ExprOptSignDecl.setParent(this);
        this.TermDecl=TermDecl;
        if(TermDecl!=null) TermDecl.setParent(this);
        this.AddopTermDeclList=AddopTermDeclList;
        if(AddopTermDeclList!=null) AddopTermDeclList.setParent(this);
    }

    public ExprOptSignDecl getExprOptSignDecl() {
        return ExprOptSignDecl;
    }

    public void setExprOptSignDecl(ExprOptSignDecl ExprOptSignDecl) {
        this.ExprOptSignDecl=ExprOptSignDecl;
    }

    public TermDecl getTermDecl() {
        return TermDecl;
    }

    public void setTermDecl(TermDecl TermDecl) {
        this.TermDecl=TermDecl;
    }

    public AddopTermDeclList getAddopTermDeclList() {
        return AddopTermDeclList;
    }

    public void setAddopTermDeclList(AddopTermDeclList AddopTermDeclList) {
        this.AddopTermDeclList=AddopTermDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprOptSignDecl!=null) ExprOptSignDecl.accept(visitor);
        if(TermDecl!=null) TermDecl.accept(visitor);
        if(AddopTermDeclList!=null) AddopTermDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprOptSignDecl!=null) ExprOptSignDecl.traverseTopDown(visitor);
        if(TermDecl!=null) TermDecl.traverseTopDown(visitor);
        if(AddopTermDeclList!=null) AddopTermDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprOptSignDecl!=null) ExprOptSignDecl.traverseBottomUp(visitor);
        if(TermDecl!=null) TermDecl.traverseBottomUp(visitor);
        if(AddopTermDeclList!=null) AddopTermDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprDeclaration(\n");

        if(ExprOptSignDecl!=null)
            buffer.append(ExprOptSignDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(TermDecl!=null)
            buffer.append(TermDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddopTermDeclList!=null)
            buffer.append(AddopTermDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprDeclaration]");
        return buffer.toString();
    }
}
