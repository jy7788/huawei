package nanyang_acm;

import java.util.Scanner;

/**
 * 寻找最近的素数
 * @author jy7788
 *
 */
public class N24 {

	public static void main(String[] args){//main方法不用static修饰符的话运行时就无法实例化main所在的类
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=0;i<n;++i){
			int M=cin.nextInt();
			run(M);
		}
	}
	
	public static void run(int m){
		if(judge(m)){
			System.out.println(m+" "+0);
			return;
		}
		int i=1;
		while(true){
			if(m-i>0){
				if(judge(m-i)){
					System.out.println(m-i+" "+i);
					return;
				}
			}
			if(judge(m+i)){
				System.out.println(m+i+" "+i);
				return;
			}
			i++;
		}
	}
	/**
	 * 素数判断，当2-根号m范围内的数均不能为m整除时为质数
	 * @param m
	 * @return
	 */
	public static boolean judge(int m){
		if(m==1)//1不是质数
			return false;
		for(int i=2;i<=Math.sqrt(m);++i){//用根号比用/2能节省大量的运行时间
			if(m%i==0){
				return false;
			}
		}
		return true;
	}
}
