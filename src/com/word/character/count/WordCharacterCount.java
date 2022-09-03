package com.word.character.count;
import java.util.Scanner;
public class WordCharacterCount
{
public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();  
		int wordCount=0, characterCount=0;
		for(int i=0 ; i<str.length();i++)
		{
			if( str.charAt(i) != ' ' ) 
			{
				characterCount++;
			}
			if(str.charAt(i) == ' ') 
			{
				wordCount++;
			}
		}
		if(str.charAt( str.length()-1 ) != ' ') 
		{
			wordCount++;
		}
		
		sc.close();
		
		System.out.println("\nWord : " + wordCount);
		System.out.println("\nCharacter : " + characterCount);
	}
}
