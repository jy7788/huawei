package test;

import java.util.ArrayList;

public class b023 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a1 = new TreeNode(10);
		TreeNode a2 = new TreeNode(5);
		TreeNode a3 = new TreeNode(12);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(7);
		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		ArrayList<ArrayList<Integer>> result = FindPath(a1,22);
		for(int i=0;i<result.size();++i){
			for(int j=0;j<result.get(i).size();++j){
				System.out.print(result.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        run(result,list,root,0,target);
        return result;
    }
    
    private static void run(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list,TreeNode root,int n,int target){
    	if(root==null){
    		return;
    	}
    	if(root.val+n==target&&(root.left==null&&root.right==null)){
    		list.add(root.val);
    		 ArrayList<Integer> tmp = new ArrayList<Integer>();
    		for(int i=0;i<list.size();++i){
    			tmp.add(list.get(i));
    		}
    		result.add(tmp);
    		list.remove(list.size()-1);
    		return;
    	}
    	if(root.val+n>target){
    		return;
    	}else{
    		list.add(root.val);
    		n += root.val;
    		run(result,list,root.left,n,target);
    		run(result,list,root.right,n,target);
    		n -= root.val;//如果上面两个都失败了，得往后退。
    		list.remove(list.size()-1);
    	}
    }
    

}
