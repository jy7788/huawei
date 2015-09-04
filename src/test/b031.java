package test;

/**
 * 冒泡排序时将比较条件改为拼接后若调换一下更小，那么调换。
 * @author jy7788
 *
 */
public class b031 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,1,2,5};
		System.out.println(PrintMinNumber(arr));
	}
	
    public static String PrintMinNumber(int [] numbers) {
    	String[] arr = new String[numbers.length];
    	for(int i=0;i<numbers.length;++i){
    		arr[i] = Integer.toString(numbers[i]);
    	}
    	String result = "";
    	for(int i=arr.length-1;i>=0;--i){
    		for(int j=0;j<i;++j){
    			if(judge(arr[j],arr[j+1])){
    				String tmp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = tmp;
    			}
    		}
    	}
    	for(int i=0;i<arr.length;++i){
    		result +=arr[i];
    	}
    	return result;
    }
    
    private static boolean judge(String a,String b){
    	String tmp = a+b;
    	String tmp1 = b+a;
    	if(tmp.compareTo(tmp1)>=0){
    		return true;
    	}else{
    		return false;
    	}
    }

}
