package com.algorithms;

public class HeapSort<E extends Comparable<E>> extends Sorter<E> {

	public void sort(E[] array,int from,int len){
		build_heap(array,from,len);
		for(int i=0;i<len;++i){
			E tmp=array[from];
			array[from]=array[from+len-i-1];//�����ĸ��ڵ�ʹ�����Ķ����һ��Ԫ�ؽ���
			array[from+len-i-1]=tmp;
			shift_down(array,from,len-i-1,0);
		}
	}
	
	public void build_heap(E[] array,int from,int len){
		int i=(len-1)/2;//�ҵ���һ����Ҷ�ӽڵ�
		for(;i>=0;--i){
			shift_down(array,from,len,i);
		}
	}
	
	public void shift_down(E[] array,int from,int len,int i){
		int index=2*i+1;//��ڵ�
		while(index<len){//index�ǲ������µ�����ֱ���޷�������
			if(index+1<len&&array[from+index].compareTo(array[from+index+1])<0){
				index +=1;//����ҽڵ�����Ҵ�����ڵ㣬��ѡ�ҽڵ�
			}
			if(array[from+i].compareTo(array[from+index])<0){
				E tmp=array[from+i];
				array[from+i]=array[from+index];
				array[from+index]=tmp;
				i=index;
				index=2*index+1;
			}else{
				break;//���ڵ��������������ʱ����
			}		
		}
	}
}
