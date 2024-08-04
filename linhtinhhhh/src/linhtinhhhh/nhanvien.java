package linhtinhhhh;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public abstract class nhanvien {
	protected String hoten;
	protected int namvaolam;
	protected final double phucapcoban =100.000;
	public nhanvien(String hoten, int namvaolam) {
		super();
		this.hoten = hoten;
		this.namvaolam = namvaolam;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		hoten=sc.nextLine();
		namvaolam=sc.nextInt();
	}
	public String getHoten() {
		return hoten;
	}
	public int getNamvaolam() {
		return namvaolam;
	}
	public double getPhucapcoban() {
		return phucapcoban;
	}
	public double tinhphucap() {
		Date now = new Date();
		int d= LocalDate.now().getYear();
		return phucapcoban+(d-this.namvaolam)*20.00;
	}
	abstract public double  tinhluong();
	public void intieude() {
		System.out.printf("%30s %15s %20s %20s","họ và tên ","năm vào làm", "phụ cấp", "lương");
	}
	public void indulieu() {
		System.out.printf("%30s %15d %20f %20f",hoten,namvaolam,tinhphucap(), tinhluong());
	}
	
	
	

}