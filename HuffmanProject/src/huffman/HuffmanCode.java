package huffman;

import java.util.HashMap;
import java.util.Map;

public class HuffmanCode {
	static StringBuilder encodedData = new StringBuilder();  
	static Node root = new Node();
      public static void huffman(String text) {
    	  Map<Character, Integer> freq = new HashMap<>(); 
    	  freq = Frequency.frequencyTable(text);  
    	  Map<Character, String> huffmanCode = new HashMap<>();
          root = HuffmanTree.huffmannTreeGenerator(freq);
          Encode.encodeData(root, "", huffmanCode);
          System.out.println("The HUFFMANN CODE for characteers: ");
          System.out.println(huffmanCode);
          for (char c: text.toCharArray())   
          {   
              encodedData.append(huffmanCode.get(c));  
          } 
      }
      
      public static String encodedData() {
    	  return encodedData.toString();
      }
      
      public static String decodedData() {
    	  return Decode.decodeData(root, encodedData.toString());
      }
      
     
      
}
