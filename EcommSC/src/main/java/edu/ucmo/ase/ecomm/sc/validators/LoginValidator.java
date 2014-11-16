package edu.ucmo.ase.ecomm.sc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import edu.ucmo.ase.ecomm.sc.model.LoginModel;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> parClass) {
		return LoginModel.class.equals(parClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "login.valid.userName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "login.valid.password");
	}

}
