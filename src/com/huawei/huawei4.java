package com.huawei;

import java.util.Scanner;

/**
 * 按要求分解字符串，输入两个数M，N；M代表输入的M串字符串，N代表输出的每串字符串的位数，不够补0。
 * 例如：输入2,8， “abc” ，“123456789”，则输出为“abc00000”,“12345678“,”90000000”
 * @author jy7788
 *
 */
public class huawei4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int M=in.nextInt();
		int N=in.nextInt();
		for(int i=0;i<M;++i){
			String str=in.next();
			run(N,str);
		}
		
	}
	
	public static void run(int len,String str ){
		if(len>=str.length()){
			for(int i=str.length();i<len;++i){
				str =str+"0";
			}
			System.out.println(str);
			return;
		}else{
			String tmp=str.substring(0, len);
			System.out.println(tmp);
			String tmp_="";
			for(int i=len;i<str.length();++i){
				tmp_ +=str.charAt(i);
			}
			run(len,tmp_);
		}
	}

}
