package implementationWebServices;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;

import java.util.*;

import persistance.EMF;
import classesServeur.GenderEnum;
import classesServeur.User;
import interfacesWebServ.UserServices;


@Path("/users")
public class UserServicesImpl implements UserServices {

	@Override
	@GET @Path("/addFriend")
	public String addFriend() {
		
		return "Ajout d'un ami";
	}

	@Override
	@POST @Path("/createUser")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String createUser(	@FormParam("name")String name,
								@FormParam("surname")String surname,
								@FormParam("birthdate")Date birthDate,
								@FormParam("weight")float weight,
								@FormParam("gender")boolean gender, 
								@FormParam("pseudo")String pseudo,
								@FormParam("compteFaceBook")String cmptFB,
								@FormParam("compteTwitter")String cmptTW,
								@FormParam("adresseMail")String mailAdr,
								@FormParam("avatar")String avatar,
								@FormParam("group")String group){
		
		String retour = "";
		GenderEnum genderT;
		if(gender){
			genderT = GenderEnum.MAN;
		}else{
			genderT = GenderEnum.WOMAN;
		}
		
		EntityManager em = EMF.createEntityManager();
		
		if(name != "" && surname != ""){
			User currentUsr = new User(	name,
										surname,
										birthDate,
										weight,
										genderT,
										pseudo,
										cmptFB,
										cmptTW,
										mailAdr,
										avatar,
										group);
			
			
			
			em.getTransaction().begin();
			em.persist(currentUsr);
			em.getTransaction().commit();
			
			retour = "L'utilisateur " + name + " " + surname;
			retour += " a bien été ajouté !!!";
		}else{
			retour = "L'utilisateur n'a pas été ajouté !!!";
			retour += "il faut un nom et un prenom";
		}
				
		return retour;
	}

	
	@Override

	public String deleteFriend() {
		
		return null;
	}

	@Override
	@DELETE
	public String deleteUser() {
		
		return null;
	}

	@Override
	public String getFriendByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFriends() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	@POST @Path("/getUserByName")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserByName(@FormParam("name")String name) {
		User retour = null;
		
		EntityManager em = EMF.createEntityManager();
			
		em.getTransaction().begin();
		
		Query maRequete = em.createQuery("select e from User as e where e.name='" + name + "'");
		
		
		List result = maRequete.getResultList();
		if(!result.isEmpty()){
			java.util.Iterator parcour = result.iterator();
			
			while(parcour.hasNext()){
				retour = (User) parcour.next();
				System.out.println(retour.toString());
			}
		}
		
		System.out.println("retour de " + retour.getName() + " " + retour.getSurname());
		System.out.flush();
		
		
		return retour;
	}

	@Override
	public String updateUser() {
		// TODO Auto-generated method stub
		return null;
	}

}