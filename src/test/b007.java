package test;

public class b007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(7));
	}
	
	 public static int Fibonacci(int n) {
		 int a=0,b=1;
		 if(n==0)
			 return a;
		 if(n==1)
			 return b;
		 for(int i=1;i<n;++i){
			 int tmp = b;
			 b = a+b;
			 a = tmp;
		 }
		 return b;
		 
	 }

}
