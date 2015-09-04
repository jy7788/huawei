package com.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int B = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int r = 0;
		for(int i=0;i<str.length();++i){
			int tmp = Integer.parseInt(str.charAt(i)+"");
			list.add((r*10+tmp)/B);
			r = (r*10+tmp)%B;
		}
		int i=0;
		for(i=0;i<list.size();++i){
			if(list.get(i)!=0){
				break;
			}
		}
		if(i==list.size()){
			System.out.print(0);
		}else{
			for(;i<list.size();++i){
				System.out.print(list.get(i));
			}
		}
		System.out.println(" "+r);
	}

}
