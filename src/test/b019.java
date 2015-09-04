package test;

import java.util.Stack;

public class b019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Stack<Integer> stack = new Stack<Integer>();
	public void push(int node) {
	     stack.push(node);   
	}
	    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.get(0);
    }
    
    public int min() {
    	int min = Integer.MAX_VALUE;
        for(int i=0;i<stack.size();++i){
        	if(stack.get(i)<min){
        		min = stack.get(i);
        	}
        }
        return min;
    }

}
