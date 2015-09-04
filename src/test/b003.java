package test;

import java.util.ArrayList;

public class b003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1 = new ListNode(67);
		ListNode a2 = new ListNode(0);
		ListNode a3 = new ListNode(24);
		ListNode a4 = new ListNode(58);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		ArrayList<Integer> list = printListFromTailToHead(a1);
		for(Integer c:list){
			System.out.println(c);
		}
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(listNode==null)
        	return list;
        ListNode p = listNode;
        ListNode q = p.next;
        ListNode head =null;
        p.next=null;
        while(q!=null){
        	ListNode tmp = q.next;
        	q.next = p;
        	p = q;
        	if(tmp==null){
        		head = q;
        	}
        	q = tmp;
        }
        while(head!=null){
        	list.add(head.val);
        	head = head.next;
        }
        return list;
    }

}
