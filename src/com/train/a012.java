package com.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int D = in.nextInt();
		int C = A+B;
		List<Integer> list = new ArrayList<Integer>();
		while(C!=0){
			list.add(C%D);
			C = C/D;
		}
		for(int i=list.size()-1;i>=0;--i){
			System.out.print(list.get(i));
		}
	}

}
