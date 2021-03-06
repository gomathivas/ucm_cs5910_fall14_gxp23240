package edu.ucmo.ase.ecomm.sc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.ucmo.ase.ecomm.sc.model.ProductModel;
import edu.ucmo.ase.ecomm.sc.model.SearchModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;

@Controller
public class SearchProductController {

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;

	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;

	@Autowired
	@Qualifier("productService")
	private ProductService productService;

	@RequestMapping(value = "/search/{searchKeyWord}", method = RequestMethod.GET)
	public String doSearch(Model model,
			@PathVariable("searchKeyWord") String searchKeyWord) {

		this.sessionModel.setSearchKeyWord(searchKeyWord);
		List<ProductModel> pms = this.productService
				.getProductModelByKeyWord(searchKeyWord);

		sessionModel.setSearchResultPMs(pms);

		return "redirect:/search";
	}

	@RequestMapping(value = "/search")
	public String showSearch(Model model) {
		SearchModel sm = new SearchModel();
		sessionModel.setSearchModel(sm);
		model.addAttribute("searchModel", sm);
		return "search";
	}

	@RequestMapping(value = "/searchProduct")
	public String doSearch(Model model,
			@ModelAttribute("searchModel") SearchModel sm) {
		sessionModel.setSearchModel(sm);
		model.addAttribute("searchModel", sm);
		this.sessionModel.setSearchKeyWord(sm.getSearchKeyWord());
		List<ProductModel> pms = this.productService
				.getProductModelByKeyWord(sm.getSearchKeyWord());
		
		model.addAttribute("productList", pms);

		return "search";
	}
}
