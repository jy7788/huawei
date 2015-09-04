import java.io.*;
import java.util.*;
import java.math.*;
public class NOJ1009 {

	/**
	 * @param args
	 */
	private static final int Max=2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		fun2(n);
	}
	//利用java大整数类BigInteger实现
	private static void fun1(int n){
		BigInteger a=BigInteger.valueOf(1);
		BigInteger b=BigInteger.valueOf(2);
		for(int i=0;i<n;++i){
			a=a.multiply(b);
		}
		System.out.println(a);
	}
	//传统利用数组实现大数
	private static void fun2(int n){
		int[] arr=new int[Max];
		arr[1999]=1;
		int index=1999;
		int temp,next = 0;
		for(int i=0;i<n;++i){
			for(int j=1999;j>=index;--j){
				temp=arr[j]*2+next;
				next=0;
				if(temp>9)
					next=1;
				arr[j]=temp%10;
			}
			if(next>0){
				--index;
				arr[index]=1;
			}
			next=0;
		}
		for(int i=index;i<Max;++i){
			System.out.print(arr[i]);
		}
	}

}
