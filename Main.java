import java.util.*;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class Main
{
    public static void insert(TreeNode node , int number){
        TreeNode fresh_node = new TreeNode(number);
        if(node == null){
            node=fresh_node;
        }
        else{
            if(number<=node.data){
                if(node.left==null){
                    node.left=fresh_node;
                    return;
                }
                else{
                    insert(node.left,number);
                }
            }
            else{
                if(node.right==null){
                    node.right=fresh_node;
                    return;
                }
                else{
                    insert(node.right, number);
                }
            }
        }
    }
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		TreeNode root = new TreeNode(20);
		while(t-->0){
		    int n=sc.nextInt();
		    insert(root,n);
		}
		inOrder(root);
	}
}
