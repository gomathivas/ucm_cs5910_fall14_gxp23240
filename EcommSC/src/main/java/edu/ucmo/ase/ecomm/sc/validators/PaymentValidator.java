package edu.ucmo.ase.ecomm.sc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import edu.ucmo.ase.ecomm.sc.model.PaymentModel;

public class PaymentValidator implements Validator{

	@Override
	public boolean supports(Class<?> parClass) {
		return PaymentModel.class.equals(parClass);
	}

	@Override
	public void validate(Object target, Errors errors) {

		System.out.println("in payment validator");
	}

}
