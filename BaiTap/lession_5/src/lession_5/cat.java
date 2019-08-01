package lession_5;

public class cat extends animal {
	protected int age;
	protected int height;
	public cat() {
		super();
		this.age = 0;
		this.height = 0;
	}
	public cat(String name,int age,int height) {
		super(name);
		this.age = age;
		this.height = height;
	}
	public static void main(String[] args) {
		cat p = new cat();
		p.setName("Meo con");
		System.out.println(p.getName());
	}

		
		
	}


