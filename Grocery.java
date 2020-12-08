public class Grocery {
        public String productName;
        public int productInventory;
        public double productPrice;

    public Grocery(String name, int inventory, double price) {
        productName = name;
        productInventory = inventory;
        productPrice = price;
    }

    public static void enoughMoney(double money, String name, int inventory, double price) {
        double difference = money - (inventory*price);

        if (difference < 0) {
            System.out.println("You have enough money to buy all of the " + name + "s.");
        } else if (inventory == 0) {
            System.out.println("There is no inventory of " + name + ".");
        } else {
            System.out.println("You would need $" + Math.abs(difference) + " more to buy all of the " + name + "s.");
        }
    }

    public static void main(String args[]) {
        Grocery cheese = new Grocery("cheddar cheese", 8, 1.89);
        Grocery doritos = new Grocery("party size doritos", 25, 2.39);
        Grocery mountainDew = new Grocery("Montain Dew", 14, 1.20);
        Grocery pizza = new Grocery("pineapple pizza", 0, 6.99);

        if (cheese.productInventory==0 || doritos.productInventory==0 || mountainDew.productInventory==0 || pizza.productInventory==0) {
            System.out.println("You need to buy more inventory.");
        } else {
            System.out.println("We have all of the groceries in inventory!");
        }

        double dollars = 20.39;
        enoughMoney(dollars, mountainDew.productName, mountainDew.productInventory, mountainDew.productPrice);
    }
}