package com.huawei;

import java.util.Scanner;
import java.util.Stack;

public class huawei3 {

	/**
	 * 第三题，输入一个表达式，没有括号，数字小于0-9之间，输出计算结果，所有的中间结果化为整形。
	 * 例如:  输入：3+8×2/9-2 
	 *      输出：2    
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str ="3+8*2/9-2";
		System.out.println(getMyRet(str));
	}
	
	public static int getMyRet(String str){
		Stack<String> stack=new Stack<String>();
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)=='*'){
				int a=Integer.parseInt(stack.pop());
				String tmp=str.charAt(++i)+"";
				int b=Integer.parseInt(tmp);
				int c=a*b;
				stack.push(Integer.toString(c));
			}else{
				if(str.charAt(i)=='/'){
					int a=Integer.parseInt(stack.pop());
					String tmp=str.charAt(++i)+"";
					int b=Integer.parseInt(tmp);
					int c=a/b;
					stack.push(Integer.toString(c));
				}else{
					String tmp=str.charAt(i)+"";
					stack.push(tmp);
				}
			}
		}
		int result=0;
		Stack<String> stack_=new Stack<String>();
		while(!stack.isEmpty()){
			stack_.push(stack.pop());
		}
		while(!stack_.isEmpty()){
			String tmp=stack_.pop();
			if(("+").equals(tmp)){
				result +=Integer.parseInt(stack_.pop());
			}else{
				if(("-").equals(tmp)){
					result =result-Integer.parseInt(stack_.pop());
				}else{
					result=Integer.parseInt(tmp);
				}
			}
		}
		return result;
	}

}
