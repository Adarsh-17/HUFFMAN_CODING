package huffman;

import java.util.Map;

public class Encode {
     public static void encodeData(Node root,String str, Map<Character, String> huffmanCode) {
    	 if(root == null) {
    		 return;
    	 }
    	 if (leaf.isLeaf(root))   
         {  
             huffmanCode.put(root.ch, str.length() > 0 ? str : "1");  
         }  
    	 encodeData(root.left, str + '0', huffmanCode);  
         encodeData(root.right, str + '1', huffmanCode); 
         return;
     }
}
