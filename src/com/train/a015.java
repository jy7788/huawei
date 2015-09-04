package com.train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class a015 {

	public int data;
	public String address,next;
	
	public a015(String address,int data,String next){
		this.address = address;
		this.data = data;
		this.next = next;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String head = in.next();
		int N = in.nextInt();
		int K = in.nextInt();
		String a,c;
		int b;
		Map<String,a015> map = new HashMap<String,a015>();
		for(int i=0;i<N;++i){
			a = in.next();
			b = in.nextInt();
			c = in.next();
			map.put(a, new a015(a,b,c)) ;
		}
		List<String> arr = sort(head,map);
		int k1 = K;
		while(k1<=arr.size()){
			if(k1==arr.size()){
				map.get(arr.get(k1-K)).next="-1";
			}else{
				map.get(arr.get(k1-K)).next=map.get(arr.get(k1)).address;
			}
			for(int i=1;i<K;++i){
				map.get(arr.get(k1-K+i)).next=map.get(arr.get(k1-K+i-1)).address;
			}
			k1 +=K;
		}
		if(K<=arr.size()){
			arr = sort(map.get(arr.get(K-1)).address,map);
		}
		for(int i=0;i<arr.size();++i){
			System.out.println(map.get(arr.get(i)).address+" "+map.get(arr.get(i)).data+" "+map.get(arr.get(i)).next);
		}
	}
	
	private static List<String> sort(String head,Map<String,a015> arr){
		List<String> addr = new ArrayList<String>();
		for(int i=0;i<arr.size();++i){
			addr.add(head);
			head = arr.get(head).next;
			if(head.equals("-1"))
				break;
		}
		return addr;
	}

}
