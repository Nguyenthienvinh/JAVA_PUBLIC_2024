package buoimoiw;

import java.util.Scanner;

public class bai2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String a=sc.nextLine();
	int i=0;
	int j=a.length()-1;
    int d=0;
    while(i<=j)
    {
     if(a.charAt(i)!=a.charAt(j))
     { 
    	 d=d+1;
    	 break; 
     }
     i++;
     j--;  	 
    }
    if(d==0)
    	System.out.println(a.toUpperCase());
    else
    	System.out.println(a.toLowerCase());
	
}


}
