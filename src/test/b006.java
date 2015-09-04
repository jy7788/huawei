package test;

public class b006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1};
		System.out.println(minNumberInRotateArray(arr));
	}
	
	public static int minNumberInRotateArray(int [] array) {
		 if(array.length==0){
			 return 0;
		 }
		 int start = 0;
		 int end = array.length-1;
		 return find(array,start,end);
    }
	 
	 private static int find(int[] array,int start,int end){
		 if(array[start]<array[end]){//数组是排序的
			 return array[start];
		 }
		 if(end-start==1||end==start){
			 return array[end];
		 }
		 int mid = (start+end)/2;
		 if(array[mid]==array[start]&&array[mid]==array[end]){
			 int tmp1 = find(array,start,mid);
			 int tmp2 = find(array,mid,end);
			 return tmp1<tmp2?tmp1:tmp2;
		 }
		 if(array[mid]>=array[0]){
			 return find(array,mid,end);
		 }else{
			 if(array[mid]<=array[0]){
				 return find(array,start,mid);
			 }
		 }
		 return 0;
	 }

}
