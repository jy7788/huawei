package test;

import java.util.HashMap;
import java.util.Map;

public class b027 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,4,2,5,2,3};
		System.out.println(MoreThanHalfNum_Solution(arr));
	}
	
    public static int MoreThanHalfNum_Solution(int [] array) {
    	if(array.length==0)
    		return 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(array[0], 1);
        int n = array.length/2;
        for(int i =1;i<array.length;++i){
        	if(map.containsKey(array[i])){	
        		map.put(array[i], map.get(array[i])+1);
        		if(map.get(array[i])>n){
        			return array[i];
        		}
        	}else{
        		map.put(array[i], 1);
        	}
        }
        if(map.get(array[0])>n)
        	return array[0];
        else
        	return 0;
    }

}
