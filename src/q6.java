public class q6 {

	public static void main(String[] args) {
		int n=3;
		for(int ct=1;ct<=10000;)
		{
			int ct2=0;
			for(int i=2;i<=(int)Math.sqrt(n);i++)
			{
				if(n%i==0)
					ct2++;
			}
			if(ct2==0)
			{
				ct++;
			}
			ct2=0;
			n=n+2;

		}
		System.out.println("The 10001st prime number is "+(n-2));
	}

}
