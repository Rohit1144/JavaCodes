package com.demo.serviceipl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.servie.ProductService;

@Component
public class ProductServiceImp implements ProductService {

	@Override
	public void addProductDetails(Product prodcut) {


	}

	@Override
	public List<Product> getListOfProducts() {

		return null;
	}

	@Override
	public Product updateProductDetailsBtyId(int id) {

		return null;
	}
              //logic here
	@Override
	public Product getDetailsById(int id) {

		Product prod = new Product();
		prod.setId(id);  //id comes from parameter so don't hard-code here
		prod.setProductname("MAC");
		prod.setColor("black");
		prod.setOs("linux");
		return prod;
	}

	@Override
	public void deleteProductById(int id) {


	}

}
