package edu.ucmo.ase.ecomm.sc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.ProductDAO;
import edu.ucmo.ase.ecomm.sc.model.ProductModel;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductDAO productDAO;

	@Override
	public List<ProductModel> getProductList() {
		return generateProdectList();
	}

	@Override
	@Transactional
	public ProductModel getProductById(Integer productId) {
		return hcFindProductById(productId);
	}

	/*------------------------------------------------------------------------------------------- */
	/*
	 * Hard coded methods to be replaced
	 */private List<ProductModel> generateProdectList() {
		List<ProductModel> pm = new ArrayList<ProductModel>();
		pm.add(new ProductModel(1, "my book", 270, 350));
		pm.add(new ProductModel(2, "Iphone 6", 100, 350));
		pm.add(new ProductModel(3, "Webcam", 150, 250));
		pm.add(new ProductModel(4, "Motorola 156 MX-VL", 200, 350));
		pm.add(new ProductModel(5, "Iphone Apple", 350, 350));
		pm.add(new ProductModel(6, "xBox", 320, 350));
		pm.add(new ProductModel(7, "Motorola 156 MX-VL", 450, 350));
		pm.add(new ProductModel(8, "Iphone Apple", 180, 350));
		pm.add(new ProductModel(9, "Sony PlayStation", 210, 330));
		return pm;
	}

	private ProductModel hcFindProductById(Integer productId) {
		List<ProductModel> pmlist = generateProdectList();
		ProductModel selectedProduct = null;
		for (ProductModel productModel : pmlist) {
			if(productModel.getProductId().compareTo(productId) == 0)	{
				selectedProduct = productModel;
			}
		}
		return selectedProduct;
	}

	@Override
	@Transactional
	public void addProduct(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void updateProduct(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	@Transactional
	public List<ProductModel> getAllProductListByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<ProductModel> getProductListByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

}
