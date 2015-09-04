package test;

import java.util.ArrayList;

public class b026 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cba";
		ArrayList<String> list = Permutation(str);
		for(int i=0;i<list.size();++i){
			System.out.println(list.get(i));
		}
	}
	
    public static ArrayList<String> Permutation(String str) {
    	char[] tmp = str.toCharArray();
    	ArrayList<String> result = new ArrayList<String>();
    	run(result,0,tmp);
    	for(int i=result.size()-1;i>0;--i){
    		for(int j=0;j<i;++j){
    			if(result.get(j).compareTo(result.get(j+1))>0){
    				String tmp_ = result.get(j);
    				result.set(j, result.get(j+1));
    				result.set(j+1, tmp_);
    			}
    		}
    	}
    	return result;
    }
    
    private static void run(ArrayList<String> list,int now,char[] str){
    	if(str.length-1==now){
    		list.add(new String(str));
    	}
    	for(int i=now;i<str.length;++i){
    		if(i==now)
    			run(list,now+1,str);
    		if(str[now]!=str[i]){
	    		char tmp = str[now];
	    		str[now] = str[i];
	    		str[i] = tmp;
	    		run(list,now+1,str);
	    		tmp = str[now];
	    		str[now] = str[i];
	    		str[i] = tmp;
    		}
    	}
    }
    

}
