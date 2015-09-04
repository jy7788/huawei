package nanyang_acm;

import java.util.Scanner;

public class N90 {

	/**
	 * 整数划分
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		while((m--)!=0){
			int n=in.nextInt();
			System.out.println(run(n,n));
		}
	}
	
	public static int run(int n,int m){
		if(n==1||m==1) return 1;
		if(n==m) return 1+run(n,m-1);
		if(n<m) return run(n,n);
		//if(n>m) 
			return run(n-m,m)+run(n,m-1);
	}

}
