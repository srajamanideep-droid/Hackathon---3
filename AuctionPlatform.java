import java.util.*;

class Product {
private String productName;
private double startingPrice;
private String highestBidder;
private double highestBid;
public Product(String productName, double startingPrice) {
this.productName = productName.toUpperCase(); // String manipulation
this.startingPrice = startingPrice;
this.highestBid = startingPrice;
this.highestBidder = "None";
}
public void placeBid(String bidderName, double bidAmount) {
if (bidAmount > highestBid) {
highestBid = bidAmount;
highestBidder = bidderName;
System.out.println("Bidder Name : " + bidderName);
System.out.println("Bid Amount : Rs. " + bidAmount);
System.out.println("Bid Status : Bid Accepted\n");
}
else {
System.out.println("Bidder Name : " + bidderName);
System.out.println("Bid Amount : Rs. " + bidAmount);
System.out.println("Bid Status : Bid Rejected - Bid Must Be Higher\n");
}
}
public void placeBid(double bidAmount) {
placeBid("Anonymous", bidAmount);
}
public void displayProduct() {
System.out.println("Product Name : " + productName);
System.out.println("Starting Price : Rs. " + startingPrice);
}
public void auctionSummary() {
System.out.println("---------- AUCTION SUMMARY ----------");
System.out.println("Product Name : " + productName);
System.out.println("Winning Bidder : " + highestBidder);
System.out.println("Final Bid Amount : Rs. " + highestBid);
System.out.println("=============================================");
}
}
public class AuctionPlatform {
public static void main(String[] args) {
System.out.println("========== ONLINE AUCTION PLATFORM ==========");
Product laptop = new Product("Laptop", 50000.00);
laptop.displayProduct();
laptop.placeBid("RAVI", 52000.00);
laptop.placeBid("PRIYA", 55000.00);
laptop.placeBid("RAVI", 53000.00);
laptop.auctionSummary();
}
}
