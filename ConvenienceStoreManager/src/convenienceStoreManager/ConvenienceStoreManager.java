//Package Declaration
package convenienceStoreManager;

//Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Convenience Store Manager Class
public class ConvenienceStoreManager {

	// Instance Variables
	private List<Product> yetToBeStocked = null;
	private List<Product> storeCurrentInventory;

	// Constructor
	public ConvenienceStoreManager() {
		openManager();
		yetToBeStocked = new ArrayList<Product>();
		storeCurrentInventory = new ArrayList<Product>();

	}

	// AddProducToBeStocked Method
	public void addProducToBeStocked(Product product) {
		try {
			for (int i = 0; i < yetToBeStocked.size(); i++) {
				if (yetToBeStocked.get(i).productName.equals(product.productName)) {
					yetToBeStocked.get(i).quantity += product.quantity;
					return;
				}
			}
			yetToBeStocked.add(product);
		} catch (IllegalArgumentException e) {
			System.out.println("Invlaid Parameter");
		}
	}

	/*
	 * AddFoodToBeStocked Method (Testing Purposes) public void
	 * addFoodToBeStocked(Food food) {
	 * 
	 * try {
	 * 
	 * for (int i = 0; i < storeCurrentInventory.size(); i++) {
	 * 
	 * if (storeCurrentInventory.get(i).productName.equals(food.productName)) {
	 * storeCurrentInventory.get(i).quantity += food.quantity; break; }
	 * 
	 * }
	 * 
	 * yetToBeStocked.add(food);
	 * 
	 * } catch (IllegalArgumentException e) {
	 * 
	 * System.out.println("Invlaid Parameter");
	 * 
	 * } }
	 */

	/*
	 * AddBeverageToBeStocked (Practice Purposes) public void
	 * addBeverageToBeStocked(Beverage beverage) {
	 * 
	 * try {
	 * 
	 * for (int i = 0; i < yetToBeStocked.size(); i++) {
	 * 
	 * if (yetToBeStocked.get(i).productName.equals(beverage.productName)) {
	 * yetToBeStocked.get(i).quantity += beverage.quantity; return; }
	 * 
	 * }
	 * 
	 * yetToBeStocked.add(beverage);
	 * 
	 * } catch (IllegalArgumentException e) {
	 * 
	 * System.out.println("Invlaid Parameter");
	 * 
	 * } }
	 */

	// StockShelves Method
	public void stockShelves() {
		for (int i = 0; i < yetToBeStocked.size(); i++) {
			for (int j = 0; j < storeCurrentInventory.size(); j++) {
				if (yetToBeStocked.get(i).productName.equals(storeCurrentInventory.get(j).productName)) {
					storeCurrentInventory.get(j).quantity += yetToBeStocked.get(i).quantity;
					yetToBeStocked.remove(i);
				}
			}
			storeCurrentInventory.add(yetToBeStocked.get(i));
		}
		yetToBeStocked.clear();
	}

	// SeeUnstockedInventory Method
	public String seeUnstockedInventory() {
		String inventoryString = "UNSTOCKED INVENTORY" + "\n";
		inventoryString += "\n";
		Collections.sort(yetToBeStocked);
		for (int i = 0; i < yetToBeStocked.size(); i++) {
			inventoryString += "Product " + (i + 1) + ": " + yetToBeStocked.get(i);
			inventoryString += "\n";
			inventoryString += "\n";
		}
		return inventoryString;
	}

	// SeeShelvedInventoryMethod
	public String seeShelvedInventory() {
		String inventoryString = "CURRENT SHELVED INVENTORY" + "\n";
		inventoryString += "\n";
		Collections.sort(storeCurrentInventory);
		for (int i = 0; i < storeCurrentInventory.size(); i++) {
			inventoryString += "Shelf " + (i + 1) + ": " + storeCurrentInventory.get(i);
			inventoryString += "\n";
			inventoryString += "\n";
		}
		return inventoryString;
	}

	// GetProductQuantity Method
	public int getProductQuantity(String productName) {
		try {
			for (int i = 0; i < storeCurrentInventory.size(); i++) {
				if (storeCurrentInventory.get(i).productName.equals(productName)) {
					return storeCurrentInventory.get(i).quantity;
				}
			}
			return 0;
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Parameter");
			return 0;
		}
	}

	// OpenManager Method
	private static void openManager() {
		System.out.println("Thank You For Activating The Convenience Store Management System!");
		System.out.println();
	}

	// CloseManagerMethod
	public static void closeManager() {
		System.out.println("Thank You For Using The Convenience Store Management System!");
		System.out.println();
	}

}
