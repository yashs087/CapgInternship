package com.skill.capg.lab3;

public class Exercise5 {
	static void countText(String text) {
		String[] lineStr= text.split("\n");
		int lines=lineStr.length;
		int wordCount=0;
		int charCount=0;
		for(int i=0;i<lines;i++) {
			//System.out.println(str[i]);
			String[] wordStr= lineStr[i].split(" ");
			wordCount=wordCount+wordStr.length;
			for (int j=0;j<wordStr.length;j++) {
				charCount=charCount+wordStr[j].length();
			}
		}
		System.out.println("No. of lines: "+lines);
		System.out.println("NO. of Words: "+wordCount);
		System.out.println("No. of characters: "+charCount);
	}
	
	public static void main(String[] args) {
		countText("hello\nhow are you!\nwhat is your name");
	}
}
