package bai1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[][]=new int[n][n];
		int c1=0,h1=0,c2=n-1,h2=n-1;
		int d=1;
		while(h1<=h2&&c1<=c2)
		{
			for(int i=c1;i<=c2;i++)
		{
			a[h1][i]=d;
			d++;
		}
		h1++;
		for(int i=h1;i<=h2;i++)
		{
			a[i][c2]=d;
			d++;
		}
		  c2--;
		  for(int i=c2;i>=c1;i--)
		  {
			  a[h2][i]=d;
			  d++;
		  }
		  h2--;
		  for(int i=h2;i>=h1;i--)
		  {
			  a[i][c1]=d;
			  d++;
		  }
		  c1++;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"  ");
			System.out.print("\n");
			
		}
			
		    
		
		  
	
	}

}
