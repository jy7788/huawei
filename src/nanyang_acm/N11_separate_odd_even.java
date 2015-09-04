package nanyang_acm;
import java.io.*;
import java.util.*;
public class N11_separate_odd_even {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=0;i<n;++i){
			int x=cin.nextInt();
			for(int j=1;j<=x;++j){
				System.out.print(j+" ");
				++j;
			}
			System.out.println();
			for(int j=2;j<=x;++j){
				System.out.print(j+" ");
				++j;
			}
			System.out.println();
		}
	}

}
