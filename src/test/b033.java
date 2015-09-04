package test;

import java.util.ArrayList;
import java.util.List;

public class b033 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstNotRepeatingChar("google"));
	}
	
    public static int FirstNotRepeatingChar(String str) {
        if(str.isEmpty()){
        	return -1;
        }
        List<String> a = new ArrayList<String>();
        List<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<str.length();++i){
        	if(a.isEmpty()){
        		a.add(str.charAt(i)+"");
        		b.add(1);
        	}else{
        		boolean flag = true;
        		for(int j=0;j<a.size();++j){
        			if(a.get(j).equals(str.charAt(i)+"")){
        				b.set(j, b.get(j)+1);
        				a.add(str.charAt(i)+"");
        				b.add(b.get(j)+1);
        				flag = false;
        				break;
        			}
        		}
        		if(flag){
        			a.add(str.charAt(i)+"");
        			b.add(1);
        		}
        	}
        }
        for(int i=0;i<b.size();++i){
        	if(b.get(i)==1){
        		return i;
        	}
        }
        return -1;
        
    }

}
