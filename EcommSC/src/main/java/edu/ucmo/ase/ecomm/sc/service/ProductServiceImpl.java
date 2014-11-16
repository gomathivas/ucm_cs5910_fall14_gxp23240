package edu.ucmo.ase.ecomm.sc.service;

import java.util.ArrayList;
import java.util.List;

import edu.ucmo.ase.ecomm.sc.model.ProductModel;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductModel> getProductList() {
		return generateProdectList();
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

}
