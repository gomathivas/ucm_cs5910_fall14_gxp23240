package edu.ucmo.ase.ecomm.sc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

import edu.ucmo.ase.ecomm.sc.model.PaymentModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;

@Controller
public class CheckOutController {

	private static final String PAYMENT_AND_SHIPPING = "paymentAndShipping";
	private static final String REDIRECT = "redirect:/";
	private static final String CHECK_OUT = "/checkOut";
	private static final String LOG_IN = "login";
	private static final String PAYMENT_CONFIRMATION_MAP = "/paymentConfirmation";
	private static final String PAYMENT_CONFIRMATION_SUCCESS = "paymentConfirmation";

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
	@Qualifier("paymentValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value = CHECK_OUT, method = RequestMethod.GET)
	public String doCheckOut(Model model) {

		if (!this.sessionModel.isUserLoggedIn()) {
			this.sessionModel.setCheckOutAfterLogIn(true);
			return REDIRECT + LOG_IN;
		}

		else {
			model.addAttribute("paymentModel",
					this.sessionModel.getPaymentModel());
		}

		return PAYMENT_AND_SHIPPING;
	}

	@RequestMapping(value = PAYMENT_CONFIRMATION_MAP, method = RequestMethod.POST)
	public String doPaymentConfirmation(Model model,
			@Validated PaymentModel paymentModel, BindingResult result) {

		return PAYMENT_CONFIRMATION_SUCCESS;
	}

}
