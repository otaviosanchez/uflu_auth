package shop.uflu.platform.core.auth.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import shop.uflu.platform.core.auth.service.api.HealthCheckService;

@Path("/health")
public class HealthCheckResource {
	
    @Inject
    private HealthCheckService service;

    @GET
    @Path("/check")
    public String check() {
        return service.check();
    }

}
