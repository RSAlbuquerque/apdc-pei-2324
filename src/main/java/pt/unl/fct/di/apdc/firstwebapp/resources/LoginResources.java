package pt.unl.fct.di.apdc.firstwebapp.resources;

import pt.unl.fct.di.apdc.firstwebapp.resources.util.LoginData;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

public class LoginResources {
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public class LoginResource {

        private final Logger LOG = Logger.getLogger(LoginResource.class.getName());

        public LoginResource() {
        }

        @POST
        @Path("/")
        @Consumes(MediaType.APPLICATION_JSON)
        public Response doLogin(LoginData data) {
            LOG.fine("Attempt to login: " + data.username);
            return Response.ok().build();
        }
    }
}
