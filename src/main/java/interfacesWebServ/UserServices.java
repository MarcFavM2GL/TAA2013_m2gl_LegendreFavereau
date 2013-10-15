package interfacesWebServ;

import java.util.Date;

import classesServeur.GenderEnum;
import classesServeur.User;

/**
 * 
 * @author Legendre & Favereau
 * @version 1.0.0
 * 
 * Interface de definition des services
 * web associe a la gestion des utilisateurs
 *  de l'Application  'SportTrackAppli'
 * 
 * Le 12/10/2013
 * 
 */

public  interface UserServices 
{
	
	/** 
	 * @see User.class
	 * @category service web (fonction)
	 * Ajoute un utilisateur
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String addFriend() ;
	

	/** 
	 * @see User.class
	 * @category service web (fonction)
	 * Demande la creation d'un utilisateur
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */	
	public String createUser(	String name,
								String surname,
								Date birthDate,
								float weight,
								boolean gender,
								String pseudo,
								String cmptFB,
								String cmptTW,
								String mailAdr,
								String avatar,
								String group) ;
	
	
	
	/** 
	 * @see User.class
	 * @category service web (fonction)
	 * Supprime un ami du compte de
	 * l'utilisateur
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String deleteFriend() ;
	
	
	/** 
	 * @see User.class
	 * @category service web (fonction)
	 * Supprime un utilisateur
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String deleteUser() ;
	
	
	/** 
	 * @see User.class
	 * @category service web (fonction)
	 * Recherche et retourne un ami
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String getFriendByName() ;
	 
	 
	 /** 
	  * @see User.class
	  * @category service web (fonction)
	  * retourne un amis
	  * 
	  * @return 	une info texte
	  * 			pour l'instant...TODO
	  */
	 public String getFriends() ;
	 
	 
	 /** 
	  * @see User.class
	  * @category service web (fonction)
	  * Recherche et retourne un utilisateur
	  * 
	  *  @return 	une info texte
	  * 			pour l'instant...TODO
	  */
	public String getUserByName() ;
	
	
	/** 
	  * @see User.class
	  * @category service web (fonction)
	  * Mise a jour de l'utilisateur
	  * dans la base de donnee
	  * 
	  *  @return 	une info texte
	  * 			pour l'instant...TODO
	  */
	public String updateUser() ;
	
}