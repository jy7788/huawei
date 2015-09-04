package test;

public class b034 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,5};
		System.out.println(InversePairs(arr));
	}
	
    public static int InversePairs(int [] array) {
        int count = 0;
        for(int i=0;i<array.length-1;++i){
        	for(int j=i+1;j<array.length;++j){
        		if(array[i]>array[j])
        			count++;
        	}
        }
        return count;
    }

}
