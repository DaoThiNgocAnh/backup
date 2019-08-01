package lession_3;

import java.util.Scanner;

public class car {
		private String name;
		private String id;
		private int price;
		private String brand;
	public car(String name, String id, int price, String brand) {
			super();
			this.name = name;
			this.id = id;
			this.price = price;
			this.brand = brand;
		}
	public car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void inputInf() {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		id = sc.nextLine();
		price = sc.nextInt();
		sc.nextLine();
		brand = sc.nextLine();
	}
	public void output() {
		System.out.println("name: " +name);
		System.out.println("ID: " +id);
		System.out.println("price: " +price);
		System.out.println("brand: " +brand);
	}

	}





