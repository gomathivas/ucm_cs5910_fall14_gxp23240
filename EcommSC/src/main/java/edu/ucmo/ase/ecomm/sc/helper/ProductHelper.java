package edu.ucmo.ase.ecomm.sc.helper;

import java.util.ArrayList;
import java.util.List;

import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.model.ProductModel;

public class ProductHelper {

	public static List<ProductModel> mapProductToProductModel(
			List<Product> products) {
		List<ProductModel> pms = new ArrayList<ProductModel>();
		for (Product product : products) {
			ProductModel pm = mapProductToProductModel(product);
			pms.add(pm);
		}
		return pms;
	}

	public static ProductModel mapProductToProductModel(Product product) {
		
		ProductModel pm = new ProductModel();
		
		pm.setProductId(product.getProductId());
		pm.setOldPrice(product.getProductPrice());
		pm.setNewPrice(product.getProductPrice());
		pm.setProductShortDes(product.getProductName());
		pm.setProductLongDes(product.getProductDesc());
		
		pm.setContentType(product.getContentType());
		pm.setFilename(product.getFilename());
		
		pm.setProductImage(product.getProductImage());
		
		return pm;
	}

	public static Product mapProductModelToProdct(ProductModel pm,
			String originalFilename, String contentType) {
		Product p = new Product();
		p.setFilename(originalFilename);
		p.setContentType(contentType);
		p.setProductName(pm.getProductShortDes());
		p.setProductDesc(pm.getProductLongDes());
		p.setProductPrice(pm.getNewPrice());
		return p;
	}

}
