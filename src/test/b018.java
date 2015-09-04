package test;

public class b018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static void Mirror(TreeNode root) {
        run(root);
    }
    
    private static void run(TreeNode root){
    	if(root!=null&&(root.left!=null||root.right!=null)){
    		TreeNode tmp = root.left;
    		root.left = root.right;
    		root.right = tmp;
    		run(root.left);
    		run(root.right);
    	}
    }

}
