package com.huawei;

import java.util.Scanner;

/**
 * 10��ѧ��������ĩ����������ɺ�A��ʦ��Ҫ���������ߣ�Ҫ�����£� (1) ��������
10�ı�����
  (2) ��֤������60%��ѧ������  (3) ������е�ѧ��������60�֣��򼰸���Ϊ60��
 * @author jy7788
 *
 */
public class huawei17 {

	static int[] line = {100,10,20,30,40,50,60,70,80,90};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;++i){
			arr[i] = in.nextInt();
		}
		System.out.println(run(arr));
	}
	
	public static int run(int[] arr){
		int[] stand = new int[arr.length];
		for(int i=0;i<arr.length;++i){
			int tmp = arr[i]/10;
			switch(tmp){
			case 10: 
			case 9: 
			case 8: 
			case 7: 
			case 6: stand[6]++;
			break;
			case 1: stand[1]++;
			break;
			case 2: stand[2]++;
			break;
			case 3: stand[3]++;
			break;
			case 4: stand[4]++;
			break;
			case 5: stand[5]++;
			break;
			}
		}
		int people = 6;
		int count = 0;
		for(int i=6;i>0;--i){
			count +=stand[i];
			if(count>=people)
				return line[i];
		}
		return line[1];
	}

}
