package com.algorithms;

public class BubbleSort<E extends Comparable<E>> extends Sorter<E> {

	public void sort(E[] array, int from, int len){
		for(int i=len-1;i>=from;--i){
			for(int j=from;j<=from+i-1;++j){
				if(array[j].compareTo(array[j+1])>0){
					E tmp= array[j+1];
					array[j+1]=array[j];
					array[j]=tmp;
				}
			}
		}
	}
	
}
