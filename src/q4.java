import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a date: ");
		int day=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		int l=leap(year);
		switch(month)
		{
		case 1:
			System.out.println(day+" January "+year);
			break;
		case 2:
			System.out.println(day+" February "+year);
			break;
		case 3:
			System.out.println(day+" March "+year);
			break;
		case 4:
			System.out.println(day+" April "+year);
			break;
		case 5:
			System.out.println(day+" May "+year);
			break;
		case 6:
			System.out.println(day+" June "+year);
			break;
		case 7:
			System.out.println(day+" July "+year);
			break;
		case 8:
			System.out.print(day+" August "+year);
			break;
		case 9:
			System.out.println(day+" September "+year);
			break;
		case 10:
			System.out.println(day+" October "+year);
			break;
		case 11:
			System.out.println(day+" November "+year);
			break;
		case 12:
			System.out.println(day+" December "+year);
			break;	
		}
		int DayNum=0;
			   for(int i=1;i<=month;i++)
			   {
				  
				  if(i>=2 && i<=7)
				  {
			         if(i%2==0)
				     DayNum+=30;
			         else
				     DayNum+=31;
				  }
				  else if(i>=8 && i<=12)
				  {
					  if(i%2==0)
						  DayNum+=31;
					  else 
						  DayNum+=30;
				  }  
			   }
		if(l==1)
			DayNum=DayNum-1;
		else 
			DayNum=DayNum-2;
		
		if(month!=1)
		{
			DayNum=DayNum+day;
		System.out.println("Day Number: "+DayNum);
		}
		else
			System.out.println("Day Number: "+day);
	}
	
	static int leap(int yr)
	{
		if((yr%4==0 && yr%400==0)||(yr%100!=0))
			return 1;
		else 
			return 0;
			
	}

}
