package nanyang_acm;

import java.util.Scanner;

/**
 * Ѱ�����������
 * @author jy7788
 *
 */
public class N24 {

	public static void main(String[] args){//main��������static���η��Ļ�����ʱ���޷�ʵ����main���ڵ���
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=0;i<n;++i){
			int M=cin.nextInt();
			run(M);
		}
	}
	
	public static void run(int m){
		if(judge(m)){
			System.out.println(m+" "+0);
			return;
		}
		int i=1;
		while(true){
			if(m-i>0){
				if(judge(m-i)){
					System.out.println(m-i+" "+i);
					return;
				}
			}
			if(judge(m+i)){
				System.out.println(m+i+" "+i);
				return;
			}
			i++;
		}
	}
	/**
	 * �����жϣ���2-����m��Χ�ڵ���������Ϊm����ʱΪ����
	 * @param m
	 * @return
	 */
	public static boolean judge(int m){
		if(m==1)//1��������
			return false;
		for(int i=2;i<=Math.sqrt(m);++i){//�ø��ű���/2�ܽ�ʡ����������ʱ��
			if(m%i==0){
				return false;
			}
		}
		return true;
	}
}
