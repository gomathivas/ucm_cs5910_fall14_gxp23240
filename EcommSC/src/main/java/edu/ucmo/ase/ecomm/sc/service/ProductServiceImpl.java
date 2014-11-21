package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.ProductDAO;
import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.helper.ProductHelper;
import edu.ucmo.ase.ecomm.sc.model.ProductModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductDAO productDAO;

	@Override
	@Transactional
	public List<ProductModel> getProductList() {
		List<Product> products = this.productDAO.findAllProducts();
		List<ProductModel> pms = ProductHelper.mapProductToProductModel(products);
		return pms;
	}

	@Override
	@Transactional
	public ProductModel getProductById(Integer productId) {
		Product product = this.productDAO.findProductByID(productId);
		ProductModel pm = ProductHelper.mapProductToProductModel(product);
		return pm;
	}

	/*------------------------------------------------------------------------------------------- */
	/*
	 * Hard coded methods to be replaced
	 */
/*	private List<ProductModel> generateProdectList() {
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
	}*/

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

	@Override
	@Transactional
	public void removeProduct(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void addProduct(ProductModel pm, byte[] bytes,
			String originalFilename, String contentType) {
		
		Product product = ProductHelper.mapProductModelToProdct(pm, originalFilename, contentType);
		
		this.productDAO.addProduct(product, bytes);		
	}

	@Override
	@Transactional
	public List<ProductModel> getProductModelByKeyWord(String searchKeyWord) {
		
		List<Product> ps = this.productDAO.findProductsByKeyWord(searchKeyWord);
		
		List<ProductModel> pms = ProductHelper.mapProductToProductModel(ps);
		
		return pms;
	}



}
