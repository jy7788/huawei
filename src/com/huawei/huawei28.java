package com.huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * ��̵�ʱ��if��������ġ�(������)�����ž������ֲ�ƥ���������±��벻����
 * ���д����������һ��if����е�Բ�����Ƿ�ƥ����ȷ��
 * ͬʱ�������г��ֵ������ź�������������
 * ��if((a==1)&&(b==1))����ȷ�ģ���if((a==1))&&(b==1))�Ǵ���ġ�
 * ע��if����������������һ�����š���ʾ���ö�ջ������  
 * ���룺if((a==1)&&(b==1)) �����RIGTH 3 3 
 * ���룺if((a==1))&&(b==1)) �����WRONG 3 4
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
