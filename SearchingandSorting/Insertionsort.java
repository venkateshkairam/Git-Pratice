package SearchingandSorting;
import java.util.*;
public class Insertionsort 
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			
			int a[]=new int[20];
			
			int i,n,j,temp,p;
			
			System.out.println("Enter the size of array a");
			n=sc.nextInt();
			
			System.out.println("Enter the array a elements");
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			for(i=1;i<n;i++)
			{
				temp=a[i];
				j=i-1;
				while(j>=0 && a[j]>temp)
				{
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=temp;
				
				for(p=0;p<n;p++)
					System.out.print(a[p]+" ");
				System.out.println("");
			}
	}

}
