package shop.uflu.platform.core.auth.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import shop.uflu.platform.core.auth.service.api.HealthCheckService;

@ApplicationScoped
public class HealthCheckServiceBean implements HealthCheckService {

	@Override
	public String check() {
		return "OK";
	}

}
