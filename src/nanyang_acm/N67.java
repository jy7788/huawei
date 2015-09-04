package nanyang_acm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class N67 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		while(true){
			int x1=0,y1=0,x2=0,y2=0,x3=0,y3=0;
			 x1=in.nextInt();
			 y1=in.nextInt();
			 x2=in.nextInt();
			 y2=in.nextInt();
			 x3=in.nextInt();
			 y3=in.nextInt();			
		if(x1==0&&y1==0&&x2==0&&y2==0&&x3==0&&y3==0){
			break;
		}
		double area=(x1*y2+y1*x3+x2*y3)-(x1*y3+y2*x3+y1*x2);
		if(area<0){
			area=-area;
		}
		area = area*0.5;
		DecimalFormat df = new DecimalFormat ("0.0");
        System.out.println (df.format (area));
		}
	}
}
