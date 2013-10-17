package classesServeur;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Workout {

	private double duration;
	private Date date;
	private Date departureTime;
	private Date finishTime;
	private Sport typeSport;
	private String comments;
	private int id;
	private Set<User> user;
	private Set<Message> message;
	private Cardio cardio;
	private Parcours parcours;
	private Meteo meteo;

	public Workout() {
	}

	public void basicSetCardio(Cardio myCardio) {
		if (this.cardio != myCardio) {
			if (myCardio != null) {
				if (this.cardio != myCardio) {
					Cardio oldcardio = this.cardio;
					this.cardio = myCardio;
					if (oldcardio != null)
						oldcardio.unsetWorkout();
				}
			}
		}
	}

	public void basicSetParcours(Parcours myParcours) {
		if (this.parcours != myParcours) {
			if (myParcours != null) {
				if (this.parcours != myParcours) {
					Parcours oldparcours = this.parcours;
					this.parcours = myParcours;
					if (oldparcours != null)
						oldparcours.unsetWorkout();
				}
			}
		}
	}

	public void basicSetMeteo(Meteo myMeteo) {
		if (this.meteo != myMeteo) {
			if (myMeteo != null) {
				if (this.meteo != myMeteo) {
					Meteo oldmeteo = this.meteo;
					this.meteo = myMeteo;
					if (oldmeteo != null)
						oldmeteo.removeWorkout(this);
				}
			}
		}
	}

	public double getDuration() {
		return this.duration;
	}

	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return this.date;
	}

	@Temporal(TemporalType.DATE)
	public Date getDepartureTime() {
		return this.departureTime;
	}

	@Temporal(TemporalType.DATE)
	public Date getFinishTime() {
		return this.finishTime;
	}

	@Enumerated(EnumType.STRING)
	public Sport getTypeSport() {
		return this.typeSport;
	}

	public String getComments() {
		return this.comments;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return this.id;
	}

	@ManyToMany
	public Set<User> getUser() {
		if (this.user == null) {
			this.user = new HashSet<User>();
		}
		return (Set<User>) this.user;
	}

	@ManyToMany
	public Set<Message> getMessage() {
		if (this.message == null) {
			this.message = new HashSet<Message>();
		}
		return (Set<Message>) this.message;
	}

	@OneToOne
	public Cardio getCardio() {
		return this.cardio;
	}

	@OneToOne
	public Parcours getParcours() {
		return this.parcours;
	}

	@ManyToOne
	public Meteo getMeteo() {
		return this.meteo;
	}

	public void addAllUser(Set<User> newUser) {
		if (this.user == null) {
			this.user = new HashSet<User>();
		}
		for (User tmp : newUser)
			tmp.addWorkout(this);

	}

	public void addAllMessage(Set<Message> newMessage) {
		if (this.message == null) {
			this.message = new HashSet<Message>();
		}
		for (Message tmp : newMessage)
			tmp.addWorkout(this);

	}

	public void removeAllUser(Set<User> newUser) {
		if (this.user == null) {
			return;
		}

		this.user.removeAll(newUser);
	}

	public void removeAllMessage(Set<Message> newMessage) {
		if (this.message == null) {
			return;
		}

		this.message.removeAll(newMessage);
	}

	public void setDuration(double myDuration) {
		this.duration = myDuration;
	}

	public void setDate(Date myDate) {
		this.date = myDate;
	}

	public void setDepartureTime(Date myDepartureTime) {
		this.departureTime = myDepartureTime;
	}

	public void setFinishTime(Date myFinishTime) {
		this.finishTime = myFinishTime;
	}

	public void setTypeSport(Sport myTypeSport) {
		this.typeSport = myTypeSport;
	}

	public void setComments(String myComments) {
		this.comments = myComments;
	}

	public void setId(int myId) {
		this.id = myId;
	}

	public void addUser(User newUser) {
		if (this.user == null) {
			this.user = new HashSet<User>();
		}

		if (this.user.add(newUser))
			newUser.addWorkout(this);
	}

	public void addMessage(Message newMessage) {
		if (this.message == null) {
			this.message = new HashSet<Message>();
		}

		if (this.message.add(newMessage))
			newMessage.addWorkout(this);
	}

	public void setCardio(Cardio myCardio) {
		this.basicSetCardio(myCardio);
		myCardio.basicSetWorkout(this);

	}

	public void setParcours(Parcours myParcours) {
		this.basicSetParcours(myParcours);
		myParcours.basicSetWorkout(this);

	}

	public void setMessage(Message myMessage) {
		this.message.add(myMessage);
	}

	public void setUser(User myUser) {
		this.user.add(myUser);
	}

	public void setMeteo(Meteo myMeteo) {
		this.basicSetMeteo(myMeteo);
		myMeteo.addWorkout(this);
	}

	public void unsetDuration() {
		this.duration = 0.0;
	}

	public void unsetDate() {
		this.date = new Date();
	}

	public void unsetDepartureTime() {
		this.departureTime = new Date();
	}

	public void unsetFinishTime() {
		this.finishTime = new Date();
	}

	public void unsetTypeSport() {
		this.typeSport = Sport.RUNNING;
	}

	public void unsetComments() {
		this.comments = "";
	}

	public void removeUser(User oldUser) {
		if (this.user == null)
			return;

		if (this.user.remove(oldUser))
			oldUser.removeWorkout(this);
	}

	public void removeMessage(Message oldMessage) {
		if (this.message == null)
			return;

		if (this.message.remove(oldMessage))
			oldMessage.removeWorkout(this);
	}

	public void unsetCardio() {
		if (this.cardio == null)
			return;
		Cardio oldcardio = this.cardio;
		this.cardio = null;
		oldcardio.unsetWorkout();
	}

	public void unsetParcours() {
		if (this.parcours == null)
			return;
		Parcours oldparcours = this.parcours;
		this.parcours = null;
		oldparcours.unsetWorkout();
	}

	public void unsetMeteo() {
		if (this.meteo == null)
			return;
		Meteo oldmeteo = this.meteo;
		this.meteo = null;
		oldmeteo.removeWorkout(this);
	}

}
