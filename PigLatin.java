package Main;
import java.util.*;
public class PigLatin {

	public static void main(String[] args) {			
		System.out.println("Please type what you would like to translate to pig latin:");
		
		Scanner keyboard = new Scanner(System.in);	
		String sentence = keyboard.nextLine().toUpperCase();
		keyboard.close();
		
		String[] words = sentence.split("\\s+");
		String ps = ".,;:!?";
		String vowels="AEIOU";
		String p;
			
		for(String word : words)
		{
			//remove spaces from word
			word = word.replace("[^\\s]", "");
			    
			//extract first and last characters of word as Strings
			String lastChar = String.valueOf(word.charAt(word.length()-1));
			String firstChar = String.valueOf(word.charAt(0));
			    
			//if last character in word is punctuation, remove it and store it in string p
			if(ps.contains(lastChar))
			{
			    p=lastChar;
			    word = word.replace(p, "");
			}
			else
			{
			    p="";
			}
			    
			//Determine whether to use "ay" or "yay" & print word
			if (vowels.contains(firstChar))
			{
			    System.out.print(word + "YAY" + p + " ");
			}
	        else
	        {
	            System.out.print((word.substring(1) + firstChar + "AY" + p + " "));
	        }
		}
	 }
}
