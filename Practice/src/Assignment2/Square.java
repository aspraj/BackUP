package Assignment2;

public class Square {
	
	private Integer base;
	private Integer height;
	
	

	public Square(Integer base, Integer height) {
		this.base = base;
		this.height = height;
	}
	
	public void Area() {
		int area = base*height;
		System.out.println("Area of square "+area);
	}
	
	public Integer getBase() {
		return base;
	}
	public void setBase(Integer base) {
		this.base = base;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	
}
