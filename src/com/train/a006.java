package com.train;

import java.util.Scanner;

public class a006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int DA = in.nextInt();
		int B = in.nextInt();
		int DB = in.nextInt();
		int pa = getP(A,DA);
		int pb = getP(B,DB);
		System.out.println(pa+pb);
	}
	
	private static int getP(int a,int da){
		int num=0;
		while(a>0){
			int tmp = a%10;
			if(tmp==da)
				num = num*10+tmp;
			a = a/10;
		}
		return num;
	}

}
