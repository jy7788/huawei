package com.huawei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


/**
 * starttimmer: 1, 1000

����һ����ʱ������IDΪ1����ʱʱ��timeΪ1000ms

ע����ʱ��ID������֤�Ǹ���������ʱʱ��һ��Ϊ������

 

ֹͣ��ʱ����stoptimmer: ID

������

stoptimmer: 1

ֹͣһ��IDΪ1�Ķ�ʱ��

ע����ʱ��ID������֤�Ǹ����������ֹͣ�Ķ�ʱ��ID�����ڣ�����ԡ�

 

��ȥʱ����elapse: time

������

elapse: 1000

ʱ����ȥ1000ms

ע��������֤ʱ��һ��Ϊ������

 

�������

end

 

�����

������˳�������û��ֹͣ�Ķ�ʱ������IDΪ1�Ķ�ʱ������1000ms�Ž���

timer: 1, 1000

������ж�ʱ����ֹͣ�ˣ����none

none
 * @author jy7788
 *
 */
public class huawei12 {

	private static HashMap<String, Integer> timer=new HashMap<String, Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
        String str;  
        str = in.nextLine();
        while(!("end").equals(str)){
        	if(str.startsWith("starttimer")){
        		start(str);
        	}
        	if(str.startsWith("stoptimer")){
        		stop(str);
        	}
        	if(str.startsWith("elapse")){
        		elapse(str);
        	}
        	str = in.nextLine();
        }
        Iterator iter =timer.entrySet().iterator();
        int count=0;
    	while(iter.hasNext()){
    			Map.Entry entry = (Map.Entry) iter.next();
    			Integer tmp=(Integer) entry.getValue();
    			String key=(String) entry.getKey();
    			System.out.println("time: "+key+","+tmp);
    			count++;
    	}
    	if(count==0){
    		System.out.println("none");
    	}
	}
	
	public static void start(String str){
		String id=str.substring(str.indexOf(':')+1, str.indexOf(',')).trim();
		Integer time=Integer.parseInt(str.substring(str.indexOf(',')+1).trim());
		timer.put(id, time);
	}
	
	public static void stop(String str){
		String id=str.substring(':'+1).trim();
		timer.remove(id);
	}
	
	public static void elapse(String str){
		Integer time=Integer.parseInt(str.substring(str.indexOf(':')+1).trim());
		Iterator iter =timer.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			Integer tmp=(Integer) entry.getValue();
			String key=(String) entry.getKey();
			if(tmp-time>0)
				entry.setValue(tmp-time);
			else{
				timer.remove(key);
			}
		}
	}

}
