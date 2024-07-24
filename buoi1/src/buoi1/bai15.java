package buoi1;

import java.util.Scanner;

public class bai15 {
	public static void main(String[] args) {
		int songay;
		float dongia;
		Scanner sc = new Scanner(System.in);
		System.out.println("so ngay khach luu chu la ");
		
		songay=sc.nextInt();
		System.out.println("don gia ngay cua nha nghi ");
		dongia=sc.nextFloat();
		if(songay==1)
			System.out.println("so tien khach phai tra la"+songay*dongia);
		else if(songay>=10)
			System.out.println("so tien khach phai tra la"+songay*dongia*0.4);
		
		else if(songay>=5)
			System.out.println("so tien khach phai tra la"+songay*dongia*0.6);
		else 
			System.out.println("so tien khach phai tra la"+songay*dongia*0.8);
			
			
		
		
	}
}
