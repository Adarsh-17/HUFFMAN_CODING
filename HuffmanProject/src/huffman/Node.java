package huffman;

public class Node {
     Character ch;
     int freq;
     Node left;
     Node right;
     public Node(Character ch,int freq) {
    	 this.ch = ch;
    	 this.freq = freq;
     }
     public Node() {
    	
     }
     
     public Node(Character ch,int freq,Node left,Node right) {
    	 this.ch = ch;
    	 this.freq = freq;
    	 this.left = left;
    	 this.right = right;
     }
     
}
