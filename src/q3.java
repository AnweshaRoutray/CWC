import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		long number=1000000;
		int big=0;long num=0;
		for(long i=2;i<=number;i++)
		{
			int ct=1;long n=i;
			do{  
				ct++;
				if(n%2==0)
					n=n/2;
				else
					n=3*n+1;	
			 }while(n!=1);
			if(big<ct)
			{
				big=ct;
				num=i;
			}
		}
		System.out.println("The longest chain of "+big+" steps is produced by the number "+num);
		
	}

}
