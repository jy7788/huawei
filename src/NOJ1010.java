import java.io.*;
import java.util.*;
public class NOJ1010 {

	/**
	 * @param args
	 */
	private static final int MAX=1010;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		fun1(n);
	}
	
	private static void fun1(int n){
		int[] arr=new int[MAX];
		arr[0]=1;
		for(int i=1;i<=n;++i){
			if(i%2==0){
				arr[i]=arr[i-1]+arr[i/2];
			}
			else
				arr[i]=arr[i-1];
		}
		System.out.println(arr[n]);
	}

}
