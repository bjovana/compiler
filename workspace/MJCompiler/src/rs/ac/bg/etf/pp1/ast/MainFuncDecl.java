// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class MainFuncDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private VoidMain VoidMain;
    private VarDeclList VarDeclList;
    private StatementDeclList StatementDeclList;

    public MainFuncDecl (VoidMain VoidMain, VarDeclList VarDeclList, StatementDeclList StatementDeclList) {
        this.VoidMain=VoidMain;
        if(VoidMain!=null) VoidMain.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.StatementDeclList=StatementDeclList;
        if(StatementDeclList!=null) StatementDeclList.setParent(this);
    }

    public VoidMain getVoidMain() {
        return VoidMain;
    }

    public void setVoidMain(VoidMain VoidMain) {
        this.VoidMain=VoidMain;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public StatementDeclList getStatementDeclList() {
        return StatementDeclList;
    }

    public void setStatementDeclList(StatementDeclList StatementDeclList) {
        this.StatementDeclList=StatementDeclList;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VoidMain!=null) VoidMain.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(StatementDeclList!=null) StatementDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VoidMain!=null) VoidMain.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(StatementDeclList!=null) StatementDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VoidMain!=null) VoidMain.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(StatementDeclList!=null) StatementDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MainFuncDecl(\n");

        if(VoidMain!=null)
            buffer.append(VoidMain.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementDeclList!=null)
            buffer.append(StatementDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MainFuncDecl]");
        return buffer.toString();
    }
}
