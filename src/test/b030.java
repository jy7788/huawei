package test;

import java.util.ArrayList;
import java.util.List;

public class b030 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1Between1AndN_Solution(21345));
	}
	
    public static int NumberOf1Between1AndN_Solution(int n) {
        int num=0,tmp = 1;
        List<Integer> list = new ArrayList<Integer>();
    	while(n!=0){
        	int tmp_ = n%10;
        	n = n/10;
        	if(tmp_==0){
        		num += n*tmp;
        	}else{
        		if(tmp_==1){
            		int x = 0;
            		if(!list.isEmpty()){
            			int y=list.size()-1;
            			for(int i=y;i>=0;i--){
            				if(list.get(i)!=0){
            					y = i;
            					break;
            				}
            			}
            			for(int i=0;i<=y;++i){
            				if(i==0)
            					x += list.get(i);
            				else{
            					int z = 1;
            					for(int j=0;j<i;++j){
            						z *= 10;
            					}
            					x +=z*list.get(i);
            				}
            					
            			}
            		}
            		num += n*tmp+x+1;
            	}else{
            		num += (n+1)*tmp;
            	}
        	}   	
        	
        	list.add(tmp_);
        	tmp = tmp*10;
        }
    	return num;
    }

}
