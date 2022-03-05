package corejavaexample.main.encapsulation;

public class AreaMain {

	public static void main(String[] args) {

		Area rectangle = new Area(10,15);
		
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getBreadth());
				
		//calling area from another class
		// This is use for encapsulation to hide the data
		rectangle.getArea(); 
		
	}

}