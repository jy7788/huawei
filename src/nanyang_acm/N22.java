package nanyang_acm;
import java.io.*;
import java.util.*;
public class N22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int m=cin.nextInt();
		for(int i=0;i<m;++i){
			int n=cin.nextInt();
			int sum=0;
			for(int j=0;j<n;++j){
				int a=cin.nextInt();
				if(fun(a)&&a!=1){
					sum +=a;
				}
			}
			System.out.println(sum);
		}
	}
	
	private static Boolean fun(int a){
		int k=(int)Math.sqrt(a);
		int i;
		for(i=2;i<=k;++i){
			if(a%i==0){
				break;
			}
		}
		if(i>k){
			return true;
		}
		else
			return false;
	}

}
