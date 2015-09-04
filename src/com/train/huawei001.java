package com.train;

import java.util.Scanner;

public class huawei001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int N = in.nextInt();
			int M = in.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;++i){
				arr[i] = in.nextInt();
			}
			String[] a = new String[M];
			int[] b = new int[M];
			int[] c = new int[M];
			for(int i=0;i<M;++i){
				a[i] = in.next();
				b[i] = in.nextInt();
				c[i] = in.nextInt();	
			}
			for(int i=0;i<M;++i){
				if(a[i].equals("U")){
					arr[b[i]-1] = c[i];
				}else{
					int tmp = getMax(arr,b[i],c[i]);
					System.out.println(tmp);
				}
			}
		}
	}
	
	private static int getMax(int[] arr,int from,int to){
		int max = Integer.MIN_VALUE;
		if(from>to){
			int tmp = from;
			from = to;
			to = tmp;
		}
		for(int i=from-1;i<to;++i){
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}

}
