package test;

import java.util.ArrayList;

public class b028 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,1,6,2,7,3,8};
		int k = 10;
		ArrayList<Integer> list = GetLeastNumbers_Solution(arr,k);
		if(list.isEmpty())
			System.out.println("null");
		for(int i=0;i<list.size();++i){
			System.out.println(list.get(i));
		}
	}
	
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	int len = input.length;
    	build_heap(input,0,len);
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if(k>len)
    		return list;
		for(int i=0;i<k;++i){
			int tmp=input[0];
			list.add(tmp);
			input[0]=input[len-i-1];//将最小的根节点和待排序的堆最后一个元素交换
			input[len-i-1]=tmp;
			shift_down(input,0,len-i-1,0);
		}
		return list;
    }
    
	public static void build_heap(int[] array,int from,int len){
		int i=(len-1)/2;//找到第一个非叶子节点
		for(;i>=0;--i){
			shift_down(array,from,len,i);
		}
	}
    
    public static void shift_down(int[] array,int from,int len,int i){
		int index=2*i+1;//左节点
		while(index<len){//index是不断向下调整，直到无法再往下
			if(index+1<len&&array[from+index]-array[from+index+1]>0){
				index +=1;//如果右节点存在且小于左节点，则选右节点
			}
			if(array[from+i]-array[from+index]>0){
				int tmp=array[from+i];
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
