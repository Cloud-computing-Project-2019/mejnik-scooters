package si.fri.rso.mejnik.scooters;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("scooters")
public class MejnikResource {

    @GET
    public Response getMejnik() {
        return Response.status(Response.Status.OK).entity("{\n" +
                "    \"clani\": [\"gh8590\"],\n" +
                "    \"opis_projekta\": \"This service is just an API to pass mejnik\",\n}").build();
    }
}
