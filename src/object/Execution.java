package object;

public class Execution {
	public static void main(String[] args) {
		//Create object
		Laptop laptop = new Laptop();
		Car car = new Car();
		//desired_class_name  refferance_variable = new(keyword) 
		
		System.out.println(laptop.brand);
		car.engine="v6";
		car.engine="v8";
	
		
		System.out.println(laptop.model);
		System.out.println(laptop.production_year);
		
		System.out.println(laptop.brand+laptop.model+laptop.production_year);
		System.out.println(car.brand);
		System.out.println(car.colour);
		
	}

}
