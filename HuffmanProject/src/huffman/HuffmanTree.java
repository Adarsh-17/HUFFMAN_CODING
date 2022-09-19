package huffman;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanTree {
    public static Node huffmannTreeGenerator(Map<Character, Integer> freq) {
    	PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.freq));
    	 for (var entry: freq.entrySet())   
         {  
             pq.add(new Node(entry.getKey(), entry.getValue()));  
         } 
    	 
    	  while (pq.size() != 1)  
          {   
              Node left = pq.poll();  
              Node right = pq.poll();    
              int sum = left.freq + right.freq;   
              pq.add(new Node(null, sum, left, right));  
          }  
          Node root = pq.peek(); 
          return root;
    }
}
