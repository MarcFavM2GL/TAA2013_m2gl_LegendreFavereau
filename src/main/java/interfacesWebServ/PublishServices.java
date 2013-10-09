package interfacesWebServ;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public  interface PublishServices 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String publishOnFaceBook() ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String publishOnTwitteroperation() ;
	
}

