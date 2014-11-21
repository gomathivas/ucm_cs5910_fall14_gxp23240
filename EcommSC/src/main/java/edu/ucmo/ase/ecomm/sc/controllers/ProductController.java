package edu.ucmo.ase.ecomm.sc.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import edu.ucmo.ase.ecomm.sc.model.ProductModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	@RequestMapping("/addProduct")
	public String index(Map<String, Object> map) {
		try {
			map.put("productModel", new ProductModel());
			map.put("productModelList", this.productService.getProductList());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "addProduct";
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public String save(@ModelAttribute("productModel") ProductModel pm,
			@RequestParam("file") MultipartFile file) {

//		System.out.println("Name:" + document.getName());
//		System.out.println("Desc:" + document.getDescription());
//		System.out.println("File:" + file.getName());
//		System.out.println("ContentType:" + file.getContentType());

		try {
//			Blob blob = Hibernate.createBlob(file.getInputStream());
			
//			Blob blob = Hibernate.getLobCreator(sessionFactory.getCurrentSession()).createBlob(file.getBytes());
			this.productService.addProduct(pm, file.getBytes(), file.getOriginalFilename(), file.getContentType());
//			document.setFilename(file.getOriginalFilename());
//			document.setContent(blob);
//			document.setContentType(file.getContentType());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			this.productService.addProduct(pm);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/addProduct";
	}

	@RequestMapping("/download/{productId}")
	public String download(@PathVariable("productId") Integer productId,
			HttpServletResponse response) {

		ProductModel pm = this.productService.getProductById(productId);
		try {
			response.setHeader("Content-Disposition", "inline;filename=\""
					+ pm.getFilename() + "\"");
			OutputStream out = response.getOutputStream();
			response.setContentType(pm.getContentType());
			IOUtils.copy(pm.getProductImage().getBinaryStream(), out);
			out.flush();
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
	  public void showImage(@RequestParam("productId") Integer productId, HttpServletResponse response,HttpServletRequest request) 
	          throws ServletException, IOException{

		ProductModel pm = this.productService.getProductById(productId);
		
		int blobLength;
		byte[] blobAsBytes = null;
		try {
			blobLength = (int) pm.getProductImage().length();
			blobAsBytes = pm.getProductImage().getBytes(1, blobLength);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 
	    response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
	    response.getOutputStream().write(blobAsBytes);


	    response.getOutputStream().close();
	    
	}

/*	@RequestMapping("/remove/{documentId}")
	public String remove(@PathVariable("documentId") Integer documentId) {

		documentDao.remove(documentId);

		return "redirect:/index.html";
	}*/
}
