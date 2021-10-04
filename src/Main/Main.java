package Main;

import java.util.Scanner;

import com.cybersoft.java14.hinhchunhat.HinhChuNhat;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HinhChuNhat hinhChuNhat= new HinhChuNhat();
		int choice ;
		showMenu();
		do {
			
			choice=Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				hinhChuNhat.input();
				break;
			case 2:
				System.out.println("Chu Vi Hinh Chu Nhat : " + hinhChuNhat.calculateChuvi());
				break;	
			case 3 :
				System.out.println("Dien Tich Hinh Chu Nhat : " + hinhChuNhat.calculateDienTich());
				break;
			case 4 : 
				System.out.println("Finish");
				break;
			default:
				System.out.println("Vui long nhap lai.");
				break;
			}
			
		}while(choice!=4);
		
	}
	static void showMenu() {
		System.out.println("1. Nhap Thong Tin Hinh Chu Nhat : ");
		System.out.println("2. Tinh Chu Vi hinh chu nhat : ");
		System.out.println("3. Tinh Dien Tich Hinh Chu Nhat");
		System.out.println("4. Thoat");
	}

}
