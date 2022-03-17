import java.util.Calendar;

public class Product {

	private String productName;
	private Calendar saleDate;
	private double price;

	public Product(String productName, Calendar saleDate, double price) {
		if (productName.length() < 3) {
			System.out.println("Should be longer than 3.");
		} else {
			this.productName = productName;
		}

		this.saleDate = saleDate;
		if (price <= 0) {
			System.out.println("Should be positive.");
		} else {
			this.price = price;
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		if (productName.length() < 3) {
			System.out.println("Should be longer than 3.");
		} else {
			this.productName = productName;
		}
	}

	public Calendar getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Calendar saleDate) {
		this.saleDate = saleDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			System.out.println("Should be positive.");
		} else {
			this.price = price;
		}
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", saleDate=" + saleDate + ", price=" + price + "]";
	}

}
