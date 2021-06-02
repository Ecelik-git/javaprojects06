package week08;

public class Cuboid extends Rectangle{
	/*
	 2. Write a class with the name Cuboid that extends Rectangle class. 
	The class needs one field (instance variable) with name height of type double.
	The class needs to have one constructor with three parameters width, length, and height all of type double. 
	It needs to call parent constructor and initialize a height field.
	In case the height parameter is less than 0 it needs to set the height field value to 0.
	Write the following methods (instance methods):
	* Method named getHeight without any parameters, it needs to return the value of height field.
	* Method named getVolume without any parameters, it needs to return the calculated volume. 
	* To calculate volume multiply the area with height.
	 */
	
	private double height;
	private double volume;
	
	
	public Cuboid (double height, double width, double length) {
		super(width, length);
		
		if(height<0) {
			this.height = 0;
		}else {
			this.height = height;
		}
		
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		volume = getArea()*height;
		return volume;
	}
	public static void main(String[] args) {
		
		Cuboid c = new Cuboid(3, 5, 7);
		System.out.println("Cuboid width is: "+c.getWidth());
		System.out.println("Cuboid length is: "+c.getLength());
		System.out.println("Cuboid height is: "+c.getHeight());
		System.out.println("Cuboid area is: "+c.getArea());
		System.out.println("Cuboid volume is: "+c.getVolume());

	}

}
