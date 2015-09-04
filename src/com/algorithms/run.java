package com.algorithms;


public class run {
	
	public static void main(String[] args){
		  Sorter<Integer> ex=new HeapSort<Integer>();
		  Integer[] arr={4,2,5,3,6,1,8,7,10,9};
		  ex.sort(arr,0,10);
		  for(Integer i:arr){
			  System.out.print(i+" ");
		  }
	  }
}
