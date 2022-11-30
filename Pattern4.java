/*

Pattern 4

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5

*/
import java.util.Scanner;

class Pattern4
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter how many rows::");
		int n=ob.nextInt();
		int k=1;
		for (int i=1;i<=n;i++)
		{
			for(int j=i; j<=n;j++)
			{
				System.out.print(k+" ");
				k++;	
			}
			System.out.println();
			k=1;
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}	
		
	}
}