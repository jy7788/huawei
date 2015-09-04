package nanyang_acm;

import java.util.Scanner;

public class N29 {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=0;i<n;++i){
			int arr[]=new int[9];
			for(int j=0;j<9;++j){
				arr[j]=cin.nextInt();
			}
			run(arr);
		}
	}
	
	public static void run(int arr[]){
		for(int i=0;i<3;++i){
			for(int j=i;j<9;){
				if(j==i){
					System.out.print(arr[j]);
				}else
			        System.out.print(" "+arr[j]);	
			j +=3;
			}
			System.out.println();
		}
	}
}
