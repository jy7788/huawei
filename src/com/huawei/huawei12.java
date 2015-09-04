package com.huawei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


/**
 * starttimmer: 1, 1000

启动一个定时器，其ID为1，定时时长time为1000ms

注：定时器ID用例保证非负整数，定时时长一定为正整数

 

停止定时器：stoptimmer: ID

举例：

stoptimmer: 1

停止一个ID为1的定时器

注：定时器ID用例保证非负整数，如果停止的定时器ID不存在，则忽略。

 

逝去时长：elapse: time

举例：

elapse: 1000

时间逝去1000ms

注：用例保证时长一定为正整数

 

输入结束

end

 

输出：

按启动顺序输出还没有停止的定时器，如ID为1的定时器还有1000ms才结束

timer: 1, 1000

如果所有定时器都停止了，输出none

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
