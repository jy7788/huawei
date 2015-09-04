import java.util.*;
public class NOJ1002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		while(cin.hasNextInt()){
			int count=cin.nextInt();
			int max=0;int min=100;
			for(int i=0;i<count;++i){
			int a=cin.nextInt();
			if(a>max){
				max=a;
			}if(a<min){
				min=a;
			}
			}
			System.out.println(max+" "+min);
		}
	}

}
