package test;

public class b015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode ReverseList(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		ListNode p = head;
		ListNode q =p.next;
		p.next = null;
		while(q!=null){
			ListNode tmp = q.next;
			q.next = p;
			p = q;
			q = tmp;
		}
		return p;
	}

}
