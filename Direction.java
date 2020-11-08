import java.util.Scanner;
public class Direction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos=0;
		char ip='0';
		for(int i=1;i<=4;i++)
		{
			System.out.println("Enter The Position where the man moves ");
			char fp=sc.next().charAt(0);
           if((ip=='N'&&fp=='S')||(ip=='S'&&fp=='N')||(ip=='E'&&fp=='W')||(ip=='W'&&fp=='E'))
           {
        	   ip=fp;
        	   continue;
           }
           else 
        	   pos++;
			
			ip=fp;
			
		}
		if(pos==0||pos==3)
			System.out.println("Travelling Wasted");
		else
			System.out.println(pos);

	}

}
