// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ProgramDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private ProgramNameDecl ProgramNameDecl;
    private GlobalObjectDeclList GlobalObjectDeclList;
    private CustomFuncDeclList CustomFuncDeclList;
    private MainFuncDecl MainFuncDecl;
    private CustomFuncDeclList CustomFuncDeclList1;

    public ProgramDecl (ProgramNameDecl ProgramNameDecl, GlobalObjectDeclList GlobalObjectDeclList, CustomFuncDeclList CustomFuncDeclList, MainFuncDecl MainFuncDecl, CustomFuncDeclList CustomFuncDeclList1) {
        this.ProgramNameDecl=ProgramNameDecl;
        if(ProgramNameDecl!=null) ProgramNameDecl.setParent(this);
        this.GlobalObjectDeclList=GlobalObjectDeclList;
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.setParent(this);
        this.CustomFuncDeclList=CustomFuncDeclList;
        if(CustomFuncDeclList!=null) CustomFuncDeclList.setParent(this);
        this.MainFuncDecl=MainFuncDecl;
        if(MainFuncDecl!=null) MainFuncDecl.setParent(this);
        this.CustomFuncDeclList1=CustomFuncDeclList1;
        if(CustomFuncDeclList1!=null) CustomFuncDeclList1.setParent(this);
    }

    public ProgramNameDecl getProgramNameDecl() {
        return ProgramNameDecl;
    }

    public void setProgramNameDecl(ProgramNameDecl ProgramNameDecl) {
        this.ProgramNameDecl=ProgramNameDecl;
    }

    public GlobalObjectDeclList getGlobalObjectDeclList() {
        return GlobalObjectDeclList;
    }

    public void setGlobalObjectDeclList(GlobalObjectDeclList GlobalObjectDeclList) {
        this.GlobalObjectDeclList=GlobalObjectDeclList;
    }

    public CustomFuncDeclList getCustomFuncDeclList() {
        return CustomFuncDeclList;
    }

    public void setCustomFuncDeclList(CustomFuncDeclList CustomFuncDeclList) {
        this.CustomFuncDeclList=CustomFuncDeclList;
    }

    public MainFuncDecl getMainFuncDecl() {
        return MainFuncDecl;
    }

    public void setMainFuncDecl(MainFuncDecl MainFuncDecl) {
        this.MainFuncDecl=MainFuncDecl;
    }

    public CustomFuncDeclList getCustomFuncDeclList1() {
        return CustomFuncDeclList1;
    }

    public void setCustomFuncDeclList1(CustomFuncDeclList CustomFuncDeclList1) {
        this.CustomFuncDeclList1=CustomFuncDeclList1;
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
        if(ProgramNameDecl!=null) ProgramNameDecl.accept(visitor);
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.accept(visitor);
        if(CustomFuncDeclList!=null) CustomFuncDeclList.accept(visitor);
        if(MainFuncDecl!=null) MainFuncDecl.accept(visitor);
        if(CustomFuncDeclList1!=null) CustomFuncDeclList1.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ProgramNameDecl!=null) ProgramNameDecl.traverseTopDown(visitor);
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.traverseTopDown(visitor);
        if(CustomFuncDeclList!=null) CustomFuncDeclList.traverseTopDown(visitor);
        if(MainFuncDecl!=null) MainFuncDecl.traverseTopDown(visitor);
        if(CustomFuncDeclList1!=null) CustomFuncDeclList1.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ProgramNameDecl!=null) ProgramNameDecl.traverseBottomUp(visitor);
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.traverseBottomUp(visitor);
        if(CustomFuncDeclList!=null) CustomFuncDeclList.traverseBottomUp(visitor);
        if(MainFuncDecl!=null) MainFuncDecl.traverseBottomUp(visitor);
        if(CustomFuncDeclList1!=null) CustomFuncDeclList1.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ProgramDecl(\n");

        if(ProgramNameDecl!=null)
            buffer.append(ProgramNameDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(GlobalObjectDeclList!=null)
            buffer.append(GlobalObjectDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CustomFuncDeclList!=null)
            buffer.append(CustomFuncDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MainFuncDecl!=null)
            buffer.append(MainFuncDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CustomFuncDeclList1!=null)
            buffer.append(CustomFuncDeclList1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ProgramDecl]");
        return buffer.toString();
    }
}
