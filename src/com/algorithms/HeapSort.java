package com.algorithms;

public class HeapSort<E extends Comparable<E>> extends Sorter<E> {

	public void sort(E[] array,int from,int len){
		build_heap(array,from,len);
		for(int i=0;i<len;++i){
			E tmp=array[from];
			array[from]=array[from+len-i-1];//将最大的根节点和待排序的堆最后一个元素交换
			array[from+len-i-1]=tmp;
			shift_down(array,from,len-i-1,0);
		}
	}
	
	public void build_heap(E[] array,int from,int len){
		int i=(len-1)/2;//找到第一个非叶子节点
		for(;i>=0;--i){
			shift_down(array,from,len,i);
		}
	}
	
	public void shift_down(E[] array,int from,int len,int i){
		int index=2*i+1;//左节点
		while(index<len){//index是不断向下调整，直到无法再往下
			if(index+1<len&&array[from+index].compareTo(array[from+index+1])<0){
				index +=1;//如果右节点存在且大于左节点，则选右节点
			}
			if(array[from+i].compareTo(array[from+index])<0){
				E tmp=array[from+i];
				array[from+i]=array[from+index];
				array[from+index]=tmp;
				i=index;
				index=2*index+1;
			}else{
				break;//当节点满足堆排序条件时跳出
			}		
		}
	}
}
