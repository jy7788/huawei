package com.huawei;

import java.util.Scanner;

/**
 * Ҫ��5������ѡȡ2������Ϊ���ǣ�����ÿ���˵���߷�ΧΪ160-190��
 * Ҫ��2���˵���߲�ֵ��С�������ֵ��ͬ�Ļ���ѡȡ������ߵ����ˣ���
 * ��������������˵���ߡ�
 * Smple input��161 189 167 172 188 Sample outPut: 188 189 
 * @author jy7788
 *
 */
public class huawei21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int[] inpu = new int[5];
		for(int i=0;i<5;++i){
			inpu[i] = in.nextInt();
		}
		int[] results = selectPeople(inpu);
		System.out.print(results[0]);
		for(int i=1;i<results.length;++i){
			System.out.print(" ");
			System.out.print(results[i]);
		}
	}
	
	public static int[] selectPeople(int[] arr){
		int[] results = new int[2];
		int gap = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;++i){
			for(int j=i+1;j<arr.length;++j){
				int a,b;
				if(arr[i]<arr[j]){
					a = arr[j];
					b = arr[i];
				}else{
					b = arr[j];
					a = arr[i];
				}
				if(a-b<gap){
					gap = a-b;
					results[0] = b;
					results[1] = a;
				}else{
					if(a-b==gap){
						if(results[0]<b){    //������ʱѡ��߽ϸߵ�һ��
							results[0] = b;
							results[1] = a;
						}
					}
				}
			}
		}
		return results;
	}

}
