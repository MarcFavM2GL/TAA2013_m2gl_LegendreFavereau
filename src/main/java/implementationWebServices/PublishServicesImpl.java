package implementationWebServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import interfacesWebServ.PublishServices;

@Path("/publish")
public class PublishServicesImpl implements PublishServices {

	@Override
	@GET
	@Produces("text/plain")
	public String publishOnFaceBook() {
		// TODO Auto-generated method stub
		return "I am on FaceBook !!!";

	}

//	@Override
//	@GET
//	@Produces("text/plain")
//	public String publishOnTwitteroperation() {
//		// TODO Auto-generated method stub
//		return "Follow me on Twitter !!!";
//	}

}