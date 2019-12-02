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
                "    \"opis_projekta\": \"Nas projekt implementira aplikacijo za oddajo elektricnih skutera.\",\n" +
                "    \"mikrostoritve\": [\"http://35.189.96.118:8081/v1/orders\", \"http://35.197.209.159:8080/v1/customers/\"],\n" +
                "    \"github\": [\"https://github.com/jmezna/rso-customers\", \"https://github.com/jmezna/rso-orders\"],\n" +
                "    \"travis\": [\"https://travis-ci.org/jmezna/rso-customers\", \"https://travis-ci.org/jmezna/rso-orders\"],\n" +
                "    \"dockerhub\": [\"https://hub.docker.com/r/jmezna/rso-customers/\", \"https://hub.docker.com/r/jmezna/rso-orders/\"]\n" +
                "}").build();
    }
}
