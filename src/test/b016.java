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
         	p = list2;         //pָ���һ��ֵ��С����������
         	q = list1;         //qָ��ϴ�ģ�����������
         }
         ListNode prep = null;
         while(p!=null){
         	if(q!=null&&q.val<p.val){
         		prep.next = q;
         		//���������������ҵ���һ��С��pԪ�صģ����м��һ��Ԫ�ض���Ҫ���뵽����
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
