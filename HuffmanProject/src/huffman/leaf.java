package huffman;

public class leaf {
    public static boolean isLeaf(Node root) {
    	 return root.left == null && root.right == null;  
    }
}
