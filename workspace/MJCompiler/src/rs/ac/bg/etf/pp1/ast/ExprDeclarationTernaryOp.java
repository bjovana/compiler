// generated with ast extension for cup
// version 0.8
// 10/2/2026 22:32:38


package rs.ac.bg.etf.pp1.ast;

public class ExprDeclarationTernaryOp extends ExprDecl {

    private ConditionDecl ConditionDecl;
    private Question Question;
    private ExprDecl ExprDecl;
    private Colon Colon;
    private ExprDecl ExprDecl1;

    public ExprDeclarationTernaryOp (ConditionDecl ConditionDecl, Question Question, ExprDecl ExprDecl, Colon Colon, ExprDecl ExprDecl1) {
        this.ConditionDecl=ConditionDecl;
        if(ConditionDecl!=null) ConditionDecl.setParent(this);
        this.Question=Question;
        if(Question!=null) Question.setParent(this);
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
        this.Colon=Colon;
        if(Colon!=null) Colon.setParent(this);
        this.ExprDecl1=ExprDecl1;
        if(ExprDecl1!=null) ExprDecl1.setParent(this);
    }

    public ConditionDecl getConditionDecl() {
        return ConditionDecl;
    }

    public void setConditionDecl(ConditionDecl ConditionDecl) {
        this.ConditionDecl=ConditionDecl;
    }

    public Question getQuestion() {
        return Question;
    }

    public void setQuestion(Question Question) {
        this.Question=Question;
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public Colon getColon() {
        return Colon;
    }

    public void setColon(Colon Colon) {
        this.Colon=Colon;
    }

    public ExprDecl getExprDecl1() {
        return ExprDecl1;
    }

    public void setExprDecl1(ExprDecl ExprDecl1) {
        this.ExprDecl1=ExprDecl1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionDecl!=null) ConditionDecl.accept(visitor);
        if(Question!=null) Question.accept(visitor);
        if(ExprDecl!=null) ExprDecl.accept(visitor);
        if(Colon!=null) Colon.accept(visitor);
        if(ExprDecl1!=null) ExprDecl1.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionDecl!=null) ConditionDecl.traverseTopDown(visitor);
        if(Question!=null) Question.traverseTopDown(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
        if(Colon!=null) Colon.traverseTopDown(visitor);
        if(ExprDecl1!=null) ExprDecl1.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionDecl!=null) ConditionDecl.traverseBottomUp(visitor);
        if(Question!=null) Question.traverseBottomUp(visitor);
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        if(Colon!=null) Colon.traverseBottomUp(visitor);
        if(ExprDecl1!=null) ExprDecl1.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprDeclarationTernaryOp(\n");

        if(ConditionDecl!=null)
            buffer.append(ConditionDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Question!=null)
            buffer.append(Question.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Colon!=null)
            buffer.append(Colon.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl1!=null)
            buffer.append(ExprDecl1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprDeclarationTernaryOp]");
        return buffer.toString();
    }
}
