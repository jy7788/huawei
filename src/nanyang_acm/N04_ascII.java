package nanyang_acm;
import java.io.*;
import java.util.*;
public class N04_ascII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=0;i<n;++i){
			String a=cin.next();
			char[] arr=a.toCharArray();
			//Arrays.sort()函数的使用
			Arrays.sort(arr);
			for(char ch: arr){
				System.out.print(ch+" ");
			}
		}
	}

}
