package productcrudapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int productId;	
private String productName;	
private String productDescription;	
private int productPrice;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public Product(int productId, String productName, String productDescription, int productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
			+ productDescription + ", productPrice=" + productPrice + "]";
}

}
