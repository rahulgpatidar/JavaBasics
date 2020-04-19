package javabasics;

public class ConvertFirstCharacterToUpperCase {

	public static void main(String[] args) {
		String s = "hello how are you";
		String parts[] = s.split(" ");
		for(int j=0;j<parts.length;j++)
		{
			char[] ca = parts[j].toCharArray();
			for(int i=0;i<ca.length;i++)
			{
				ca[0] = Character.toUpperCase(ca[0]);
				System.out.print(ca[i]);
				if(i==(ca.length-1)) System.out.print(" ");
			}
		}	
	}
}
