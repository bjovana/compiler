package rs.ac.bg.etf.pp1.utils;

import rs.ac.bg.etf.pp1.CounterVisitor.MethodParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.mj.runtime.*;
import rs.etf.pp1.symboltable.*;
import rs.etf.pp1.symboltable.concepts.*;

public class CodeGeneratorUtils {

	public static void generateBuiltInsCode() {
		generateOrdOrChrBuiltIn("ord");
		generateOrdOrChrBuiltIn("chr");
		generateLen();
	}
	
	private static void generateOrdOrChrBuiltIn(String method) {

	    Obj ordObj = Tab.find(method);
	    ordObj.setAdr(Code.pc);

	    Code.put(Code.enter);
	    Code.put(1); 
	    Code.put(1); 

	    Code.put(Code.load_n); 
	    Code.put(Code.exit);
	    Code.put(Code.return_);
	}
	

	private static void generateLen() {

	    Obj lenObj = Tab.find("len");
	    lenObj.setAdr(Code.pc);

	    Code.put(Code.enter);
	    Code.put(1);
	    Code.put(1);

	    Code.put(Code.load_n);      
	    Code.put(Code.arraylength);

	    Code.put(Code.exit);
	    Code.put(Code.return_);
	}
	
	public static void enterMethod(SyntaxNode syntaxNode) {
		VarCounter varCounter = new VarCounter(); 
		syntaxNode.traverseTopDown(varCounter); 
		
		MethodParamCounter fpCounter = new MethodParamCounter(); 
		syntaxNode.traverseTopDown(fpCounter); 
		
		// Generate the entry 
		Code.put(Code.enter); 
		Code.put(fpCounter.getCount()); 
		Code.put(fpCounter.getCount() + varCounter.getCount());
	}
	
	public static void exitMethod() {
		Code.put(Code.exit); 
		Code.put(Code.return_);
	}
	
	public static void swap() {
	    Code.put(Code.dup_x1); 
	    Code.put(Code.pop); 
	}
	
	private CodeGeneratorUtils() {
		// Private constructor for preventing utils class instantiation
	}
}
