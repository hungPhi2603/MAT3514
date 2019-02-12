//tinh gia tri bieu thuc hop le

package week3_LinkedList_Stack_Queue;

import java.util.Scanner;

public class FormulaEval {
	static Scanner sc= new Scanner(System.in);

	public double eval(String formula)
	{
		String[] tokens= formula.split(" ");
		StackInterface<String> stack1= new LinkedListStack<>();
		StackInterface<String> stack2= new LinkedListStack<>();
		
		for (int i = 0; i < tokens.length; i++) {
			if (isOperator(tokens[i])) {
				stack2.push(tokens[i]);
			} else {
				if (!tokens[i].equals("(") && !tokens[i].equals(")")) {
					stack1.push(tokens[i]);
				} else 
					if (tokens[i].equals(")")) {
						String op2= stack1.pop();
						String op1= stack1.pop();
						String o= stack2.pop();
						Double value= compute(op1, o, op2);
						stack1.push(value+ "");
					}
				
			}
		}
		
		return Double.parseDouble(stack1.pop());
	}
	
	public boolean isOperator(String o) {
		if (o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/")) {
			return true;
		}
		return false;
	}

	public double compute(String op1, String o, String op2) {
		if (o.equals("+"))
			return Double.parseDouble(op1) + Double.parseDouble(op2);
		if (o.equals("*")) {
			return Double.parseDouble(op1) * Double.parseDouble(op2);
		}
		if (o.equals("-")) {
			return Double.parseDouble(op1) - Double.parseDouble(op2);
		}
		if (o.equals("/")) {
			return Double.parseDouble(op1) / Double.parseDouble(op2);
		}
		return  0;
	}
	
	public static void main(String[] args) {
		String f= sc.nextLine();
		FormulaEval feval= new FormulaEval();
		System.out.println(feval.eval(f));
	}

}