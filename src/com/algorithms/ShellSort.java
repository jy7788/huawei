package com.algorithms;

public class ShellSort<E extends Comparable<E>> extends Sorter<E> {

	public void sort(E[] array,int from,int len){
		int value=1;
		InsertSort<E> ex=new InsertSort<E>();
		while((value+1)*2<len){
			value=(value+1)*2-1;
		}
		for(int k=value;k>=1;k=(k+1)/2-1){
			for(int i=0;i<k;++i){
				ex.modify_sort(array, from+i, len-i, k);
			}
		}
	}
}
