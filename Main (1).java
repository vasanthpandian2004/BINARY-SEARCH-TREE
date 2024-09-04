class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int d){
        this.data=d;
        left=null;
        right=null;
    }
}


public class Main
{
    public static void preorder(TreeNode node){
        //Base case
	        if(node == null){
	            return;
	        }
	        //Work
	        System.out.print(node.data+" , ");
	        // Recursive call 1
	        preorder(node.left);
	        // Recursive call 2
	        preorder(node.right);
	        return;
	    }
	    public static void inorder(TreeNode node){
	        if(node == null){
	            return;
	        }
	        inorder(node.left);
	        System.out.print(node.data+" , ");
	        inorder(node.right);
	        return;
	    }
	    public static void postorder(TreeNode node){
	        if(node == null){
	            return;
	        }
	        postorder(node.left);
	        postorder(node.right);
	        System.out.print(node.data+" , ");
	        return;
	    }
	    //This is a binary tree 
	public static void main(String[] args) {
	    TreeNode n1= new TreeNode(1);
	    TreeNode n2= new TreeNode(2);
	    TreeNode n3= new TreeNode(3);
	    TreeNode n4= new TreeNode(4);
	    TreeNode n5= new TreeNode(5);
	    TreeNode n6= new TreeNode(6);
	    TreeNode n7= new TreeNode(7);
	    TreeNode n8= new TreeNode(8);
	    TreeNode n9= new TreeNode(9);
	    TreeNode n10= new TreeNode(10);
	    TreeNode n11= new TreeNode(11);
	    TreeNode n12= new TreeNode(12);
	    
	    n1.left=n2;
	    n1.right=n3;
	    n2.left=n4;
	    n2.right=n5;
	    n3.left=n6;
	    n3.right=n7;
	    n4.left=n8;
	    n4.right=n9;
	    n5.left=n10;
	    //n5.right=null;
	    n6.right=n11;
	    //n6.left=null;
	    n7.left=n12;
	    //n7.right=null;
	    
	    TreeNode node = n1;
	    System.out.print("The preorder traversal is : ");
	    preorder(node);
	    System.out.println();
	    System.out.print("The inorder traversal is : ");
	    inorder(node);
	    System.out.println();
	    System.out.print("The postorder traversal is : ");
	    postorder(node);
	    System.out.println();
	}
}
