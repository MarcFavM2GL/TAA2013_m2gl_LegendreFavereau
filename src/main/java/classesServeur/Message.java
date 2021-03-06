package classesServeur;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

@Entity
public class Message
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@OneToOne
	protected User sender;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@Temporal(javax.persistence.TemporalType.DATE)
	@Column(nullable = false)
	protected Date sendTime;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@Column(nullable = false)
	protected String message;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@ManyToMany(mappedBy = "message")
	protected Set<Workout> workout;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@Id
	@Column(nullable = false)
	protected Long id = 0L;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Message(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public User getSender() {
		return this.sender;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getSendTime() {
		return this.sendTime;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getMessage() {
		return this.message;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Workout> getWorkout() {
		if(this.workout == null) {
				this.workout = new HashSet<Workout>();
		}
		return (Set<Workout>) this.workout;	
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
	public void addAllWorkout(Set<Workout> newWorkout) {
		if (this.workout == null) {
			this.workout = new HashSet<Workout>();
		}
		for (Workout tmp : newWorkout)
			tmp.addMessage(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllWorkout(Set<Workout> newWorkout) {
		if(this.workout == null) {
			return;
		}
		
		this.workout.removeAll(newWorkout);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setSender(User mySender) {
		this.sender = mySender;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setSendTime(Date mySendTime) {
		this.sendTime = mySendTime;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setMessage(String myMessage) {
		this.message = myMessage;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addWorkout(Workout newWorkout) {
		if(this.workout == null) {
			this.workout = new HashSet<Workout>();
		}
		
		if (this.workout.add(newWorkout))
			newWorkout.addMessage(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetSender() {
		//this.sender = new User();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetSendTime() {
		this.sendTime = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetMessage() {
		this.message = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeWorkout(Workout oldWorkout) {
		if(this.workout == null)
			return;
		
		if (this.workout.remove(oldWorkout))
			oldWorkout.removeMessage(this);
			
	}
	
}
