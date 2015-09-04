package com.algorithms;

public class InsertSort<E extends Comparable<E>> extends Sorter<E>{

	public void sort(E[] array, int from, int len){
		E tmp=null;
		int j;
		for(int i=from+1;i<from+len;++i){
			tmp=array[i];
			for(j=i-1;j>=from;--j){
				if(tmp.compareTo(array[j])<0){
					array[j+1]=array[j];
				}else{
					break;
				}
			}
			array[j+1]=tmp;
		}
	}
	
	public void modify_sort(E[] array, int from, int len,int k){
		if(len<=1) return;
		E tmp=null;
		int j;
		for(int i=from+k;i<from+len;i=i+k){
			tmp=array[i];
			for(j=i-k;j>=from;j=j-k){
				if(tmp.compareTo(array[j])<0){
					array[j+k]=array[j];
				}else{
					break;
				}
			}
			array[j+k]=tmp;
		}
	}
	
	  public static void main(String[] args){
		  InsertSort<Integer> ex=new InsertSort<Integer>();
		  Integer[] arr={4,2,5,3,6,1};
		  ex.sort(arr,0,6);
		  for(Integer i:arr){
			  System.out.print(i+" ");
		  }
	  }
}
