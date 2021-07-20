package Arrays;
import java.util.*;

public class Treemain {
	
	private static Queue<TreeNode<Integer>> queue=new LinkedList<TreeNode<Integer>>();
	public static TreeNode<Integer> takeInput(Scanner in){
		int data=in.nextInt();
		if(data==-1) {
			return null;
		}
		TreeNode<Integer> root=new TreeNode<Integer>(data);
		int c=in.nextInt();
		for(int i=0;i<c;i++) {
			TreeNode<Integer> child=takeInput(in);
			root.children.add(child);
			
		}
		return root;
	}
	
	public static TreeNode<Integer> leveltakeInput(Scanner in)throws NoSuchElementException{
		int n=in.nextInt();
		if(n==-1) {
			return null;
		}
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> root1=queue.peek();
//			ArrayList<TreeNode> childrens=root1.children;
			System.out.println("enter the number of childrens for "+root1.data);
			int children=in.nextInt();
			for(int i=0;i<children;i++) {
				int data=in.nextInt();
//				if(data==-1) {
//					root1.children.add(null);
//					continue;
//				}
				TreeNode<Integer> child=new TreeNode<Integer>(data);
				root1.children.add(child);
				queue.add(child);
			}
			queue.remove();
		}
		return root;
	}
	public static void printLevel(TreeNode<Integer> root) throws NoSuchElementException{
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> root1=queue.peek();
			ArrayList<TreeNode> children=root1.children;
			for(TreeNode<Integer> i:children) {
				System.out.print(i.data+" ");
				queue.add(i);
			}
			queue.remove();		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TreeNode<Integer> root=leveltakeInput(in);
		printLevel(root);
	}
}