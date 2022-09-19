package huffman;

public class Decode {
       public static String decodeData(Node root,String text) {
    	     
    	   StringBuilder sb = new StringBuilder();
    	   if (leaf.isLeaf(root))  
           {  
    		   int check = root.freq;
               while (check-- > 0)   
               {  
                   sb.append(root.ch);
                   
               }
               return sb.toString();
           }
    	   Node head = root;
    	   int len = text.length();
    	   int index = 0;
    	   while(index<len) {
    			   head = text.charAt(index)=='0'? head.left : head.right;
    			   index++;
    			   if(leaf.isLeaf(head)) {
        			   sb.append(head.ch);
        			   head = root;
        		   }
    		
    		   
    	   }
    	   return sb.toString();
       }
}
