package test;

public class b008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloor(5));
	}
	
	public static int JumpFloor(int target) {
		 return run(target,0);
    }
	 
	 private static int run(int n,int now){
		 if(n-now<=1){
			 return 1;
		 }
		 if(n-now>1){
			 return run(n,now+1)+run(n,now+2);
		 }
		 return -1;
	 }

}
