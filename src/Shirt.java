public class Shirt {
    public int shirtID = 0131; 
    public String description = "Black T-Shirt"; 
    public String colorCode = "black"; 
    public double price = 14.99; 
    public int quantityInStock = 30; 

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode); 
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
