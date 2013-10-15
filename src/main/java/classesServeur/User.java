package classesServeur;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TUSER")
public class User {

	private String name;
	private String surname;
	private Date birthDate;
	private double weight;
	private GenderEnum gender;
	private String pseudo;
	private String compteFaceBook;
	private String compteTwitter;
	private String mailAdress;
	private String avatar;
	private String group;
	private Set<Workout> workout;
	private User user;
	private List<User> amis;
	private int id;

	public User() {
	}

	public void basicRemoveAmis(User oldAmis) {
		if (this.amis == null)
			return;

		while (this.amis.contains(oldAmis))
			this.amis.remove(oldAmis);
	}

	public void basicSetUser(User myUser) {
		if (this.user != myUser) {
			if (myUser != null) {
				if (this.user != myUser) {
					User olduser = this.user;
					this.user = myUser;
					if (olduser != null)
						olduser.removeAmis(this);
				}
			}
		}
	}

	public void basicAddAmis(User newAmis) {
		if (this.amis == null) {
			this.amis = new LinkedList<User>();
		}

		this.amis.add(newAmis);
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	@Temporal(TemporalType.DATE)
	public Date getBirthDate() {
		return this.birthDate;
	}

	public double getWeight() {
		return this.weight;
	}

	@Enumerated(EnumType.STRING)
	public GenderEnum getGender() {
		return this.gender;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public String getCompteFaceBook() {
		return this.compteFaceBook;
	}

	public String getCompteTwitter() {
		return this.compteTwitter;
	}

	public String getMailAdress() {
		return this.mailAdress;
	}

	public String getAvatar() {
		return this.avatar;
	}

	@Column(name="CGROUP")
	public String getGroup() {
		return this.group;
	}

	@ManyToMany(mappedBy = "user")
	public Set<Workout> getWorkout() {
		if (this.workout == null) {
			this.workout = new HashSet<Workout>();
		}
		return (Set<Workout>) this.workout;
	}

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return this.user;
	}

	@OneToMany(mappedBy = "user")
	public List<User> getAmis() {
		if (this.amis == null) {
			this.amis = new LinkedList<User>();
		}
		return (List<User>) this.amis;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return this.id;
	}

	public void addAllWorkout(Set<Workout> newWorkout) {
		if (this.workout == null) {
			this.workout = new HashSet<Workout>();
		}
		for (Workout tmp : newWorkout)
			tmp.addUser(this);

	}

	public void addAllAmis(List<User> newAmis) {
		if (this.amis == null) {
			this.amis = new LinkedList<User>();
		}
		for (User tmp : newAmis)
			tmp.setUser(this);

	}

	public void removeAllWorkout(Set<Workout> newWorkout) {
		if (this.workout == null) {
			return;
		}

		this.workout.removeAll(newWorkout);
	}

	public void removeAllAmis(List<User> newAmis) {
		if (this.amis == null) {
			return;
		}

		this.amis.removeAll(newAmis);
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setAmis(User myUser) {
		this.amis.add(myUser);
	}

	public void setName(String myName) {
		this.name = myName;
	}

	public void setSurname(String mySurname) {
		this.surname = mySurname;
	}

	public void setBirthDate(Date myBirthDate) {
		this.birthDate = myBirthDate;
	}

	public void setWeight(double myWeight) {
		this.weight = myWeight;
	}
	
	public void setWorkout(Workout myWorkout) {
		this.workout.add(myWorkout);
	}
	
	public void setGender(GenderEnum myGender) {
		this.gender = myGender;
	}

	public void setPseudo(String myPseudo) {
		this.pseudo = myPseudo;
	}

	public void setCompteFaceBook(String myCompteFaceBook) {
		this.compteFaceBook = myCompteFaceBook;
	}

	public void setCompteTwitter(String myCompteTwitter) {
		this.compteTwitter = myCompteTwitter;
	}

	public void setMailAdress(String myMailAdress) {
		this.mailAdress = myMailAdress;
	}

	public void setAvatar(String myAvatar) {
		this.avatar = myAvatar;
	}

	public void setGroup(String myGroup) {
		this.group = myGroup;
	}

	public void addWorkout(Workout newWorkout) {
		if (this.workout == null) {
			this.workout = new HashSet<Workout>();
		}

		if (this.workout.add(newWorkout))
			newWorkout.addUser(this);
	}

	public void setUser(User myUser) {
		this.basicSetUser(myUser);
		myUser.basicAddAmis(this);

	}

	public void addAmis(User newAmis) {
		this.basicAddAmis(newAmis);
		newAmis.basicSetUser(this);
	}

	public void unsetName() {
		this.name = "";
	}

	public void unsetSurname() {
		this.surname = "";
	}

	public void unsetBirthDate() {
		this.birthDate = new Date();
	}

	public void unsetWeight() {
		this.weight = 0.0;
	}

	public void unsetGender() {
		this.gender = GenderEnum.MAN;
	}

	public void unsetPseudo() {
		this.pseudo = "";
	}

	public void unsetCompteFaceBook() {
		this.compteFaceBook = "";
	}

	public void unsetCompteTwitter() {
		this.compteTwitter = "";
	}

	public void unsetMailAdress() {
		this.mailAdress = "";
	}

	public void unsetAvatar() {
		this.avatar = "";
	}

	public void unsetGroup() {
		this.group = "";
	}

	public void removeWorkout(Workout oldWorkout) {
		if (this.workout == null)
			return;

		if (this.workout.remove(oldWorkout))
			oldWorkout.removeUser(this);
	}

	public void unsetUser() {
		if (this.user == null)
			return;
		User olduser = this.user;
		this.user = null;
		olduser.removeAmis(this);
	}

	public void removeAmis(User oldAmis) {
		this.basicRemoveAmis(oldAmis);
		oldAmis.unsetUser();
	}

}
