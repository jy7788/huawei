package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ������һ��ֻ����ƴ�����ַ������������Ӧ���������С�ת����ϵ���£�
 *������      ƴ��        yi  er  san  si  wu  liu  qi  ba  jiu
 *����������        1   2   3      4   5    6    7   8   9
 *�����ַ�ֻ����Сд��ĸ�������ַ�����������ƥ��
 *�������룺       yiersansi
 *���������       1234
 * @author jy7788
 *
 */
public class huawei5 {

	String[] array={"","yi","er","san","si","wu","liu","qi","ba","jiu"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.next();
		run(str);
	}

	public static void run(String str){
		String result="";
		for(int i=0;i<str.length();++i){
			String tmp=str.charAt(i)+"";
			if(("l").equals(tmp)){
				result +="6";
				i=i+2;
			}else{
				if(("j").equals(tmp)){
					result +="9";
					i=i+2;
				}else{
				if(("s").equals(tmp)){
					String tmp_=str.charAt(i+1)+"";
					if(("a").equals(tmp_)){
						result +="3";
						i=i+2;
					}else{
						result +="4";
						i++;
					}
				}else{
					if(("w").equals(tmp)){
						result +="5";
					}
					if(("e").equals(tmp)){
						result +="2";
					}
					if(("y").equals(tmp)){
						result =result+"1";
					}
					if(("q").equals(tmp)){
						result +="7";
					}
					if(("b").equals(tmp)){
						result +="8";
					}
					i++;
				}
			}
		}
	}
	System.out.println(result);
	return;
	}
}
