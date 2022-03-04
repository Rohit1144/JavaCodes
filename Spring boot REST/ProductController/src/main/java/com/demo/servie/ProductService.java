package com.demo.servie;

import java.util.List;

import com.demo.pojo.Product;

public interface ProductService {
	
	    // POST
		void addProductDetails(Product prodcut);

		// GET
		List<Product> getListOfProducts();

		/// PUT
		Product updateProductDetailsBtyId(int id);

		// GET
		Product getDetailsById(int id);

		// delete by id
		void deleteProductById(int id);

}
