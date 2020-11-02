
public class q5 {

	public static void main(String[] args) {
		int big=0,p=1;int n=0,m=0;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				p=i*j;
				int r=checkpalin(p);
				if(r==1)
				{
					if(big<p)
					{
						big=p;
						n=i;m=j;
					}
				}
			}
			p=1;
		}
		System.out.println("The largest palindrome number formed by the product of 3-digit numbers "+n+" and "+m+" is "+big);
	}
	static int checkpalin(int n)
	{
		int dup=n,rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==dup)
			return 1;
		else
			return 0;
	}
		
}
