package test;

import java.util.ArrayList;
import java.util.List;


public class b016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ListNode Merge(ListNode list1,ListNode list2) {
    	 if(list1==null&&list2==null)
         	return null;
         if(list1==null&&list2!=null)
         	return list2;
         if(list1!=null&&list2==null)
         	return list1;
 		ListNode p = list1;
         ListNode q = list2;
         if(list1.val>list2.val){
         	p = list2;         //p指向第一个值较小的链表，主表
         	q = list1;         //q指向较大的，待插入链表
         }
         ListNode prep = null;
         while(p!=null){
         	if(q!=null&&q.val<p.val){
         		prep.next = q;
         		//遍历待插入链表，找到第一个小于p元素的，这中间的一段元素都需要插入到主表
 	        	while(q!=null&&q.val<p.val){
 	        		prep = prep.next;
 	        		q = q.next;
 	        	}
 	        	prep.next = p;;
         	}
         	prep = p;
         	p = p.next;
         }
         prep.next = q;
         if(list1.val>list2.val){
         	return list2;
         }else{
         	return list1;
         }
        
    }

}
