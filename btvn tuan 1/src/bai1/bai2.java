package bai1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		c=a.copy()
				
		for (int i = 0; i < n; i++) {

			if (i == n - 1 && i % 2 != 0)
				a[i] += Math.abs(a[i - 1]);
			else if (i % 2 != 0)
				a[i] += Math.abs(a[i + 1] - a[i - 1]);

		}
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);

	}
}
