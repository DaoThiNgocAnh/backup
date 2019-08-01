package lession_5;



public class animal {
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public animal() {
		this.name = "Meo";
	}
	public animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
