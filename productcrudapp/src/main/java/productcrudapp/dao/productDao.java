package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component

public class productDao{
	
@Autowired
	private HibernateTemplate hibernateTemplate;

//create--->>>
@Transactional
public void createProduct(Product product) {
	this.hibernateTemplate.saveOrUpdate(product);
}
//get all product--->>>
public List<Product> getAllProducts(){
	
	List<Product> Allproducts = this.hibernateTemplate.loadAll(Product.class);
	return Allproducts;	
}

//Delete The Single Product--->>>
@Transactional
public void dltProoduct(int productId) {
	Product p1 = this.hibernateTemplate.load(Product.class, productId);// yhan wo product nikal liya jo dlt karna
	this.hibernateTemplate.delete(p1);//yhan dlt main main project de diya aur dlt kr diya
}
//Get the single product--->>>
@Transactional
public Product getTheSingleProduct(int productId) {
	Product p1 = this.hibernateTemplate.get(Product.class,productId);
	return p1;

	
}

}
