package convenienceStoreManager;

public class ConvenienceStoreManagerDriver {
	
	public static void main(String[] args) {
		
		ConvenienceStoreManager convenienceStoreManager = new ConvenienceStoreManager();
		
		//BATCH ONE INVENTORY
		Food doritos = new Food("Doritos", 25, 185, 2.99, "Snacks");
		Food hersheysChocolateBars = new Food("Hersheys Chocolate Bar", 25, 185, .99, "Candy");
		Product juul = new Product("Juul", 30, 14.99);
		Beverage gatorade = new Beverage("Gatorade", 25, 50, 1.49, 'N');
		Beverage hennesy = new Beverage("Hennesy", 25, 50, 13.49, 'Y');
	
		//UNLOADING BATCH-ONE
		System.out.println("UNLOADING INVETORY...");
		convenienceStoreManager.addProducToBeStocked(hersheysChocolateBars);
		convenienceStoreManager.addProducToBeStocked(juul);
		convenienceStoreManager.addProducToBeStocked(doritos);
		convenienceStoreManager.addProducToBeStocked(hennesy);
		convenienceStoreManager.addProducToBeStocked(gatorade);
		System.out.println();
		System.out.println("DONE UNLOADING INVETORY...");
		System.out.println();
		
		//CHECKING UNSHELVED INVENTORY
		System.out.println("[CHECKING UNSHELVED INVENTORY]");
		System.out.println();
		System.out.print(convenienceStoreManager.seeUnstockedInventory());
		System.out.println();
		System.out.println("[DONE CHECKING UNSHELVED INVENTORY]");
		System.out.println();
		
		//STOCKING AND CHECKING SHELVED INVENTORY
		System.out.println("[STOCKING THE SHELVES]");
		System.out.println();
		convenienceStoreManager.stockShelves();
		System.out.print(convenienceStoreManager.seeShelvedInventory());
		System.out.println();
		System.out.println("[DONE STOCKING THE SHELVES]");
		
		//BATCH TWO INVENTORY
		Food moreDoritos = new Food("Doritos", 25, 185, 2.99, "Snacks");
		Food skittles = new Food("Skittles", 100, 150, 1.99, "Candy");
		Product juulPods = new Product("Juul Pods", 300, 5.99);
		Beverage pepsi = new Beverage("Pepsi", 25, 50, 1.99, 'N');
		Beverage bacardi = new Beverage("Bacardi", 25, 150, 19.99, 'Y');
		Product moreHennesy = new Product(hennesy); 
		
		//UNLOADING BATCH-TWO
		System.out.println("UNLOADING INVETORY...");
		convenienceStoreManager.addProducToBeStocked(moreDoritos);
		convenienceStoreManager.addProducToBeStocked(skittles);
		convenienceStoreManager.addProducToBeStocked(juulPods);
		convenienceStoreManager.addProducToBeStocked(pepsi);
		convenienceStoreManager.addProducToBeStocked(bacardi);
		convenienceStoreManager.addProducToBeStocked(moreHennesy);
		System.out.println();
		System.out.println("DONE UNLOADING INVETORY...");
		
		//CHECKING UNSHELVED INVENTORY
		System.out.println("[CHECKING UNSHELVED INVENTORY]");
		System.out.println();
		System.out.print(convenienceStoreManager.seeUnstockedInventory());
		System.out.println();
		System.out.println("[DONE CHECKING UNSHELVED INVENTORY]");
		
		//STOCKING AND CHECKING SHELVED INVENTORY
		System.out.println("[STOCKING THE SHELVES]");
		System.out.println();
		convenienceStoreManager.stockShelves();
		System.out.print(convenienceStoreManager.seeShelvedInventory());
		System.out.println("[DONE STOCKING THE SHELVES]");
		
		//SHELVED INVENTORY CHECK
		System.out.println();
		System.out.println("[CHECKING INVENTORY QUANTITY]");
		System.out.println();
		System.out.println("GETTING NUMBER OF DORITOS: " + convenienceStoreManager.getProductQuantity("Doritos"));
		System.out.println();
		System.out.println("GETTING NUMBER OF PEPSI: " + convenienceStoreManager.getProductQuantity("Pepsi"));
		System.out.println();
		System.out.println("GETTING NUMBER OF SKITTLES: " + convenienceStoreManager.getProductQuantity("Skittles"));
		System.out.println();
		System.out.println("[DONE CHECKING INVENTORY QUANTITY]");
		System.out.println();
		
		//END STATEMENT
		ConvenienceStoreManager.closeManager();
		
	}
	
}

