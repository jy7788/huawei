package nanyang_acm;
import java.util.*;
import java.io.*;
public class N26 {

	/**
	 * @param args
	 */
	private static ArrayList<Integer> prim=new ArrayList<Integer>();
    private static int[] a=new int[1000000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int m=cin.nextInt();
		fun();
		for(int i=0;i<m;++i){
			int n=cin.nextInt();
			int j=0;
			while(a[j]<=n){
				++j;
			}
			System.out.println(j-1);
		}
	}
	private static void fun(){
		int i,j;
		int sum=0;
		a[0]=0;
		prim.add(2);
		for(i=3;i<=1000000;++i){
			int k=(int)Math.sqrt(i);
			for(j=2;j<=k;++j){
				if(i%j==0)
					break;
			}
			if(j>k){
				if(i-prim.get(prim.size()-1)<=2){
					a[++sum]=i;
				}
				prim.add(i);
			}
		}
		a[sum+1]=1000000;	
		}
}
