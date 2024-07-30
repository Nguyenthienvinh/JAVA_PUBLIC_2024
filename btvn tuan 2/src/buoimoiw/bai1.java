package buoimoiw;


import java.util.Scanner;

public class bai1 {
	public static final String  hinhvuong= "Square";
	public static final String hinhtamgiac="Triangle";
	public static final String hinhtron = "Circle";
	public static void main(String[] args) {
		String a;
		Scanner sc=new Scanner(System.in);
		
		while (true ) {
			a=sc.nextLine();
			if(a.equals(hinhvuong)||a.equals(hinhtamgiac)||a.equals(hinhtron))
			    break;
			System.out.println("hình dạng không hợp lệ vui lòng nhập lại ");
			
			
		}
		if(a.equals(hinhvuong))
		{
			int n=sc.nextInt();
			System.out.println((int)Math.pow(n,2));
		}
		if(a.equals(hinhtamgiac))
		{
			float x=sc.nextFloat();
			float y=sc.nextFloat();
			float z=sc.nextFloat();
			if(x+y>z && y+z>x && z+x>y)
				{
				double p=(x+y+z)/2;
				System.out.printf("%1.2f",Math.sqrt(p*(p-x)*(p-y)*(p-z)));
			}
			else System.out.println(-1);
		}
		if(a.equals(hinhtron))
		{
			double r=sc.nextDouble();
			System.out.printf("%1.2f",Math.PI*r*r);
		}
		
		
	}
	
}
