package classesServeur;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

@Entity
public class Parcours
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@Column(nullable = false)
	protected String ptDepart;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@OneToMany
	protected Set<GPSPoint> gPSPoint;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@OneToOne(mappedBy = "parcours")
	protected Workout workout;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@Id
	@Column(nullable = false)
	protected final Long id = 0L;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Parcours(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetWorkout(Workout myWorkout) {
		if (this.workout != myWorkout) {
			if (myWorkout != null){
				if (this.workout != myWorkout) {
					Workout oldworkout = this.workout;
					this.workout = myWorkout;
					if (oldworkout != null)
						oldworkout.unsetParcours();
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
	public String getPtDepart() {
		return this.ptDepart;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<GPSPoint> getGPSPoint() {
		if(this.gPSPoint == null) {
				this.gPSPoint = new HashSet<GPSPoint>();
		}
		return (Set<GPSPoint>) this.gPSPoint;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Workout getWorkout() {
		return this.workout;	
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
	public void addAllGPSPoint(Set<GPSPoint> newGPSPoint) {
		if (this.gPSPoint == null) {
			this.gPSPoint = new HashSet<GPSPoint>();
		}
		for (GPSPoint tmp : newGPSPoint)
			tmp.setParcours(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllGPSPoint(Set<GPSPoint> newGPSPoint) {
		if(this.gPSPoint == null) {
			return;
		}
		
		this.gPSPoint.removeAll(newGPSPoint);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setPtDepart(String myPtDepart) {
		this.ptDepart = myPtDepart;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addGPSPoint(GPSPoint newGPSPoint) {
		if(this.gPSPoint == null) {
			this.gPSPoint = new HashSet<GPSPoint>();
		}
		
		if (this.gPSPoint.add(newGPSPoint))
			newGPSPoint.basicSetParcours(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setWorkout(Workout myWorkout) {
		this.basicSetWorkout(myWorkout);
		myWorkout.basicSetParcours(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetPtDepart() {
		this.ptDepart = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeGPSPoint(GPSPoint oldGPSPoint) {
		if(this.gPSPoint == null)
			return;
		
		if (this.gPSPoint.remove(oldGPSPoint))
			oldGPSPoint.unsetParcours();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetWorkout() {
		if (this.workout == null)
			return;
		Workout oldworkout = this.workout;
		this.workout = null;
		oldworkout.unsetParcours();	
	}
	
}

