package test;

import java.util.Stack;

public class b020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,2,3,4,5};
		int[] b ={5,3,2,1,4};
		System.out.println(IsPopOrder(a,b));
	}
	
	/**
	 * ģ��ѹջ�Ĺ��̣���ջ��Ԫ���Ƴ�����popA��ջ��Ԫ�رȽϣ������ͬ������ѹ��Ԫ�ء������ͬ��popAָ��������һ�񣬽��űȽ�
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA.length==0||popA.length==0)
			return false;
		Stack<Integer> stack = new Stack<Integer>();
		int m=0;
		for(int i=0;i<pushA.length;++i){
			stack.push(pushA[i]);
			while(judge(stack,popA[m])){
				stack.pop();
				m++;
				if(stack.isEmpty()){
					break;
				}
			}
		}
		if(!stack.isEmpty())
			return false;
		else
			return true;
	}
	
	private static boolean judge(Stack<Integer> stack,int m){
		int tmp = stack.pop();
		stack.push(tmp);
		if(tmp==m)
			return true;
		else
			return false;
	}
	
}
