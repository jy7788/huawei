package NUPT_ACM;

import java.util.Scanner;

public class run {

	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		FibonacciSequence ex=new NormalFibonacciSequence();
		System.out.println(ex.generate(n));
	}
}
