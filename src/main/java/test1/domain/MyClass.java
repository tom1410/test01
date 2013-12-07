package test1.domain;
import test1.domain.mypackage.MyClass2;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class MyClass
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected byte[] attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne(mappedBy = "myClass") 
	protected MyClass2 myClass2;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected final Long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MyClass(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetMyClass2(MyClass2 myMyClass2) {
		if (this.myClass2 != myMyClass2) {
			if (myMyClass2 != null){
				if (this.myClass2 != myMyClass2) {
					MyClass2 oldmyClass2 = this.myClass2;
					this.myClass2 = myMyClass2;
					if (oldmyClass2 != null)
						oldmyClass2.unsetMyClass();
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public byte[] getAttribute() {
		return this.attribute;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public MyClass2 getMyClass2() {
		return this.myClass2;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setAttribute(byte[] myAttribute) {
		this.attribute = myAttribute;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setMyClass2(MyClass2 myMyClass2) {
		this.basicSetMyClass2(myMyClass2);
		myMyClass2.basicSetMyClass(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetAttribute() {
		this.attribute = new byte[32];	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetMyClass2() {
		if (this.myClass2 == null)
			return;
		MyClass2 oldmyClass2 = this.myClass2;
		this.myClass2 = null;
		oldmyClass2.unsetMyClass();	
	}
	
}

