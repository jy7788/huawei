package com.train;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<N;++i){
			list.add(in.nextInt());
		}
		int A1=0,A2=0,A3=0,A5=0,count4=0,a4=0;
		int tmp=0;
		boolean flag = true,flag2 = false;//flag2标记是否有余为1的数
		for(Integer c:list){
			tmp = c;
			switch(tmp%5){
				case 0:if(tmp%2==0){
					A1 +=tmp;
				}
				break;
				
				case 1:flag2 = true;
					if(flag){
					A2 +=tmp;
					flag = false;
				}else{
					A2 -=tmp;
					flag = true;
				}
				break;
				
				case 2:A3++;
				break;
				
				case 3:count4++;
				a4 +=tmp;
				break;
				
				case 4:if(tmp>A5){
					A5 = tmp;
				}
				break;
			}
		}
		String A4 = "";
		if(count4>0){
			float temp = (float)a4/count4;
			DecimalFormat   fnum   =   new   DecimalFormat("##0.0");  
			A4=fnum.format(temp);
		}
		if(A1==0){
			System.out.print("N"+" ");
		}else{
			System.out.print(A1+" ");
		}
		
		if(!flag2){
			System.out.print("N"+" ");
		}else{
			System.out.print(A2+" ");
		}
		
		if(A3==0){
			System.out.print("N"+" ");
		}else{
			System.out.print(A3+" ");
		}
		
		if(count4==0){
			System.out.print("N"+" ");
		}else{
			System.out.print(A4+" ");
		}
		
		if(A5==0){
			System.out.print("N");
		}else{
			System.out.print(A5);
		}
	}
	
	private static int strToInt(String str){
		char[] arr = str.toCharArray();
		int num=0;
		for(int i=0;i<arr.length;++i){
			num =num*10+(arr[i]-48);
		}
		return num;
	}

}
