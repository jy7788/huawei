package com.huawei;

import java.util.Scanner;
import java.util.Stack;


/**
 * 输入一串字符串，其中有普通的字符与括号组成（包括‘（’、‘）’、‘[’,']'）,
 * 要求验证括号是否匹配，如果匹配则输出0、否则输出1. 
 * Smple input：dfa(sdf)df[dfds(dfd)] 
 * Smple outPut:0
 * @author jy7788
 *
 */
public class huawei22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String str = in.next();
		if(run(str)){
			System.out.println(0);
		}else{
			System.out.println(1);
		}
	}
	
	public static boolean run(String str){
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<str.length();++i){
			String tmp = str.charAt(i)+"";
			if(("(").equals(tmp)||("[").equals(tmp)){
				stack.push(tmp);
			}
			if((")").equals(tmp)){
				if(!stack.pop().equals("(")){
					return false;
				}
			}else{
				if(("]").equals(tmp)){
					if(!stack.pop().equals("[")){
						return false;
					}
				}
			}
		}
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

}
