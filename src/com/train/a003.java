package com.train;

import java.util.Scanner;

public class a003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int count = 0,flag=0;
		for(int i=2;i<Integer.MAX_VALUE;++i){
			if(judge(i)){
				count++;
				if(count>=M&&count<N){
					flag++;
					if(flag>0&&flag%10==0){
						System.out.println(i);
						flag=0;
					}else{
						System.out.print(i+" ");
					}
				}
				if(count==N){
					System.out.print(i);
				}
				if(count>N)
					break;
			}
		}
	}
	
	private static boolean judge(int n){
		for(int i=2;i<=Math.sqrt(n);++i){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
