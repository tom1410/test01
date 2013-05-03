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
public class ProductValidator implements Validator
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ProductValidator(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean supports(Class<?> classz) {
		return org.springframework.util.ClassUtils.isAssignable(classz, com.genmymodel.shoppingcart.domain.Product.class);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void validate(Object target, Errors errors) {
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"id","required");	
	}
	
}

