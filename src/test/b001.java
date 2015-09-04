package test;

import java.util.Scanner;

/**
 * ½£Ö¸offer
 * @author jy7788
 *
 */
public class b001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int[][] arr = new int[a][b];
		for(int i=0;i<a;++i){
			for(int j=0;j<b;++j){
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println(Find(arr,target));
	}
	
	public static boolean Find(int [][] array,int target) {
		if(array.length<=0||array[0].length<=0){
			return false;
		}
		if(target<array[0][0]||target>array[array.length-1][array[0].length-1]){
			return false;
		}
		int a = 0,b=0,c=array.length-1,d=array[0].length-1;
		if(find_(array,a,b,c,d,target)){
			return true;
		}else{
			return false;
		}
    }
	
	private static boolean find_(int[][] arr,int a,int b,int c,int d,int target){
		if(a>c||b>d){
			return false;
		}
		if(target==arr[a][d]){
			return true;
		}else{
			if(target>arr[a][d]){
				return find_(arr,a+1,b,c,d,target);
			}else{
				if(target<arr[a][d]){
					return	find_(arr,a,b,c,d-1,target);
				}
			}
		}
		return false;
	}
}
