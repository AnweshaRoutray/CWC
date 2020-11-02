import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str=sc.nextLine();
		System.out.print("Output: ");
		int ic=0; // to check if the input is valid or invalid
		for(int i=0;i<str.length();i++)//checking for invalid input
		{
			char ch=str.charAt(i);
			if(!(ch=='A'||ch=='C'||ch=='G'||ch=='T'))
			{
				System.out.println("Invalid Input");
				ic++;
				break;
			}	
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch=='A'||ch=='C'||ch=='G'||ch=='T') && ic==0)
			{
			   if(ch=='G')
				System.out.print("C");
			   else if(ch=='C')
				System.out.print("G");
			   else if(ch=='T')
				System.out.print("A");
			   else if(ch=='A')
				System.out.print("U");
			}
		}	
	}
}
