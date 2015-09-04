import java.io.*;
import java.math.*;
import java.util.*;

public class NOJ1011{
	/**
	 * 
	 */
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String a=cin.next();
		String b=cin.next();
		fun(a,b);
	}
	
	private static void fun(String a,String b){
		BigInteger aa=new BigInteger(a);
		BigInteger bb=new BigInteger(b);
		System.out.println(aa.add(bb));
	}
}
