package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.productDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
	@Autowired
	private productDao productDao;

	@RequestMapping("/")
	public String home(Model m) {
		
		List<Product> allProducts = productDao.getAllProducts();
		m.addAttribute("list", allProducts);
		return "index";
		}
	
//show add product form--->>>
	
	@RequestMapping("add-product")
	public String addProduct(Model m ) {
		m.addAttribute("title","ADD PRODUCT");
		return "add_product_form";
		
	}
	
// handle add product form-->>
	@RequestMapping(value="handle-product",method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product1,HttpServletRequest request) 
	{
		System.out.println(product1);
		productDao.createProduct(product1);
		RedirectView redirectView=new RedirectView(); 
        redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}
	
// delete handler--->>
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct( @PathVariable("productId") int productId ,HttpServletRequest request)
	{
		this.productDao.dltProoduct(productId);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView ;
		
	}
	
	
}
