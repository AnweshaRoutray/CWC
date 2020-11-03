import java.util.Scanner;
import java.lang.String;
public class q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str=sc.nextLine();
		System.out.print("Output: ");
		String str2="";
		 // to check if the input is valid or invalid
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!(ch=='A'||ch=='C'||ch=='G'||ch=='T'))
			{
				str2="Invalid Input";
				break;
			}	
			else
			{
			   if(ch=='G')
				str2=str2.concat("C");
			   else if(ch=='C')
				str2=str2.concat("G");
			   else if(ch=='T')
				str2=str2.concat("A");
			   else if(ch=='A')
				str2=str2.concat("U");
		  }
		}
		System.out.print(str2);
	}
}
