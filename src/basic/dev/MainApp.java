package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Thong tin sinh vien");

		System.out.println("-Ho va ten: ");
		String hoVaten = sc.nextLine();

		System.out.println("-Ma sinh vien: ");
		long maSinhvien = sc.nextLong();

		System.out.println("-Cmnd: ");
		long cmnd = sc.nextLong();

		System.out.println("-lop: ");
		String lop = sc.next();

		System.out.println("-truong: ");
		String truong = sc.next();

		System.out.println("-Sdt: ");
		long sdt = sc.nextLong();

		System.out.println("-dia chi: ");
		String diaChi = sc.next();

		System.out.println("THONG TIN CONG NHAN");

		System.out.println("-Ho va ten: ");
		String hovaten = sc.next();

		System.out.println("-Dia chi: ");
		String diachi = sc.next();

		System.out.println("-Sdt: ");
		long sDt = sc.nextLong();

		System.out.println("-luong: ");
		float luong = sc.nextFloat();

		System.out.println("THONG TIN MOT CHIEC XE");

		System.out.println("ten: ");
		String Ten = sc.next();

		System.out.println("Hang: ");
		String hang = sc.next();

		System.out.println("gia: ");
		float gia = sc.nextFloat();

		System.out.println("mau son: ");
		String mau = sc.next();

	}

}