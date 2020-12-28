//Package Declaration
package convenienceStoreManager;

//Beverage Class
public class Beverage extends Product {

	//Instance Variables
	public char isAlchoholic;

	//Constructor
	public Beverage(String productName, int quantity, int calories, double wholesalePrice, char isAlcoholic) {
		super(productName, quantity, calories, wholesalePrice);
		this.isAlchoholic = isAlcoholic;
	}
	
	//Getter For IsAlcoholic
	public char isAlchoholic() {
		return isAlchoholic;
	}

	//Setter For Is Alcoholic
	public void setAlchoholic(char isAlchoholic) {
		this.isAlchoholic = isAlchoholic;
	}

	//ToString Method
	@Override
	public String toString() {
		return "[Product: " + super.productName + "] [Quantity: " + super.quantity
		+ "] [Calories: " + super.calories + "] [Wholesale Price: " + super.wholesalePrice + "] [Alcholic: " + isAlchoholic + "]";
	}

}
