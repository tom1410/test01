package designPatterns.domain.observer;

import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;


/**
 * notifyObservers:
 * 
 * for each ob in observers
 * {
 *      ob.update();
 * }
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
public  interface Subject 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllObserves(Set<Observer> newObserves) ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	public void addObserver(Observer ob) ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addObserves(Observer newObserves) ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Observer> getObserves() ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	public void notifyObservers(List<Observer> obs) ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllObserves(Set<Observer> newObserves) ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	public void removeObserver(Observer ob) ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeObserves(Observer oldObserves) ;
	
}

