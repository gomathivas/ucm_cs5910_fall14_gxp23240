package edu.ucmo.ase.ecomm.sc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import edu.ucmo.ase.ecomm.sc.model.CustomerModel;

public class NewCustomerValidator implements Validator{

	@Override
	public boolean supports(Class<?> parClass) {
		return CustomerModel.class.equals(parClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "new.customer.valid.firstName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "new.customer.valid.lastName");
	}

}
