// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class CustomFuncDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private FunctionType FunctionType;
    private OptionalParamsDecl OptionalParamsDecl;
    private VarDeclList VarDeclList;
    private StatementDeclList StatementDeclList;

    public CustomFuncDecl (FunctionType FunctionType, OptionalParamsDecl OptionalParamsDecl, VarDeclList VarDeclList, StatementDeclList StatementDeclList) {
        this.FunctionType=FunctionType;
        if(FunctionType!=null) FunctionType.setParent(this);
        this.OptionalParamsDecl=OptionalParamsDecl;
        if(OptionalParamsDecl!=null) OptionalParamsDecl.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.StatementDeclList=StatementDeclList;
        if(StatementDeclList!=null) StatementDeclList.setParent(this);
    }

    public FunctionType getFunctionType() {
        return FunctionType;
    }

    public void setFunctionType(FunctionType FunctionType) {
        this.FunctionType=FunctionType;
    }

    public OptionalParamsDecl getOptionalParamsDecl() {
        return OptionalParamsDecl;
    }

    public void setOptionalParamsDecl(OptionalParamsDecl OptionalParamsDecl) {
        this.OptionalParamsDecl=OptionalParamsDecl;
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
        if(FunctionType!=null) FunctionType.accept(visitor);
        if(OptionalParamsDecl!=null) OptionalParamsDecl.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(StatementDeclList!=null) StatementDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FunctionType!=null) FunctionType.traverseTopDown(visitor);
        if(OptionalParamsDecl!=null) OptionalParamsDecl.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(StatementDeclList!=null) StatementDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FunctionType!=null) FunctionType.traverseBottomUp(visitor);
        if(OptionalParamsDecl!=null) OptionalParamsDecl.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(StatementDeclList!=null) StatementDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CustomFuncDecl(\n");

        if(FunctionType!=null)
            buffer.append(FunctionType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalParamsDecl!=null)
            buffer.append(OptionalParamsDecl.toString("  "+tab));
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
        buffer.append(") [CustomFuncDecl]");
        return buffer.toString();
    }
}
