package test;

import java.util.ArrayList;

public class b022 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(VerifySquenceOfBST(arr));
	}
	
    public static boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence.length==0)
    		return false;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0;i<sequence.length-1;++i)
    		list.add(sequence[i]);
        return run(list,sequence[sequence.length-1]);
    }
    
    public static boolean run(ArrayList<Integer> arr,int n){
    	if(arr.size()<3)
    		return true;
    	int tmp = arr.size();
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	ArrayList<Integer> b = new ArrayList<Integer>();
    	for(int i=0;i<arr.size();++i){
    		if(arr.get(i)>n){
    			tmp = i;
    			break;
    		}else{
    			a.add(arr.get(i));
    		}
    	}
    	for(int i=tmp;i<arr.size();++i){
    		if(arr.get(i)<n)
    			return false;
    		else{
    			b.add(arr.get(i));
    		}
    	}
    	boolean flag1=true,flag2=true;
    	if(!a.isEmpty()){
    		int an = a.get(a.size()-1);
    		a.remove(a.size()-1);
    		flag1 = run(a,an);
    	}
    	if(!b.isEmpty()){
    		int bn = b.get(b.size()-1);
        	b.remove(b.size()-1);
        	flag2 = run(b,bn);
    	}
    	return flag1&&flag2;		
    }

}
