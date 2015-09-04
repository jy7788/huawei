package com.algorithms;

public abstract class Sorter<E extends Comparable<E>> {  //E一般用来表示集合类型中元素的类型，和T没有本质区别
    public abstract void sort(E[] array,int from ,int len);  
      
    public final void sort(E[] array)  
    {  
        sort(array,0,array.length);  
    }  
    protected final void swap(E[] array,int from ,int to)  
    {  
        E tmp=array[from];  
        array[from]=array[to];  
        array[to]=tmp;  
    }  
}  
