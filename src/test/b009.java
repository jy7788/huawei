package test;

public class b009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloorII(5));
	}
	
	public static int JumpFloorII(int target) {
		return run(target,0);
	}
	
	private static int run(int n,int now){
		 if(n-now<=1){
			 return 1;
		 }
		 if(n-now>1){
			 int tmp=0;
			 for(int i=0;i<n-now;++i){
				 tmp +=run(n,now+i+1);
			 }
			 return tmp;
		 }
		 return -1;
	 }

}
