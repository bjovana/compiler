// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class CustomFuncDeclarationsList extends CustomFuncDeclList {

    private CustomFuncDeclList CustomFuncDeclList;
    private CustomFuncDecl CustomFuncDecl;

    public CustomFuncDeclarationsList (CustomFuncDeclList CustomFuncDeclList, CustomFuncDecl CustomFuncDecl) {
        this.CustomFuncDeclList=CustomFuncDeclList;
        if(CustomFuncDeclList!=null) CustomFuncDeclList.setParent(this);
        this.CustomFuncDecl=CustomFuncDecl;
        if(CustomFuncDecl!=null) CustomFuncDecl.setParent(this);
    }

    public CustomFuncDeclList getCustomFuncDeclList() {
        return CustomFuncDeclList;
    }

    public void setCustomFuncDeclList(CustomFuncDeclList CustomFuncDeclList) {
        this.CustomFuncDeclList=CustomFuncDeclList;
    }

    public CustomFuncDecl getCustomFuncDecl() {
        return CustomFuncDecl;
    }

    public void setCustomFuncDecl(CustomFuncDecl CustomFuncDecl) {
        this.CustomFuncDecl=CustomFuncDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CustomFuncDeclList!=null) CustomFuncDeclList.accept(visitor);
        if(CustomFuncDecl!=null) CustomFuncDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CustomFuncDeclList!=null) CustomFuncDeclList.traverseTopDown(visitor);
        if(CustomFuncDecl!=null) CustomFuncDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CustomFuncDeclList!=null) CustomFuncDeclList.traverseBottomUp(visitor);
        if(CustomFuncDecl!=null) CustomFuncDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CustomFuncDeclarationsList(\n");

        if(CustomFuncDeclList!=null)
            buffer.append(CustomFuncDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CustomFuncDecl!=null)
            buffer.append(CustomFuncDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CustomFuncDeclarationsList]");
        return buffer.toString();
    }
}
