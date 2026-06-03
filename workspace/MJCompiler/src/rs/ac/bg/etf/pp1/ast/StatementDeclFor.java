// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclFor extends StatementDecl {

    private Lparen Lparen;
    private ForConditionOpt ForConditionOpt;
    private ForDesignatorOpt ForDesignatorOpt;
    private Rparen Rparen;
    private ForStatementDecl ForStatementDecl;

    public StatementDeclFor (Lparen Lparen, ForConditionOpt ForConditionOpt, ForDesignatorOpt ForDesignatorOpt, Rparen Rparen, ForStatementDecl ForStatementDecl) {
        this.Lparen=Lparen;
        if(Lparen!=null) Lparen.setParent(this);
        this.ForConditionOpt=ForConditionOpt;
        if(ForConditionOpt!=null) ForConditionOpt.setParent(this);
        this.ForDesignatorOpt=ForDesignatorOpt;
        if(ForDesignatorOpt!=null) ForDesignatorOpt.setParent(this);
        this.Rparen=Rparen;
        if(Rparen!=null) Rparen.setParent(this);
        this.ForStatementDecl=ForStatementDecl;
        if(ForStatementDecl!=null) ForStatementDecl.setParent(this);
    }

    public Lparen getLparen() {
        return Lparen;
    }

    public void setLparen(Lparen Lparen) {
        this.Lparen=Lparen;
    }

    public ForConditionOpt getForConditionOpt() {
        return ForConditionOpt;
    }

    public void setForConditionOpt(ForConditionOpt ForConditionOpt) {
        this.ForConditionOpt=ForConditionOpt;
    }

    public ForDesignatorOpt getForDesignatorOpt() {
        return ForDesignatorOpt;
    }

    public void setForDesignatorOpt(ForDesignatorOpt ForDesignatorOpt) {
        this.ForDesignatorOpt=ForDesignatorOpt;
    }

    public Rparen getRparen() {
        return Rparen;
    }

    public void setRparen(Rparen Rparen) {
        this.Rparen=Rparen;
    }

    public ForStatementDecl getForStatementDecl() {
        return ForStatementDecl;
    }

    public void setForStatementDecl(ForStatementDecl ForStatementDecl) {
        this.ForStatementDecl=ForStatementDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Lparen!=null) Lparen.accept(visitor);
        if(ForConditionOpt!=null) ForConditionOpt.accept(visitor);
        if(ForDesignatorOpt!=null) ForDesignatorOpt.accept(visitor);
        if(Rparen!=null) Rparen.accept(visitor);
        if(ForStatementDecl!=null) ForStatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Lparen!=null) Lparen.traverseTopDown(visitor);
        if(ForConditionOpt!=null) ForConditionOpt.traverseTopDown(visitor);
        if(ForDesignatorOpt!=null) ForDesignatorOpt.traverseTopDown(visitor);
        if(Rparen!=null) Rparen.traverseTopDown(visitor);
        if(ForStatementDecl!=null) ForStatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Lparen!=null) Lparen.traverseBottomUp(visitor);
        if(ForConditionOpt!=null) ForConditionOpt.traverseBottomUp(visitor);
        if(ForDesignatorOpt!=null) ForDesignatorOpt.traverseBottomUp(visitor);
        if(Rparen!=null) Rparen.traverseBottomUp(visitor);
        if(ForStatementDecl!=null) ForStatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclFor(\n");

        if(Lparen!=null)
            buffer.append(Lparen.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ForConditionOpt!=null)
            buffer.append(ForConditionOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ForDesignatorOpt!=null)
            buffer.append(ForDesignatorOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Rparen!=null)
            buffer.append(Rparen.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ForStatementDecl!=null)
            buffer.append(ForStatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclFor]");
        return buffer.toString();
    }
}
