package com.huawei;

import java.util.Scanner;

/**
 * 1��  ����ֻ�����Ϸ�������0��
2��  ����ֻ����볤�Ȳ��Ϸ�������1
3��  ����ֻ������а��������ֵ��ַ�������2��
4��  ����ֻ����벻����86��ͷ�ģ�����3��
��ע�����ɹ�������⣬���������Ϸ����жϵ����ȼ����ν��͡�Ҳ����˵������жϳ����Ȳ��Ϸ���ֱ�ӷ���1���ɣ�����Ҫ���������Ϸ����жϡ�
Ҫ��ʵ�ֺ�����
int s int verifyMsisdn(char* inMsisdn)
�����롿 char* inMsisdn����ʾ������ֻ������ַ�����
�������  ��
�����ء�  �жϵĽ��������Ϊint��
ʾ��
���룺  inMsisdn = ��869123456789��
�����  ��
���أ�  1
���룺  inMsisdn = ��8813912345678��
�����  ��
���أ�  3
���룺  inMsisdn = ��8613912345678��
�����  ��
���أ�  0
 * @author jy7788
 *
 */
public class huawei11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String n=in.next();
		char[] inMsisdn=n.toCharArray();
		System.out.println(verifyMsisdn(inMsisdn));
	}
	
	public static int verifyMsisdn(char[] inMsisdn){
		if(inMsisdn.length!=13){
			return 1;
		}
		for(char c:inMsisdn){
			if(c<'0'||c>'9')
				return 2;
		}
		if(inMsisdn[0]!='8'||inMsisdn[1]!='6'){
			return 3;
		}
		return 0;
	}

}
