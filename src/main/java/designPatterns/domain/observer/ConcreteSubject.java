package designPatterns.domain.observer;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class ConcreteSubject implements Subject
{
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
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany 
	@javax.persistence.JoinTable 
	protected Set<Observer> observes;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ConcreteSubject(){
		super();
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
	public void removeAllObserves(Set<Observer> newObserves) {
		if(this.observes == null) {
			return;
		}
		
		this.observes.removeAll(newObserves);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	public void notifyObservers(List<Observer> obs) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	public void removeObserver(Observer ob) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllObserves(Set<Observer> newObserves) {
		if (this.observes == null) {
			this.observes = new HashSet<Observer>();
		}
		this.observes.addAll(newObserves);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Observer> getObserves() {
		if(this.observes == null) {
				this.observes = new HashSet<Observer>();
		}
		return (Set<Observer>) this.observes;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addObserves(Observer newObserves) {
		if(this.observes == null) {
			this.observes = new HashSet<Observer>();
		}
		
		this.observes.add(newObserves);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	public void addObserver(Observer ob) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeObserves(Observer oldObserves) {
		if(this.observes == null)
			return;
		
		this.observes.remove(oldObserves);	
	}
	
}

