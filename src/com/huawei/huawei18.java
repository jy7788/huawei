package com.huawei;

import java.util.Scanner;

/**
 * һ������������װ��n(1 �� n �� 65535)յ��ƣ���ͷ��β���1��2��3����n-1��n��ÿյ�����һ�����߿��ؿ��ơ���ʼ�����ȫ�����š� 
 *  ��n��ѧ���ӳ��ȴ�������һ��ѧ���Ѻ��뷲��1�ı����ĵ�ƵĿ�����һ�£�
 *  ���ŵڶ���ѧ���Ѻ��뷲��2�ı����ĵ�ƵĿ�����һ�£�
 *  ���ŵ�����ѧ���Ѻ��뷲��3�ı����ĵ�ƵĿ�����һ�£�
 *  ��˼�����ȥ������n��ѧ���Ѻ��뷲��n�ı����ĵ�ƵĿ�����һ�¡�n��ѧ�����˹涨����󣬳��������м�յ���š�
 *   ע���������ѧ����һ��
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
