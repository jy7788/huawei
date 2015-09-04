package com.algorithms;

import java.lang.reflect.Array;

public class MergeSort<E extends Comparable<E>> extends Sorter<E> {

	public void sort(E[] array,int from,int len){
		run(array,from,from+len-1);
	}
	
	public void run(E[] array,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			run(array,low,mid);
			run(array,mid+1,high);
			merge(array,low,mid,high);
		}
	}
	public void merge(E[]array,int low,int mid,int high){
		E[] R1= (E[])Array.newInstance(array[0].getClass(), high-low+1);
		int i=low,j=mid+1,p=0,k=0;
		while(i<mid+1&&j<=high)
		{
			if(array[i].compareTo(array[j])<0)
			{
				R1[k++]=array[i];
				i++;
			}
			else
			{
				R1[k++]=array[j];
				j++;
			}
		}
		while(i<mid+1)    //将比较后多出来的部分也放入临时数组中
		{
			R1[k++]=array[i++];
		}
		while(j<=high)
		{
			R1[k++]=array[j++];
		}
		for(int x=low;x<=high;++x)
		{
			array[x]=R1[p];
			++p;
		}
	}
}
