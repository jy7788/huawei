package com.train;

import java.util.Scanner;

public class a001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<n+1;++i){
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			System.out.print("Case #"+i+": ");
			if(a+b>c)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}

}
