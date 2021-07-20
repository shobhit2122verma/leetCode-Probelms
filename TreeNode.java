package Arrays;
import java.util.*;
public class TreeNode<T> {
	T data;
	ArrayList<TreeNode> children;
	public TreeNode(T data) {
		this.data=data;
		children=new ArrayList<>();
	}
}