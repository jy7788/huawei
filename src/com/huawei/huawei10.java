package com.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����ϵͳ����������⡣����ϵͳ�����Ϊϵͳ������û��������֡����У�ϵͳ��������ȼ� < 50���û���������ȼ� >= 50�� <= 255�����ȼ�����255��Ϊ�Ƿ���
��Ӧ�����޳�������һ�������task[]������Ϊn��task�е�Ԫ��ֵ��ʾ��������ȼ�����ֵԽС�����ȼ�Խ�ߡ�����schedulerʵ�����¹��ܣ���task[] �е�������ϵͳ�����û��������δ�ŵ� system_task[] ����� user_task[] �����У�������Ԫ�ص�ֵ��������task[] �����е��±꣩���������ȼ��ߵ���������ǰ�棬���ȼ���ͬ����������
��˳�����У�������ӵ���������ǰ�棩������Ԫ��Ϊ-1��ʾ������
      ���磺task[] = {0, 30, 155, 1, 80, 300, 170, 40, 99}    system_task[] = {0, 3, 1, 7, -1}    user_task[] = {4, 8, 2, 6, -1}
 * @author jy7788
 *
 */
public class huawei10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] task=new int[n];
		for(int i=0;i<n;++i){
			task[i]=in.nextInt();
		}
		int[] system_task=new int[n+1];
		int[] user_task=new int[n+1];
		huawei10 s=new huawei10();
		s.scheduler_(task,n,system_task,user_task);
		for(int i=0;i<system_task.length;++i){
			if(system_task[i]==-1)
				break;
			System.out.print(system_task[i]+" ");
		}
		System.out.println(-1);
		for(int i=0;i<user_task.length;++i){
			if(user_task[i]==-1)
				break;
			System.out.print(user_task[i]+" ");
		}
		System.out.println(-1);
	}

	void scheduler(int task[], int n, int system_task[], int user_task[]){
		int[] tmp=new int[n];
		for(int i=0;i<task.length;++i)
			tmp[i]=task[i];
		int[] tmp_=new int[n];
		Arrays.sort(task);
		for(int i=0;i<task.length;++i){
			for(int j=0;j<tmp.length;++j){
				if(tmp[j]==task[i]){
					tmp_[i]=j;
				}
			}
		}
		int i=0;
		while(task[i]<50&&i<task.length){
			system_task[i]=tmp_[i];
			i++;
		}
		system_task[i]=-1;
		int j=0;
		while(task[i]>=50&&i<task.length&&task[i]<255){
			user_task[j]=tmp_[i];
			i++;
			j++;
		}
		user_task[j]=-1;
	}
	
	void scheduler_(int task[], int n, int system_task[], int user_task[]){
		int s=0,u=0;
		for(int i=0;i<n;++i){
			int min=0;
			for(int j=0;j<n;++j){
				if(task[min]>task[j])
					min=j;
			}
			if(task[min]<50){
				system_task[s++]=min;
			}
			if(task[min]>=50&&task[min]<=255){
				user_task[u++]=min;
			}
			task[min]=300;
		}
		system_task[s]= -1;  
	    user_task[u] = -1; 
	}
}
