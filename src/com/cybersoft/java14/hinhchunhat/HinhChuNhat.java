package com.cybersoft.java14.hinhchunhat;

import java.util.Scanner;

public class HinhChuNhat  {
	private float chieuDai;
	private float chieuRong;
	
	public HinhChuNhat() {
		chieuDai=0;
		chieuRong=0;
	}
	public HinhChuNhat(float chieuDai, float chieuRong) {
		
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap  chieu dai : ");
		this.chieuDai=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap chieu rong : ");
		this.chieuRong=Float.parseFloat(sc.nextLine());
	}
	
	public float calculateDienTich() {
		return this.chieuDai*this.chieuRong;
	}
	public float calculateChuvi() {
		return (this.chieuDai+this.chieuRong)*2;
	}
	
}
