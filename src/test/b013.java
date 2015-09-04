package test;

import java.util.ArrayList;
import java.util.List;

public class b013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3,4,5,6,7,8,9};
		reOrderArray(array);
		for(int i=0;i<array.length;++i){
			System.out.print(array[i]+" ");
		}
	}
	
    public static void reOrderArray(int [] array) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<array.length;++i){
        	if(array[i]%2==0){
        		b.add(array[i]);
        	}else{
        		a.add(array[i]);
        	}
        }
        for(int i=0;i<a.size();++i){
        	array[i]=a.get(i);
        }
        for(int i=a.size();i<array.length;++i){
        	array[i]=b.get(i-a.size());
        }
    }

}
