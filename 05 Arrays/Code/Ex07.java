// Java program that initializes an array containing the prices of 10 items, adds a 5% tax to each price, and saves the updated prices in a new array
public class Ex07
{
    public static void main(String[] args) 
    {
        // Initialize an array with the prices of 10 items
        double[] itemPrices = {25.50, 15.75, 30.00, 12.99, 8.49, 50.25, 19.99, 5.50, 42.75, 10.00};

        // Calculate prices with 5% tax and store in a new array
        double[] pricesWithTax = new double[itemPrices.length];

        for (int i = 0; i < itemPrices.length; i++) 
        {
            // Add 5% tax to each item price
            pricesWithTax[i] = itemPrices[i] * 1.05;
        }

        // Display the original and updated prices
        System.out.println("Original Prices of 10 Items:");
        for (int i = 0; i < itemPrices.length; i++) 
        {
            System.out.println("The price of item "+ (i+1) + " Was "+itemPrices[i] +" Bacame afte adding tax: "+ pricesWithTax[i]);
        }

        
    }

}
