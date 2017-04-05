package univ.lecture;

/**
 * Created by tchi on 2017. 3. 19..
 */
public class Calculator {
    public int calculate(String exp) {
        return 2;
    }

    public String postfix(String infix) {
	boolean endON = false; 
	String stack = new Stack();

	for(int i=0; i<infix.length(); i++){
		switch(infix.charAt(i)) { //if num comeout add post at postfix
			case'0'; //if infix s char is '0'
			case'1';
			case'2';
			case'3';
			case'4';
			case'5';
			case'6';
			case'7';
			case'8';
			case'9';
			case'.';

			postfix = postfix.concat(infix.charAt(i) + "");
			endON = true;
			break;

			case'(': //if '(' appear, add ' ' and push to stack

			if(endON == true) {
				postfix = postfix.concat(" ");
				endON = false;
			}

			stack.push('(');
			break;
			
			case ')': //if ')' appear,  add ' ' and pop until '(' appear
			
			if(endON == true) {
				postfix = postfix.concat(" ");
				endON = false;
			}
			
			while(((Character) stack.peek()).charValue()!='('){
				postfix = postfix.concat(((Character) stack.pop()).toString());
				postfix = postfix.concat(" "); //add ' ' when pop
			}
			Object o = stack.pop(); // pop, if '(' comeout

			case '+';
			case '-';
			case '*';
			case '/';
			//if '+', '-', '*', '/' comeout add ' '.
			//if this operator is under the operator in the top stack, then pop and add

	}
		
    }

    public double calculator(String postfix) {
	    return 0.0;
    }

    public int precedence(char c) {
	    return 0;
    }

}
