package SearchingandSorting;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];
		
		int i,n,j,p,min,pos;
		
		System.out.println("Enter the size of array a");
		n=sc.nextInt();
		
		System.out.println("Enter the array a elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			min=a[i];
			pos=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
			a[i]=min;
			
			for(p=0;p<n;p++)
				System.out.print(a[p]+" ");
			System.out.println("");
		}
		
		
	}

}
