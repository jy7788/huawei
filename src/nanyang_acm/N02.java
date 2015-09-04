package nanyang_acm;

import java.util.Scanner;
import java.util.Stack;

/**
 * 括号配对问题,栈的使用
 * @author jy7788
 *
 */
public class N02 {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;++i){
			String s=in.next();
			char[] ch=s.toCharArray();
			if(run_(ch)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
	
	public static boolean run_(char[] ch){
		Stack<Character> tmp = new Stack<Character>();//java中的栈
		for(int i=0;i<ch.length;++i){
			if(ch[i]=='['||ch[i]=='('){
				tmp.push(ch[i]);
			}
			if(ch[i]==']'){
				if(!tmp.isEmpty()&&tmp.pop()=='['){
					continue;
				}else
					return false;
			}
			if(ch[i]==')'){
				if(!tmp.isEmpty()&&tmp.pop()=='('){
					continue;
				}else
					return false;
			}
		}
		if(tmp.isEmpty())
			return true;
		else
			return false;
	}
	
	public static boolean run(char[] ch){
		char[] tmp=new char[ch.length+1];
		tmp[0]='0';
		int j=1;
		tmp[j]=ch[0];
		if(tmp[j]==']'||tmp[j]==')')
			return false;
		for(int i=1;i<ch.length;++i){
			if(tmp[j]=='['){
				if(ch[i]==']'){
					j--;
				}else{
					tmp[++j]=ch[i];
				}
				continue;
			}
			if(tmp[j]=='('){
				if(ch[i]==')'){
					j--;
				}else{
					tmp[++j]=ch[i];
				}
				continue;
			}
			if(tmp[j]=='0'){
				tmp[++j]=ch[i];
			}
		}
		if(j>0){
			return false;
		}else
			return true;
	}
}
