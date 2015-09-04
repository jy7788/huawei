package test;

public class b029 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, -2, 3, 10, -4, 7, 2, -5};
		System.out.println(FindGreatestSumOfSubArray(arr));
	}
	
    public static int FindGreatestSumOfSubArray(int[] array) {
    	if(array.length==0){
    		return 0;
    	}
    	if(array.length==1){
    		return array[0];
    	}
    	int tmp = 0,result = array[0];
    	for(int i=0;i<array.length;++i){
    		if(i==0){
    			tmp = array[0];
    		}else{
    			tmp =  tmp+array[i]>array[i]?tmp+array[i]:array[i];
    			if(result<tmp)
        			result = tmp;
    		}
    	}
        return result;
    }
    

}
