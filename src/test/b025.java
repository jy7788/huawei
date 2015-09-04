package test;

public class b025 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a1 = new TreeNode(5);
		TreeNode a2 = new TreeNode(4);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(2);
		TreeNode a5 = new TreeNode(1);
		TreeNode a6 = new TreeNode(11);
		TreeNode a7 = new TreeNode(13);
		a1.left = a2;
		a2.left = a3;
		a3.left = a4;
		a4.left = a5;
		TreeNode head = Convert(a1);
		while(head!=null){
			System.out.println(head.val);
			head = head.right;
		}
	}
	
    public static TreeNode Convert(TreeNode pRootOfTree) {
    	if(pRootOfTree==null){
    		return null;
    	}
    	TreeNode head = getHead(pRootOfTree);
        run(pRootOfTree,pRootOfTree.left,pRootOfTree.right);
        return head;
    }
    
    private static TreeNode getHead(TreeNode head){
    	if(head.left!=null)
    		return getHead(head.left);
    	else
    		return head;
    }
    
    private static void run(TreeNode root,TreeNode left,TreeNode right){
    	if(left==null&&right==null){
    		return;
    	}
    	if(left!=null)
    		run(left,left.left,left.right);
    	else
    		run(left,null,null);
    	if(right!=null)
    		run(right,right.left,right.right);
    	else
    		run(right,null,null);
    	runRight(root,right);
    	runLeft(root,left);
    }
    
    private static void runLeft(TreeNode root,TreeNode left){
    	if(left==null){
    		return;
    	}
    	if(left.right!=null){
    		runLeft(root,left.right);
    	}else{
    		left.right = root;
        	root.left = left;
    	}
    }
    
    private static void runRight(TreeNode root,TreeNode right){
    	if(right==null)
    		return;
    	if(right.left!=null){
    		runRight(root,right.left);
    	}else{
    		right.left = root;
        	root.right = right;
    	}
    }

}
