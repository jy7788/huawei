package test;

public class b002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("We Are Happy.");
		System.out.println(replaceSpace(str));
	}
	
	public static String replaceSpace(StringBuffer str) {
    	while(str.indexOf(" ")!=-1){
    		int index = str.indexOf(" ");
    		str.replace(index, index+1, "%20");
    	}
    	return str.toString();
    }

}
