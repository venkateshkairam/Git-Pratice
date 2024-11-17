package SearchingandSorting;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];
		
		int i,n,j,temp,p;
		
		System.out.println("Enter the size of array a");
		n=sc.nextInt();
		
		System.out.println("Enter the array a elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(i=0;i<n-1;i++) //n-1: number of passes
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(p=0;p<n;p++)
				System.out.print(a[p]+" ");
			System.out.println("");
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
