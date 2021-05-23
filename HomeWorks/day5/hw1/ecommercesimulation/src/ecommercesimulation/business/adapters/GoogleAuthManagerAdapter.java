package ecommercesimulation.business.adapters;

import ecommercesimulation.business.abstracts.AuthService;
import ecommercesimulation.googleauth3rdParty.GoogleAuthManager;

/*
 * Adapter class for 3rd party Google Authentication service.
 */
public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public void register(int id, String email, String password, String firstName, String lastName) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(email, password);
	}

	@Override
	public void login(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email, password);
	}
}