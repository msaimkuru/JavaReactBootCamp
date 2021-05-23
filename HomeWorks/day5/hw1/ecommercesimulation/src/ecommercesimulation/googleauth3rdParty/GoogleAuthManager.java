package ecommercesimulation.googleauth3rdParty;

/*
 * This package and class is to be regarded as a third party service consumed by our software project.
 * That is, this code is not written by us. In this project we try to find out how to add 3rd party
 * services into our project without making our project tightly coupled and highly dependent to that
 * 3rd party service. Because by time, we may change our strategy to use other services.
 */
public class GoogleAuthManager {
	public void register(String email, String password) {
		System.out.println("Registered by Google account :" + email);
	}

	public void login(String email, String password) {
		System.out.println("Logged in by Google account : " + email);
	}
}