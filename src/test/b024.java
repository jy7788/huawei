package test;

public class b024 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode a1 = new RandomListNode(1);
		RandomListNode a2 = new RandomListNode(2);
		RandomListNode a3 = new RandomListNode(3);
		RandomListNode a4 = new RandomListNode(4);
		RandomListNode a5 = new RandomListNode(5);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a1.random = a3;
		a2.random = a5;
		a3.random = null;
		a4.random = a2;
		a5.random = null;
		RandomListNode head = Clone(a1);
		RandomListNode p =a1;
		while(head!=null){
			if(head.random==null)
				System.out.println(head.label+" "+"null");
			else
				System.out.println(head.label+" "+head.random.label);
			System.out.println(p==head);
			p = p.next;
			head = head.next;
		}
	}
	
	public static RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead==null)
			return null;
		RandomListNode p = pHead;
		while(p!=null){
			RandomListNode tmp = new RandomListNode(p.label);
			tmp.next = p.next;
			p.next = tmp;
			p = tmp.next;
		}
		p = pHead;
		while(p!=null){
			RandomListNode q = p.next;
			if(p.random!=null)
				q.random = p.random.next;
			p = q.next;
		}
		p = pHead.next;
		RandomListNode head = p;
		while(p.next!=null){
			p.next = p.next.next;
			p = p.next;
		}
		return head;
    }

}
