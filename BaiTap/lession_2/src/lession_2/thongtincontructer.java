package lession_2;

import java.util.Scanner;

public class thongtincontructer {
	public class Person{
		private String name;
		private String gender;
		private int phone ;
		public Person(String name, String gender, int phone) {
			super();
			this.name = name;
			this.gender = gender;
			this.phone = phone;
		}
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void inputinf() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ten");
			name = sc.nextLine();
			System.out.println("Gioi tinh");
			gender = sc.nextLine();
			System.out.println("So dt");
			phone = sc.nextInt();
		}
		public void display() {
			System.out.println("name: " +name);
			System.out.println("gender: " +gender);
			System.out.println("So dt: " +phone);
		}
	}

	public static void main(String[] args) {
		

	}

}
