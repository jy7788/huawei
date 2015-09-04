package nanyang_acm;

import java.util.Scanner;

public class N56 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		for(int i=0;i<s;++i){
			int sum=0;
			int n=in.nextInt();
			int m=in.nextInt();
			while(true){
				sum +=n/m;
				n=n/m;
				if(n==0)
					break;
			}
			System.out.println(sum);
		}
	}

}
