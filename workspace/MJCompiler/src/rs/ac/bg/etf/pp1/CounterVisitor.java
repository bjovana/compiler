package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.MethodParamDecl;
import rs.ac.bg.etf.pp1.ast.MethodParamsDecl;
import rs.ac.bg.etf.pp1.ast.VarDecl;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

/**
 * 
 */
public class CounterVisitor extends VisitorAdaptor {
	
	protected int count;
	
	public int getCount() {
		return count;
	}
	
	public static class MethodParamCounter extends CounterVisitor {
		
		public void visit(MethodParamDecl methodParamDecl) { 
			count++;
		}
		
		public void visit(MethodParamsDecl methodParamsDecl) {
			count++;
		}
		
	}
	
	public static class VarCounter extends CounterVisitor {
		
		public void visit(VarDecl VarDecl) { 
			count++;
		}
		
	}
	
}