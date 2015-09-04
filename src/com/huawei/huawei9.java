package com.huawei;

import java.util.Arrays;

/**
 * 给定一个数组input[] ，如果数组长度n为奇数，则将数组中最大的元素放到 output[] 数组最中间的位置，如果数组长度n为偶数，则将数组中最大的元素放到 output
[] 数组中间两个位置偏右的那个位置上，然后再按从大到小的顺序，依次在第一个位置的两边，按照一左一右的顺序，依次存放剩下的数。
      例如：input[] = {3, 6, 1, 9, 7}   output[] = {3, 7, 9, 6, 1};             input[] = {3, 6, 1, 9, 7, 8}    output[] = {1, 6, 8, 9, 7, 3}
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
