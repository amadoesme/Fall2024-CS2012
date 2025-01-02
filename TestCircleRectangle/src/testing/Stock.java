package testing;

public class Stock {
    
    // Data fields
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    // Constructor that creates a stock with the specified symbol and name
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    
    // Getters and setters
    public String getSymbol() {
        return symbol;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }
    
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    
    public double getCurrentPrice() {
        return currentPrice;
    }
    
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    // Method to calculate the percentage change from previousClosingPrice to currentPrice
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    
    public static void main(String[] args) {
        // Create a Stock object
        Stock orclStock = new Stock("ORCL", "Oracle Corporation");
        
        // Set the previous closing price and current price
        orclStock.setPreviousClosingPrice(34.5);
        orclStock.setCurrentPrice(34.35);
        
        // Display the price-change percentage
        System.out.println("Stock Symbol: " + orclStock.getSymbol());
        System.out.println("Stock Name: " + orclStock.getName());
        System.out.println("Previous Closing Price: " + orclStock.getPreviousClosingPrice());
        System.out.println("Current Price: " + orclStock.getCurrentPrice());
        System.out.println("Price-Change Percentage: " + orclStock.getChangePercent() + "%");
    }
}
