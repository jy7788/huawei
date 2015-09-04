package test;

import java.util.ArrayList;
import java.util.List;

public class b017 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	if(root1==null&&root2==null){
    		return false;
    	}
    	if((root1==null&&root2!=null)||(root1!=null&&root2==null)){
    		return false;
    	}
    	return bfs(root1,root2);
    }
    
    private static boolean bfs(TreeNode root1,TreeNode root2){
    	List<TreeNode> list = new ArrayList<TreeNode>();
    	list.add(root1);
    	while(!list.isEmpty()){
    		TreeNode tmp = list.get(0);
    		list.remove(0);
    		if(tmp.left!=null){
    			list.add(tmp.left);
    		}
    		if(tmp.right!=null){
    			list.add(tmp.right);
    		}
    		if(tmp.val==root2.val&&judge(tmp,root2)){
    				return true; 
    		}
    	}
    	return false;
    }
    
    private static boolean judge(TreeNode a,TreeNode b){
    	if(b==null){
    		return true;
    	}
    	if(a==null){
    		return false;
    	}
    	if(a.val!=b.val){
    		return false;
    	}
    	boolean tmp1 = judge(a.left,b.left);
    	boolean tmp2 = judge(a.right,b.right);
    	return tmp1&&tmp2;
    	
    }

}
