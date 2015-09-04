package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 丑数必然是前面的丑数乘2、3、5的结果。
 * @author jy7788
 *
 */
public class b032 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetUglyNumber_Solution(11));
	}
	
    public static int GetUglyNumber_Solution(int index) {
        if(index<=5){
        	return index;
        }
        int count =5;
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        while(count<index){
        	int max = list.get(list.size()-1);
        	int next = Integer.MAX_VALUE;
        	for(int i=0;i<list.size();++i){
        		if(list.get(i)*2>max&&list.get(i)*2<next){
        			next = list.get(i)*2;
        		}
        		if(list.get(i)*3>max&&list.get(i)*3<next){
        			next = list.get(i)*3;
        		}
        		if(list.get(i)*5>max&&list.get(i)*5<next){
        			next = list.get(i)*5;
        		}
        	}
        	list.add(next);
//        	list.remove(0);
        	count++;
       }
       return list.get(list.size()-1); 
    }

}
