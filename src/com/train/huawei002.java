package com.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		String fileName;
		String nameLine="";
		int index,tmp;
		while(in.hasNextLine()){
			String line = in.nextLine();
			index = line.indexOf(" ");
			tmp = line.lastIndexOf("\\");
			fileName = line.substring(tmp+1, index);
			nameLine = line.substring(tmp+1);//文件名加错误行
			if(list1.contains(nameLine)){
				int index_tmp = list1.indexOf(nameLine);
				list2.set(index_tmp,list2.get(index_tmp)+1);
			}else{
				list1.add(nameLine);
				list2.add(1);
			}
		}
		int max = 0,x=0;
		boolean[] flag = new boolean[list2.size()];
		for(int i=0;i<list2.size();++i){
			flag[i]=true;
		}
		for(int j=0;j<8;++j){
			for(int i=0;i<list2.size();++i){
				if(list2.get(i)>max&&flag[i]==true){
					max = list2.get(i);
					x = i;
				}
			}
			flag[x]=false;
			index = list1.get(x).indexOf(" ");
			tmp = list1.get(x).lastIndexOf("\\");
			fileName = list1.get(x).substring(tmp+1, index);
			if(fileName.length()>16){
				fileName = list1.get(x).substring(index-16, index);
			}
			String li = list1.get(x).substring(index+1);
			System.out.println(fileName+" "+li+" "+max);
			max = 0;
		}
		
	}

}
