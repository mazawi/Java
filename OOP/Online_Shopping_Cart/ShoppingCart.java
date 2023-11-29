package Online_Shopping_Cart;

class ShoppingCart {
    int itemCount;
    Product[] items;

    public ShoppingCart() {
        itemCount = 0;
        items = new Product[10]; // Assuming a maximum of 10 items for simplicity
    }

    public void addItem(Product product) {
        if (itemCount < items.length) {
            items[itemCount++] = product;
            System.out.println(product.name + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }
        return total;
    }
}

