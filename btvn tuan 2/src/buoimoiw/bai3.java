package buoimoiw;

import java.util.Random;
import java.util.Scanner;

public class bai3 {
public static void main(String[] args) {
	Random rd= new Random();
	int a=(int)(Math.random()*11);
	int b=(int)(Math.random()*11);
	int c=(int)(Math.random()*21);
	int d;
	if(c>=0&&c<10)
	    d=a+b;
	else 
		d=c;
	
	System.out.println(a+"+"+b+"="+d);
	System.out.println("Phép tính trên dúng hay sai(Y/N):");
	Scanner sc = new Scanner(System.in);
	String x=sc.nextLine();
	if(x.equals("Y"))
		System.out.println("true");
	else if(x.equals("N"))
		System.out.println("false");
	

	
	 
	
	
	
}


}
