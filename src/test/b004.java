package test;

import java.util.ArrayList;

public class b004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre ={1,2,3,4,5,6,7};
		int[] in ={3,2,4,1,6,5,7};
		TreeNode p =reConstructBinaryTree(pre,in);
		ArrayList<TreeNode> tmp = new ArrayList<TreeNode>();
		tmp.add(p);
		while(!tmp.isEmpty()){
			p = tmp.get(0);
			tmp.remove(0);
			if(p.left!=null){
				tmp.add(p.left);
			}
			if(p.right!=null){
				tmp.add(p.right);
			}
			System.out.println(p.val);
		}
	}

	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int mid = pre[0];
        TreeNode root = new TreeNode(mid);
        ArrayList<Integer> a = new ArrayList<Integer>();//中序前半段
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> a_ = new ArrayList<Integer>();//前序前半段
        ArrayList<Integer> b_ = new ArrayList<Integer>();
        for(int i=0;i<in.length;++i){
        	if(in[i]==mid){
        		break;
        	}
        	a.add(in[i]);
        }
        for(int i=a.size()+1;i<in.length;++i){
        	b_.add(pre[i]);
        	b.add(in[i]);
        }
        for(int i=1;i<a.size()+1;++i){
        	a_.add(pre[i]);
        }
        buildTree(root,a_,a,false);
        buildTree(root,b_,b,true);
        return root;
    }
	
	private static void buildTree(TreeNode father,ArrayList<Integer> pre,ArrayList<Integer> in,boolean forward){
		if(!pre.isEmpty()){
			int mid = pre.get(0);
	        TreeNode child = new TreeNode(mid);
	        if(forward){
	        	father.right = child;
	        }else{
	        	father.left = child;
	        }
	        ArrayList<Integer> a = new ArrayList<Integer>();//中序前半段
	        ArrayList<Integer> b = new ArrayList<Integer>();
	        ArrayList<Integer> a_ = new ArrayList<Integer>();//前序前半段
	        ArrayList<Integer> b_ = new ArrayList<Integer>();
	        for(int i=0;i<in.size();++i){
	        	if(in.get(i)==mid){
	        		break;
	        	}
	        	a.add(in.get(i));
	        }
	        for(int i=a.size()+1;i<in.size();++i){
	        	b_.add(pre.get(i));
	        	b.add(in.get(i));
	        }
	        for(int i=1;i<a.size()+1;++i){
	        	a_.add(pre.get(i));
	        }
	        buildTree(child,a_,a,false);
	        buildTree(child,b_,b,true);
		}
	}
}
