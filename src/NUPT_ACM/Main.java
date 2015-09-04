package NUPT_ACM;

import java.util.Scanner;

public class Main {
	 public static void main (String args[]) throws Exception 
     {
		 Scanner cin=new Scanner(System.in);
			int n=cin.nextInt();
			System.out.println(generate(n));
			
     }
		public static int generate(int n){
			int p=0;
			int q=1;
			int tmp;
			if(n<1){
				return p;
			}else{
				if(n==1){
					return q;
				}else{
					for(int i=2;i<=n;++i){
						tmp=q;
						q=p+q;
						p=tmp;
					}
					return q;
				}
			}
		}
}
