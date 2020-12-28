//Package Declaration
package convenienceStoreManager;

//Product Class
public class Product implements Comparable<Product> {

	//Instance Variables
	public String productName;
	public int quantity;
	public int calories;
	public double wholesalePrice;
	
	//Default Constructor
	public Product(String productName, int quantity, int calories, double wholesalePrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.calories = calories;
		this.wholesalePrice = wholesalePrice;
	}
	
	//Constructor
	public Product(String productName, int quantity, double wholesalePrice) {
		this(productName, quantity, 0, wholesalePrice);
	}
	
	//Copy Constructor
	public Product(Product product) {
		this.productName = product.productName;
		this.quantity = product.quantity;
		this.calories = product.calories;
		this.wholesalePrice = product.wholesalePrice;
	}

	//Getter For ProductName
	public String getProductName() {
		return productName;
	}

	//Setter For Product Name
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	//Getter For Calories
	public int getCalories() {
		return calories;
	}

	//Setter For Calories
	public void setCalories(int calories) {
		this.calories = calories;
	}

	//Getter For Quantities
	public int getQuantity() {
		return quantity;
	}

	//Setter For Quantities
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Getter For WholesalePrice
	public double getWholesalePrice() {
		return wholesalePrice;
	}

	//Setter For WholesalePrice
	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
	
	//ToString Method
	public String toString() {
		return "[Product: " + productName + "] [Quantity: " + quantity + "] [Wholesale Price: " 
				+ wholesalePrice + "]";
	}

	//CompareTo Method
	@Override
	public int compareTo(Product other) {
		//Double Check Over Here
		return this.productName.compareTo(other.productName);
	}
	
}
