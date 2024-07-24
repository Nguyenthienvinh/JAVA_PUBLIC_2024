package baitest;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[1000000];
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		Arrays.sort(a,0,n);
		
		for(int i=0;i<n;i++)
		{
		   System.out.println(a[i]);
		}
		
		
		
		
		    
		
		    	
		
		
		
		
	}
}
