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
		if(n==0) {
			return null;
		}
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> root1=queue.peek();
//			ArrayList<TreeNode> childrens=root1.children;
//			System.out.println("enter the number of childrens for "+root1.data);
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
	
	public static TreeNode<Integer> nodeHavingSumOfChildrenAndNodeMax(TreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		TreeNode<Integer> ans=new TreeNode<Integer>(Integer.MIN_VALUE);
		queue.add(root);
		int max=ans.data;
		while(!queue.isEmpty()) {
			TreeNode<Integer> root1=queue.peek();
			int sum=root1.data;
			for(int i=0;i<root1.children.size();i++) {
				TreeNode<Integer> child=root1.children.get(i);
				sum=sum+child.data;
				queue.add(child);
			}
			if(sum>=max) {
				ans=root1;
				max=sum;
			}
//			System.out.println(root1.data+" "+ans.data+" "+max);
			queue.remove();
		}
		return ans;
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
	
	public static int findHeight(TreeNode<Integer> root) {
		if(root==null) {
			return 1;
		}
		int ans=1;
		for(int i=0;i<root.children.size();i++) {
			int data=1+findHeight(root.children.get(i));
			ans= Math.max(ans, data);
		}
		return ans;
	}
	public static int countleafnodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		int ans=0;
		for(int i=0;i<root.children.size();i++) {
			ans=ans+countleafnodes(root.children.get(i));
		}
		return ans;
	}
	
	public static void postorderTraversal(TreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			postorderTraversal(root.children.get(i));
		}
		System.out.print(root.data+" ");
	}
	
	public static boolean checkELementPresentBFS(TreeNode<Integer> root,int n) {
		if(root==null)
		{
			return false;
		}queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> root1=queue.peek();
			if(root1.data==n) {
				return true;
			}
			for(int i=0;i<root1.children.size();i++) {
				queue.add(root1.children.get(i));
			}
			queue.remove();
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TreeNode<Integer> root=leveltakeInput(in);
//		int n=in.nextInt();
//		printLevel(root);
//		System.out.println(findHeight(root));
//		System.out.println(countleafnodes(root));
//		postorderTraversal(root);
//		System.out.println(checkELementPresentBFS(root, n));
		System.out.println(nodeHavingSumOfChildrenAndNodeMax(root).data);
	}
}