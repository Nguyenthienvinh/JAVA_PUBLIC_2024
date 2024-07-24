package buoi1;

import java.util.Scanner;

public class bai16 {
	public static void main(String[] args) {
	long n;
	long M=1;
	Scanner sc= new Scanner(System.in);
	System.out.println("nhap n giao thua ");
	n=sc.nextLong();
	for (int i=1;i<=n;i++) 
	    M*=i;
	System.out.println(n+ "giai thua bằng "+ M);
	}
	
	
	

}
