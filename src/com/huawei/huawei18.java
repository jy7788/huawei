package com.huawei;

import java.util.Scanner;

/**
 * 一条长廊里依次装有n(1 ≤ n ≤ 65535)盏电灯，从头到尾编号1、2、3、…n-1、n。每盏电灯由一个拉线开关控制。开始，电灯全部关着。 
 *  有n个学生从长廊穿过。第一个学生把号码凡是1的倍数的电灯的开关拉一下；
 *  接着第二个学生把号码凡是2的倍数的电灯的开关拉一下；
 *  接着第三个学生把号码凡是3的倍数的电灯的开关拉一下；
 *  如此继续下去，最后第n个学生把号码凡是n的倍数的电灯的开关拉一下。n个学生按此规定走完后，长廊里电灯有几盏亮着。
 *   注：电灯数和学生数一致
 * @author jy7788
 *
 */
public class huawei18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(run(n));
	}
	
	public static int run(int n){
		int count = 1;
		for(int i=2;i<n+1;++i){
			int tmp = 0;
			for(int j=2;j<i/2;++j){
				if(i%j==0)
					tmp++;
			}
			if(tmp==0){
				continue;
			}else{
				if(tmp%2==0){
					continue;
				}else{
					count++;
				}
			}
		}
		return count;
	}

}
