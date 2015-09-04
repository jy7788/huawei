package test;

public class b014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		ListNode tmp = 	FindKthToTail(a1,0);
		if(tmp!=null)
			System.out.println(tmp.val);
		else
			System.out.println("null");

	}
	public static ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k==0){
			return null;
		}
		ListNode p = head;
		ListNode q = head;
		for(int i=1;i<k;++i){
			p = p.next;
			if(p==null)
				return null;
		}
		while(p.next!=null){
			q = q.next;
			p = p.next;
		}
		return q;
    }
}
