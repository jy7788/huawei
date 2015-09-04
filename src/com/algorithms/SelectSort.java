package com.algorithms;

public class SelectSort<E extends Comparable<E>> extends Sorter<E> {
	
	public void sort(E[] array,int from,int len){
		int min;
		E tmp;
		for(int i=from;i<from+len;++i){
			min=i;
			for(int j=i+1;j<from+len;++j){
				if(array[min].compareTo(array[j])>0){
					min=j;
				}
			}
			if(i!=min){
			tmp=array[min];
			array[min]=array[i];
			array[i]=tmp;
			}
		}
	}
	
}
