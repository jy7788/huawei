package com.huawei;

import java.util.Arrays;

/**
 * ����һ������input[] ��������鳤��nΪ������������������Ԫ�طŵ� output[] �������м��λ�ã�������鳤��nΪż����������������Ԫ�طŵ� output
[] �����м�����λ��ƫ�ҵ��Ǹ�λ���ϣ�Ȼ���ٰ��Ӵ�С��˳�������ڵ�һ��λ�õ����ߣ�����һ��һ�ҵ�˳�����δ��ʣ�µ�����
      ���磺input[] = {3, 6, 1, 9, 7}   output[] = {3, 7, 9, 6, 1};             input[] = {3, 6, 1, 9, 7, 8}    output[] = {1, 6, 8, 9, 7, 3}
 * @author jy7788
 *
 */
public class huawei9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {3,6,1,9,7};  
        int output[] = new int[5];  
        huawei9 st = new huawei9();  
        st.sort(input, 5, output);  
        for(int i=0;i<output.length;i++){  
            System.out.print(output[i]);  
        }  
	}

	 void sort(int input[], int n, int output[]){
		 Arrays.sort(input);
		 int i,j;
		 i=output.length/2;
		 output[i]=input[input.length-1];
		 j=i+1;
		 i--;
		 boolean lastIsI=false;
		 for(int x=input.length-2;x>=0;--x){
			 if(lastIsI){
				 output[j]=input[x];
				 lastIsI=false;
				 j++;
			 }else{
				 output[i]=input[x];
				 lastIsI=true;
				 i--;
			 }
		 }
	 }
}
