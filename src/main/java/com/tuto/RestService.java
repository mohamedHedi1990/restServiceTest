package com.tuto;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


@Path("/services")
public class RestService {
	
	@GET
	  @Path("/isRegistred")
	@Produces(MediaType.APPLICATION_JSON)
	  public Response isRegistred() throws Exception {
	    
		JSONObject jsonObject = new JSONObject();
	   jsonObject.put("registred", true);

	    return Response.ok(jsonObject.toString(), MediaType.APPLICATION_JSON).build();
	  }


}
