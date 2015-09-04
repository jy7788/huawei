package com.algorithms;

public class FastSort<E extends Comparable<E>> extends Sorter<E> {

	public void sort(E[] array,int from,int len){
		sort_(array,from,from+len-1);
	}
	
	private void sort_(E[] array,int low,int high){
		int i=low;
		int j=high+1;
		E middle=array[low];
		E tmp;
		if(low<high){
			while(i<j){
				i++;
				j--;
				while(array[i].compareTo(middle)<0&&i<high){
					i++;
				}
				while(array[j].compareTo(middle)>=0&&j>low){
					j--;
				}
				if(i<j){//当i小于j时再交换
					tmp=array[j];
					array[j]=array[i];
					array[i]=tmp;
				}
			}
			array[low]=array[j];
			array[j]=middle;
			sort_(array,low,j-1);
			if(j!=high)//当排序到上界时，j+1可能越界，在这里进行过滤
			    sort_(array,j+1,high);
			else
				sort_(array,j,high);
		}
	}
}
