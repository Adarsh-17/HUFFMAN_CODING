package huffman;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
      public static Map<Character, Integer> frequencyTable(String text){
    	  Map<Character, Integer> freq = new HashMap<>();  
    	  
    	  for (char c: text.toCharArray())   
          {  
              //storing character and their frequency into Map by invoking the put() method   
              freq.put(c, freq.getOrDefault(c, 0) + 1);  
          }
    	  return freq;
      }
}
