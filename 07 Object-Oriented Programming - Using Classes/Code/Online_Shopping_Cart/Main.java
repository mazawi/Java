package Online_Shopping_Cart;

public class Main 
{
    public static void main(String[] args) 
    {
        Product laptop = new Product("Laptop", 1200);
        Product headphones = new Product("Headphones", 100);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(headphones);

        System.out.println("Total cost in the shopping cart: $" + cart.calculateTotal());
    }
}
