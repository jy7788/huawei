package com.huawei;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * �ڶ��⣬�����ַ������ȣ��ַ���������m����ǰ���������������m��Ԫ��ʱ��m��Ԫ�س��У�ͬʱ����Ԫ�ظ�ֵ��m��Ȼ�����һ��������ѭ����ֱ���������ֶ����У���������ȫ��Ϊ����0�����֡�������Ӷ��С�
 * ����:  ���룺len=4    str="3,1,2,4"   m=7 
 * �����2,3,1,4  
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
