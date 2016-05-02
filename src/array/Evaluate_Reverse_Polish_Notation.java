package array;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		String[] tokens = {"2", "1", "+", "3", "*"};
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {
		 
        int returnValue = 0;
 
        String operators = "+-*/";
 
        Stack<String> stack = new Stack<String>();
        try {
        for(String t : tokens){
        	/** Check if the token is an operator. If not, push the values into stack. */
            if(!operators.contains(t)){
                stack.push(t);
            }else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch(index){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        } catch (Exception e) {
        	System.out.println("Invalid polish expression!!!");
        	System.exit(0);
        }
        returnValue = Integer.valueOf(stack.pop());
 
        return returnValue;
 
    }
}
