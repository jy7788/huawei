package com.huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * 编程的时候，if条件里面的“(”、“)”括号经常出现不匹配的情况导致编译不过，
 * 请编写程序检测输入一行if语句中的圆括号是否匹配正确。
 * 同时输出语句中出现的左括号和右括号数量，
 * 如if((a==1)&&(b==1))是正确的，而if((a==1))&&(b==1))是错误的。
 * 注意if语句的最外面至少有一对括号。提示：用堆栈来做。  
 * 输入：if((a==1)&&(b==1)) 输出：RIGTH 3 3 
 * 输入：if((a==1))&&(b==1)) 输出：WRONG 3 4
 * @author jy7788
 *
 */
public class huawei28 {

	static int a,b;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String str = in.next();
		if(run(str)){
			System.out.println("RIGHT "+a+" "+b);
		}else{
			System.out.println("WRONG "+a+" "+b);
		}
	}
	
	public static boolean run(String str){
		Stack<String> stack = new Stack<String>();
		boolean flag = true;
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)=='('){
				a++;
				stack.push(str.charAt(i)+"");
			}
			if(str.charAt(i)==')'){
				b++;
				if(stack.isEmpty()){
					flag = false;
				}else{
					if(stack.pop()==")"){
						flag = false;
					}
				}		
			}
		}
		if(!stack.isEmpty())
			flag = false;
		return flag;
	}

}
