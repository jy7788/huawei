package com.huawei;

import java.util.Scanner;

/**
 * ��Ҫ��ֽ��ַ���������������M��N��M���������M���ַ�����N���������ÿ���ַ�����λ����������0��
 * ���磺����2,8�� ��abc�� ����123456789���������Ϊ��abc00000��,��12345678��,��90000000��
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
