package huffman;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		 Scanner scn = new Scanner(System.in);
         String str = "Enter your string: ";
         System.out.println(str);
         String text = scn.nextLine();
         HuffmanCode.huffman(text);
         String encodedMsg = HuffmanCode.encodedData();
         System.out.println("ENCODEDSTRING ->"+encodedMsg);
         String decodedMsg = HuffmanCode.decodedData();
         System.out.println("DECODEDSTRING ->"+decodedMsg);
         
	}

}
