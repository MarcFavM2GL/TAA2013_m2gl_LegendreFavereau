package ImplementationWebServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import interfacesWebServ.PublishServices;

@Path("/publish")
public class PublishServicesImpl implements PublishServices {

	@Override
	@GET
	public String publishOnFaceBook() {
		// TODO Auto-generated method stub
		return "I am on FaceBook !!!";

	}

	@Override
	@GET
	public String publishOnTwitteroperation() {
		// TODO Auto-generated method stub
		return "Follow me on Twitter !!!";
	}

}
