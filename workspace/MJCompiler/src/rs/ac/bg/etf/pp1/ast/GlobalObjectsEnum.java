// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class GlobalObjectsEnum extends GlobalObjectDeclList {

    private GlobalObjectDeclList GlobalObjectDeclList;
    private EnumDecl EnumDecl;

    public GlobalObjectsEnum (GlobalObjectDeclList GlobalObjectDeclList, EnumDecl EnumDecl) {
        this.GlobalObjectDeclList=GlobalObjectDeclList;
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.setParent(this);
        this.EnumDecl=EnumDecl;
        if(EnumDecl!=null) EnumDecl.setParent(this);
    }

    public GlobalObjectDeclList getGlobalObjectDeclList() {
        return GlobalObjectDeclList;
    }

    public void setGlobalObjectDeclList(GlobalObjectDeclList GlobalObjectDeclList) {
        this.GlobalObjectDeclList=GlobalObjectDeclList;
    }

    public EnumDecl getEnumDecl() {
        return EnumDecl;
    }

    public void setEnumDecl(EnumDecl EnumDecl) {
        this.EnumDecl=EnumDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.accept(visitor);
        if(EnumDecl!=null) EnumDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.traverseTopDown(visitor);
        if(EnumDecl!=null) EnumDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(GlobalObjectDeclList!=null) GlobalObjectDeclList.traverseBottomUp(visitor);
        if(EnumDecl!=null) EnumDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GlobalObjectsEnum(\n");

        if(GlobalObjectDeclList!=null)
            buffer.append(GlobalObjectDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(EnumDecl!=null)
            buffer.append(EnumDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GlobalObjectsEnum]");
        return buffer.toString();
    }
}
