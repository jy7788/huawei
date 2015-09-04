package test;

public class b010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RectCover(3));
	}
	
	public static int RectCover(int target) {
		return run(target);
	}
	
	private static int run(int now){
		if(now==1||now==0){
			return 1;
		}
		return run(now-2)+run(now-1);
	}

}
