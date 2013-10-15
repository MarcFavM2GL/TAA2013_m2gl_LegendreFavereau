package implementationWebServices;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

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
	@POST @Path("/createFriend")
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
	public String getUserByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser() {
		// TODO Auto-generated method stub
		return null;
	}

}