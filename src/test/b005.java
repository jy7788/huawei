package test;

import java.util.Stack;

public class b005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(1);
		push(2);
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		push(4);
		System.out.println(pop());
		push(5);
		System.out.println(pop());
		System.out.println(pop());
	}
	
	static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public static void push(int node) {
	        if(stack1.isEmpty()&&stack2.isEmpty()){
	        	stack1.push(node);
	        }else{
	        	stack2.push(node);
	        }
	    }
	    
	    public static int pop() {
	    	if(stack1.isEmpty()){
	    		while(!stack2.isEmpty()){
	    			stack1.push(stack2.pop());
	    		}
	    		return stack1.pop();
	    	}else{
	    		return stack1.pop();
	    	}
	    }

}
