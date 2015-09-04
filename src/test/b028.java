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
			input[0]=input[len-i-1];//����С�ĸ��ڵ�ʹ�����Ķ����һ��Ԫ�ؽ���
			input[len-i-1]=tmp;
			shift_down(input,0,len-i-1,0);
		}
		return list;
    }
    
	public static void build_heap(int[] array,int from,int len){
		int i=(len-1)/2;//�ҵ���һ����Ҷ�ӽڵ�
		for(;i>=0;--i){
			shift_down(array,from,len,i);
		}
	}
    
    public static void shift_down(int[] array,int from,int len,int i){
		int index=2*i+1;//��ڵ�
		while(index<len){//index�ǲ������µ�����ֱ���޷�������
			if(index+1<len&&array[from+index]-array[from+index+1]>0){
				index +=1;//����ҽڵ������С����ڵ㣬��ѡ�ҽڵ�
			}
			if(array[from+i]-array[from+index]>0){
				int tmp=array[from+i];
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
