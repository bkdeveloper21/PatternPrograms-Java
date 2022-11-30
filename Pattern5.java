/* Pattern 5


 5 4 3 2 1
 4 3 2 1
 3 2 1
 2 1
 1
 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1

*/
import java.util.Scanner;
class Pattern5
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter how many rows of pattern::");
		int n=ob.nextInt();
		System.out.println("=== Pattern 5 is printing ===");
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for(j=i;j>=1;j--)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
