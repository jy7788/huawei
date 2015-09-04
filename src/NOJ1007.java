import java.util.*;
import java.io.*;
public class NOJ1007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a,b,c,d;
		for(a=3;a<=n;++a){
			for(b=2;b<a;++b){
				for(c=b;c<a;++c){
					for(d=c;d<a;++d){
						if(a*a*a==b*b*b+c*c*c+d*d*d){
							System.out.println("Cube = "+a+", Triple = ("+b+","+c+","+d+")");
						}
					}
				}
			}
		}
	}

}
