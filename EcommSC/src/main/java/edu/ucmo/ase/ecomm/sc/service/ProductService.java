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
	
	public void addProduct(ProductModel product);
	
	public void updateProduct(ProductModel product);
	
	public void removeProduct(ProductModel product);
	
	public List<ProductModel> getAllProductListByCategory();
	
	public List<ProductModel> getProductListByCategoryName(String categoryName);

	public void addProduct(ProductModel pm, byte[] bytes,
			String originalFilename, String contentType);
}
