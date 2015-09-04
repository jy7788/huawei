package com.huawei;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 第二题，输入字符串长度，字符串，计数m。从前往后计数，当数到m个元素时，m个元素出列，同时将该元素赋值给m，然后从下一个数计数循环，直到所有数字都出列，给定的数全部为大于0的数字。输出出队队列。
 * 例如:  输入：len=4    str="3,1,2,4"   m=7 
 * 输出：2,3,1,4  
 * @author jy7788
 *
 */
public class huawei2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="3,1,2,4";
		int len=4;
		int m=7;
		huawei2 hua=new huawei2();
		System.out.println(hua.getOutString(len, str, m));
	}
	
	public String getOutString(int len, String str, int m){
		String[] array=str.split(",");
		String set="";
		List<String> list=new ArrayList<String>();
		for(int i=0;i<len;++i)
			list.add(array[i]);
		while(list.size()>0){
			int tmp=(m-1)%list.size();
			set +=list.get(tmp);
			m=Integer.parseInt(list.get(tmp))+tmp;
			list.remove(tmp);
		}
		return set;
	}

}
