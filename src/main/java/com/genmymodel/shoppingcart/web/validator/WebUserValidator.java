package com.genmymodel.shoppingcart.web.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import java.lang.Object;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class WebUserValidator implements Validator
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public WebUserValidator(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean supports(Class<?> classz) {
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.WebUser.class);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void validate(Object target, Errors errors) {
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"id","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"","required");	
	}
	
}

