package test;

public class b011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int n=5;
		while(n!=0){
			n = n&(n-1);
			count++;
		}
	}

}
