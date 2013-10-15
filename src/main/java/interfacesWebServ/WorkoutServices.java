package interfacesWebServ;

import classesServeur.Workout;



/**
 * 
 * @author Legendre & Favereau
 * @version 1.0.0
 * 
 * Interface de definition des services
 * web associe a la gestion des seances
 *  de l'Application  'SportTrackAppli'
 * 
 * Le 12/10/2013
 * 
 */
public  interface WorkoutServices {
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * Ajoute un participant a la seance
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String addParticipant() ;
	
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * Creation d'une seance
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String createWorkout() ;
	
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * Suppresion d'une seance
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String deleteWorkout() ;
	
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * Recherche une seance par sa 
	 * cle de hachage
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String getWorkoutById() ;
	
	
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * recherche de seances
	 * dans une periode donnee
	 * 
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */
	public String getWorkoutsBetweenDates() ;
	
	
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * recherche de seances
	 * a une date donnee
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */	
	public String getWorkoutsByDate() ;
	
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * Supprime un participant a la seance
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */	
	public void removeParticipant() ;
	
	
	/** 
	 * @see Workout.class
	 * @category service web (fonction)
	 * Mise a jour de la seance
	 * dans la base de donnee
	 * 
	 * @return 	une info texte
	 * 			pour l'instant...TODO
	 */	
	public void updateWorkout() ;
	
}

