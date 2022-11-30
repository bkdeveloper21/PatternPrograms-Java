/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 */
import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number of rows to print the pattern::");
		
		int n=ob.nextInt();

		int i,j,k=1;
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(k+" ");
				k++;	
			}
			k=1;
			System.out.println();	
		}	
	}
}