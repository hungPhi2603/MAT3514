package week3_LinkedList_Stack_Queue;

import java.util.Scanner;

public class ValidExpression {
	static Scanner sc= new Scanner(System.in);
	private static boolean check(String formula) {
		// TODO Auto-generated method stub
		String [] tokens= formula.split("");
		StackInterface<String> stack1= new LinkedListStack<>();
		for (int i = 0; i < tokens.length; i++) {
			
			if (tokens[i].equals("(")) {
				stack1.push(tokens[i]);
			} else if (tokens[i].equals(")")) {
				
				if (!stack1.isEmpty()) {
					stack1.pop();
				} else
					return false;
			}
		}
		
		if (stack1.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String f= sc.nextLine();
		System.out.println(check(f));
	}
}
