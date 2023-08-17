class Car {
	private String brand;
	private String model;
	
	// Constructor
	Car(String brand, String model) {
	  this.brand = brand;
	  this.model = model;
	}
	
	void startEngine() {
	  System.out.println("Engine started!");
	}
	
	void stopEngine() {
		System.out.println("Engine stopped.");
	}
	
	// Getter for brand
	public String getBrand() {
	  return brand;
	}
	
	// Setter for brand
	public void setBrand(String carBrand) {
	  brand = carBrand;
	}
	
	// Getter for model
	public String getModel() {
	  return model;
	}
	
	// Setter for model
	public void setModel(String carModel) {
	  model = carModel;
	}
}

public class ExampleA {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
		myCar.startEngine();

		System.out.println(myCar.getBrand());

		myCar.setBrand("Honda");
		System.out.println(myCar.getBrand());
    }
}
