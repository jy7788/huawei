
/**
 * 运用双向链表
 * @author jy7788
 *
 */
public class count3Quit2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		link arr = new link(500);
		node index = arr.first;
		int tmpNum = 0;
		while(arr.count>1){
			tmpNum++;
			if(tmpNum==3){
				arr.delete(index);
				tmpNum=0;
			}
			index = index.next;
		}
		
		System.out.println(index.id);
	}

}

class node {
	int id;
	node previous,next;
}

class link {
	int count = 0;
	node first,last;
	
	link (int n){
		for(int i=0;i<n;++i){
			add();
		}
	}
	
	public void add(){
		node tmp = new node();
		tmp.id = count;
		if(count<=0){
			first = tmp;
			last = tmp;
			tmp.previous = tmp;
			tmp.next = tmp;
		}else{
			tmp.previous = last;
			tmp.next = first;
			last.next = tmp;
			first.previous = tmp;
			last = tmp;
		}
		count++;
	}
	
	public void delete(node k){
		if(count<=0){
			return;
		}else{
			if(count==1){
				last=first=null;
			}else{
				k.previous.next = k.next;
				k.next.previous = k.previous;
				if(k==last)
					last = k.previous;
				if(k==first)
					first = k.next;
			}
			count--;
		}
	}
}
