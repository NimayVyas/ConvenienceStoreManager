//Package Declaration
package convenienceStoreManager;

//Food Class
public class Food extends Product{

	//Instance Variables
	private String foodCategory;

	//Constructor
	public Food(String productName, int quantity, int calories, double wholesalePrice, String foodCategory) {
		super(productName, quantity, calories, wholesalePrice);
		this.setFoodCategory(foodCategory);
	}

	//Getter For Food Category
	public String getFoodCategory() {
		return foodCategory;
	}

	//Setter For Food Category
	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}
	
	//ToString Method
	@Override
	public String toString() {
		return "[Product: " + super.productName + "] [Quantity: " + super.quantity
		+ "] [Calories: " + super.calories + "] [Wholesale Price: " + super.wholesalePrice + "] [Category: " + foodCategory + "]";
	}
	
}
