package nanyang_acm;

import java.util.Scanner;
/**
 * 巴什博奕
 * @author jy7788
 *
 */
public class N23 {

	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=0;i<n;++i){
			int N=cin.nextInt();
			int M=cin.nextInt();
			if(N%(M+1)==0){//内置的取余运算效率更高
				System.out.println("Lose");
			}else{
				System.out.println("Win");
			}
		}
	}
	
}
