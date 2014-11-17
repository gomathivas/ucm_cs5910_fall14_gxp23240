/**
 * 
 */
package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.model.ProductModel;

/**
 * @author gomathi
 *
 */
public interface ProductService {
	
	public List<ProductModel> getProductList();

	/**
	 * Finds a product by id and return it
	 * @param productId ProductId {@link Integer} 
	 * @return {@link ProductModel}
	 */
	public ProductModel getProductById(Integer productId);
}
