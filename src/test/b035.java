package test;

public class b035 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	 if(pHead1==null||pHead2==null)
    		 return null;
    	 ListNode p = pHead1;
    	 ListNode q = pHead2;
    	 int count1=0,count2=0;
    	 while(p!=null){
    		 p = p.next;
    		 count1++;
    	 }
    	 while(q!=null){
    		 q = q.next;
    		 count2++;
    	 }
    	 p = pHead1;
    	 q = pHead2;
    	 if(count1>count2){
    		 for(int i=0;i<count1-count2;++i){
    			 p = p.next;
    		 }
    	 }else{
    		 for(int i=0;i<count2-count1;++i){
    			 q = q.next;
    		 }
    	 }
    	 while(q!=p){
    		 q = q.next;
    		 p = p.next;
    	 }
    	 return p;
    }

}
