package test;

public class b012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(2.0,3));
	}
	
    public static double Power(double base, int exponent) {
        double b = base;
        boolean flag = true;
        if(exponent<0){
        	flag = false;
        	exponent = -exponent;
        }
        if(exponent==0)
        	return 1;
        for(int i=1;i<exponent;++i){
        	b *= base;
        }
        if(!flag){
        	return 1/b;
        }else{
            return b;
        }

    }

}
