package nanyang_acm;
import java.io.*;
import java.util.*;
public class N13_fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int m=cin.nextInt();
		int[] arr=new int[20];
		arr[0]=0;
		arr[1]=1;
		for(int j=2;j<20;++j){
			arr[j]=arr[j-1]+arr[j-2];
		}
		for(int i=0;i<m;++i){
			int n=cin.nextInt();
			System.out.println(arr[n]);
		}
	}
}
