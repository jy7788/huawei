package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ����һ����������12336544����1750��
 * Ȼ������һλ��ʼ�����������
 * ��������0�������������������ǲ����ظ����ֵģ�
 * ��������������456321��571��
 * ����Ǹ�������������-175�����-571��
 * @author jy7788
 *
 */
public class huawei26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String a = in.next();
		List<String> list= run(a);
		for(String c:list){
			System.out.print(c);
		}
	}
	
	public static List<String> run(String a){
		List<String> list = new ArrayList<String>();
		if(a.startsWith("-")){
			list.add("-");
			a = a.substring(1);
		}
		while(a.endsWith("0")){
			a = a.substring(0, a.length()-1);
		}
		char[] arr = a.toCharArray();
		list.add(arr[arr.length-1]+"");
		for(int i=arr.length-2;i>=0;--i){
			if(!list.get(list.size()-1).equals(arr[i]+"")){
				list.add(arr[i]+"");
			}
		}
		return list;
		
	}

}
