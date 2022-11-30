/*

Pattern 3
1 
1 2
1 2 3
1 2 3 4
1 2 3
1 2
1
*/

import java.util.Scanner;
class Pattern3
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter how to print the pattern");
		int n=ob.nextInt();
		System.out.println("=== Printing the Pattern ===");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		int k=1;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(j+" ");
				k++;
			}
			k=1;
			System.out.println();
	
		}

	
	}
}