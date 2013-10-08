package tpTAA_sportTracker.domain;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

@javax.persistence.Entity
public class Workout
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected double duration;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
	@javax.persistence.Column(nullable = false)
	protected Date date;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
	@javax.persistence.Column(nullable = false)
	protected Date departureTime;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
	@javax.persistence.Column(nullable = false)
	protected Date finishTime;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	@javax.persistence.Column(nullable = false)
	protected Sport typeSport;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Column(nullable = false)
	protected String comments;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.Id
	@javax.persistence.Column(nullable = false)
	protected Long id;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.ManyToMany
	protected Set<User> user;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.ManyToMany
	protected Set<Message> message;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.OneToOne
	protected Cardio cardio;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.OneToOne
	protected Parcours parcours;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@javax.persistence.ManyToOne
	@javax.persistence.JoinColumn(nullable = false)
	protected Meteo meteo;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Workout(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetCardio(Cardio myCardio) {
		if (this.cardio != myCardio) {
			if (myCardio != null){
				if (this.cardio != myCardio) {
					Cardio oldcardio = this.cardio;
					this.cardio = myCardio;
					if (oldcardio != null)
						oldcardio.unsetWorkout();
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
	public void basicSetParcours(Parcours myParcours) {
		if (this.parcours != myParcours) {
			if (myParcours != null){
				if (this.parcours != myParcours) {
					Parcours oldparcours = this.parcours;
					this.parcours = myParcours;
					if (oldparcours != null)
						oldparcours.unsetWorkout();
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
	public void basicSetMeteo(Meteo myMeteo) {
		if (this.meteo != myMeteo) {
			if (myMeteo != null){
				if (this.meteo != myMeteo) {
					Meteo oldmeteo = this.meteo;
					this.meteo = myMeteo;
					if (oldmeteo != null)
						oldmeteo.removeWorkout(this);
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
	public double getDuration() {
		return this.duration;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getDate() {
		return this.date;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getDepartureTime() {
		return this.departureTime;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getFinishTime() {
		return this.finishTime;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Sport getTypeSport() {
		return this.typeSport;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getComments() {
		return this.comments;	
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
	public Set<User> getUser() {
		if(this.user == null) {
				this.user = new HashSet<User>();
		}
		return (Set<User>) this.user;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Message> getMessage() {
		if(this.message == null) {
				this.message = new HashSet<Message>();
		}
		return (Set<Message>) this.message;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Cardio getCardio() {
		return this.cardio;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Parcours getParcours() {
		return this.parcours;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Meteo getMeteo() {
		return this.meteo;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllUser(Set<User> newUser) {
		if (this.user == null) {
			this.user = new HashSet<User>();
		}
		for (User tmp : newUser)
			tmp.addWorkout(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllMessage(Set<Message> newMessage) {
		if (this.message == null) {
			this.message = new HashSet<Message>();
		}
		for (Message tmp : newMessage)
			tmp.addWorkout(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllUser(Set<User> newUser) {
		if(this.user == null) {
			return;
		}
		
		this.user.removeAll(newUser);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllMessage(Set<Message> newMessage) {
		if(this.message == null) {
			return;
		}
		
		this.message.removeAll(newMessage);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setDuration(double myDuration) {
		this.duration = myDuration;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setDate(Date myDate) {
		this.date = myDate;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setDepartureTime(Date myDepartureTime) {
		this.departureTime = myDepartureTime;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setFinishTime(Date myFinishTime) {
		this.finishTime = myFinishTime;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setTypeSport(Sport myTypeSport) {
		this.typeSport = myTypeSport;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setComments(String myComments) {
		this.comments = myComments;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setId(long myId) {
		this.id = myId;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addUser(User newUser) {
		if(this.user == null) {
			this.user = new HashSet<User>();
		}
		
		if (this.user.add(newUser))
			newUser.addWorkout(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addMessage(Message newMessage) {
		if(this.message == null) {
			this.message = new HashSet<Message>();
		}
		
		if (this.message.add(newMessage))
			newMessage.addWorkout(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCardio(Cardio myCardio) {
		this.basicSetCardio(myCardio);
		myCardio.basicSetWorkout(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setParcours(Parcours myParcours) {
		this.basicSetParcours(myParcours);
		myParcours.basicSetWorkout(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setMeteo(Meteo myMeteo) {
		this.basicSetMeteo(myMeteo);
		myMeteo.addWorkout(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetDuration() {
		this.duration = 0.0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetDate() {
		this.date = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetDepartureTime() {
		this.departureTime = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetFinishTime() {
		this.finishTime = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetTypeSport() {
		this.typeSport = Sport.RUNNING;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetComments() {
		this.comments = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetId() {
		this.id = 0L;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeUser(User oldUser) {
		if(this.user == null)
			return;
		
		if (this.user.remove(oldUser))
			oldUser.removeWorkout(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeMessage(Message oldMessage) {
		if(this.message == null)
			return;
		
		if (this.message.remove(oldMessage))
			oldMessage.removeWorkout(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCardio() {
		if (this.cardio == null)
			return;
		Cardio oldcardio = this.cardio;
		this.cardio = null;
		oldcardio.unsetWorkout();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetParcours() {
		if (this.parcours == null)
			return;
		Parcours oldparcours = this.parcours;
		this.parcours = null;
		oldparcours.unsetWorkout();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetMeteo() {
		if (this.meteo == null)
			return;
		Meteo oldmeteo = this.meteo;
		this.meteo = null;
		oldmeteo.removeWorkout(this);	
	}
	
}

