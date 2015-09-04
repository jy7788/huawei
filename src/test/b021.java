package test;

import java.util.ArrayList;

public class b021 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	ArrayList<TreeNode> bfs = new ArrayList<TreeNode>();
    	if(root==null)
        	return list;
        bfs.add(root);
        list.add(root.val);
        while(!bfs.isEmpty()){
        	TreeNode tmp = bfs.get(0);
        	bfs.remove(0);
        	if(tmp.left!=null){
        		bfs.add(tmp.left);
        		list.add(tmp.left.val);
        	}
        	if(tmp.right!=null){
        		bfs.add(tmp.right);
        		list.add(tmp.right.val);
        	}
        }
        return list;
    }

}
