package com.huawei;

import java.util.Scanner;
/**
 * 
 * 第一题，输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。从后向前比较，以最短字符串为标准，输出不同的元素的个数。
 * 例如:  输入：s1="1,3,5"   len1=3        s2="2,4,1,7,5"   len2=5  
 * 输出：2  
 * @author jy7788
 *
 */
public class huawei1 {

	public static void main(String[] args){
		String s1 = "1,3,5";  
        String s2 = "2,4,1,7,5";  
        int len1 = 3;  
        int len2 = 5;  
        huawei1 hwt = new huawei1();  
        System.out.println(hwt.getDiffNum(len1, s1, len2, s2));
	}
	
	public int getDiffNum(int len1, String s1, int len2, String s2){
		int len=0;
		int count=0;
		String[] array1=s1.split(",");
		String[] array2=s2.split(",");
		if(len1>len2) len=len2;
		else
			len=len1;
		for(int i=0;i<len;++i){
			if(!array1[len1-1-i].equals(array2[len2-1-i]))
				count++;
		}
		return count;
	}
}
