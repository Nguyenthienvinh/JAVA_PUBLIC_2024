package bai1;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		double r;
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		System.out.printf("%1.3f", 2 * pi * r);
		System.out.printf(" %1.3f", pi * r * r);

	}

}
