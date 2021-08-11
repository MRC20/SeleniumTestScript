package TestNGPractice;

import java.util.Scanner;

public class UppercaseLowercaseChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				System.out.println("Uppercase:"+ch[i]);
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				System.out.println("Lowercase:"+ch[i]);
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				System.out.println("Number:"+ch[i]);
			}
			else
			{
				System.out.println("Special character:"+ch[i]);
			}
		}

	}

}
