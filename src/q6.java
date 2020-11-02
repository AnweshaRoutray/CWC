
public class q6 {

	public static void main(String[] args) {
		int n=2;
		for(int ct=1;ct<=10001;)
		{
			int ct2=0;
			for(int i=1;i<=(int)(n/2);i++)
			{
				if(n%i==0)
					ct2++;
			}
			if(ct2==1)
			{
				ct++;
			}
			ct2=0;
			n++;

		}
		System.out.println("The 10001st prime number is "+(n-1));
	}

}
