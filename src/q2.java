import java.util.Scanner;

public class q2 {
	static int comp=0,user=0,tie=0;
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Input 'R' for Rock, 'P' for Paper, 'S' for scissor");
	  int r=0,p=1,s=2; 
	  for(int i=1;i<=3;i++)
	  {
		  System.out.println("Round "+i);
	    double a=(int)(0+(Math.random()*3));
	    System.out.println("enter user's choice");
	    char ch=sc.next().charAt(0);
	    System.out.print("Computer's choice(randomly generated): ");
	     if(a==0.0)
	    	 System.out.println("R");
	     else if(a==1.0)
	    	 System.out.println("P");
	     else
	    	 System.out.println("S");
	     round(ch,a);
	  }
	  if(user>=2)
		  System.out.println("3 Rounds over,user scored "+user+",user won the game");
	  else if(comp>=2)
		  System.out.println("3 Rounds over,computer scored "+comp+",computer won the game");
	  else if((tie==1 && comp==1 && user==1)||tie==3)
		  System.out.println("3 Rounds over,user scored "+user+",computer scored "+comp+",game was a tie");
	  else if(tie==1 && comp==2)
		  System.out.println("3 Rounds over,computer scored 2,computer won the game");
	  else if(tie==1 && user==2)
		  System.out.println("3 Rounds over,user scored 2,user won the game");
	  else if(tie==2 && user==1)
		  System.out.println("3 Rounds over,tie is 2 and user scored 1,user won the game");
	  else
		  System.out.println("3 Rounds over,tie is 2 and computer scored 1,computer won the game");    
	}
	static void round(char ch,double a)
	{   
		if((ch=='R'&& a==0.0)||(ch=='P'&&a==1.0)||(ch=='S'&&a==2.0))
	    {
	    	System.out.println("Tie of round");
	    	tie++;
	    }
	    else if((ch=='R'&&a==1.0)||(ch=='P'&&a==2.0)||(ch=='S'&&a==0.0))
	    {
	    	System.out.println("computer won the round");
	    	comp++;
	    }
	    else 
	    {
	    	System.out.println("user won the round");
		     user++;
	    }
	 }

 }


