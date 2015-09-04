package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int[][] arr = new int[a][b];
		for(int i=0;i<a;++i){
			for(int j=0;j<b;++j){
				arr[i][j] = in.nextInt();
			}
		}
		ArrayList<Integer> list = printMatrix(arr);
		for(Integer c:list){
			System.out.print(c+" ");
		}
	}
	
	 public static ArrayList<Integer> printMatrix(int [][] matrix) {
	       int a=0,b=0,c=matrix.length-1,d=matrix[0].length-1;
	        ArrayList<Integer> list = new ArrayList<Integer>();
			while(a<c&&b<d){
				for(int i=b;i<d;++i){
	                list.add(matrix[a][i]);
				}
	            for(int i=a;i<c;++i){
	                 list.add(matrix[i][d]);
	            }
	            for(int i=d;i>b;--i){
	                 list.add(matrix[c][i]);
	            }
	            for(int i=c;i>a;--i){
	                 list.add(matrix[i][b]);
	            }
				a++;
				b++;
				c--;
				d--;
			}
			if(a==c&&b<d){
				for(int i=b;i<=d;++i){
					list.add(matrix[a][i]);
				}
			}
			if(b==d&&a<c){
				for(int i=a;i<=c;++i){
					list.add(matrix[i][b]);
				}
			}
			if(a==c&&b==d){
				list.add(matrix[a][b]);
			}
	        return list;
	    }

}
