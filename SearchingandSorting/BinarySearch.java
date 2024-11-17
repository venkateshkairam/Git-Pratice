package SearchingandSorting;
import java.util.*;
public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];
		
		int i,n,keyelement;
		
		System.out.println("Enter the size of array a");
		n=sc.nextInt();
		
		System.out.println("Enter the array a elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter the keyelement need to be searched");
		keyelement=sc.nextInt();
		
		sort(a,n);
		
		binarysearch(a,n,keyelement);
		
		
	}
	static void sort(int b[],int n)
	{
		int i,j,temp;
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
	}

	static void binarysearch(int a[],int n,int keyelement)
	{
		int i,low,high,mid,found=0;
		
		low=0;
		high=n-1;
		
		for(i=0;i<n;i++)
		{
			mid=(low+high)/2;
			if(keyelement==a[mid])
			{
				found=1;
				break;
			}
			else if(keyelement>a[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		if(found==1)
			System.out.println("keyelement found! Search is successful");
		else
			System.out.println("keyelement not found! Search is unsuccessful");
	}
}
