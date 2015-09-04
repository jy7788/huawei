import java.io.*;
import java.util.*;
public class NOJ1003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		if(n==0){
			System.out.println(0);
		}
		else{
			if(n==1)
				System.out.println(1);
			else{
				int[] arr=new int[n+1];
				arr[0]=0;
				arr[1]=1;
				for(int i=2;i<=n;++i){
					arr[i]=arr[i-1]+arr[i-2];
				}
			System.out.println(arr[n]);
			}
		}
	}

}
