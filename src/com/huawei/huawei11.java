package com.huawei;

import java.util.Scanner;

/**
 * 1）  如果手机号码合法，返回0；
2）  如果手机号码长度不合法，返回1
3）  如果手机号码中包含非数字的字符，返回2；
4）  如果手机号码不是以86打头的，返回3；
【注】除成功的情况外，以上其他合法性判断的优先级依次降低。也就是说，如果判断出长度不合法，直接返回1即可，不需要再做其他合法性判断。
要求实现函数：
int s int verifyMsisdn(char* inMsisdn)
【输入】 char* inMsisdn，表示输入的手机号码字符串。
【输出】  无
【返回】  判断的结果，类型为int。
示例
输入：  inMsisdn = “869123456789“
输出：  无
返回：  1
输入：  inMsisdn = “8813912345678“
输出：  无
返回：  3
输入：  inMsisdn = “8613912345678“
输出：  无
返回：  0
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
