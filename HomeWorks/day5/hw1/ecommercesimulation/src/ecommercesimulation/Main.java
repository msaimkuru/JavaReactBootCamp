package ecommercesimulation;

import ecommercesimulation.business.abstracts.AuthService;
import ecommercesimulation.business.abstracts.EmailService;
import ecommercesimulation.business.abstracts.UserInfoValidationService;
import ecommercesimulation.business.abstracts.UserService;
import ecommercesimulation.business.adapters.GoogleAuthManagerAdapter;
import ecommercesimulation.business.concretes.AuthManager;
import ecommercesimulation.business.concretes.EmailManager;
import ecommercesimulation.business.concretes.UserManager;
import ecommercesimulation.business.concretes.UserInfoValidationManager;
import ecommercesimulation.dataaccess.abstracts.UserDao;
import ecommercesimulation.dataaccess.concretes.InMemoryUserDao;

public class Main {
	public static void main(String[] args) {
		// Create a UserService with a UserDao
		UserDao userDao = new InMemoryUserDao();
		UserService userService =  new UserManager(userDao);
		// Create an AuthService with a UserService, a UserInfoValidationService, and an EmailService
		UserInfoValidationService userInfoValidationService= new UserInfoValidationManager();
		EmailService emailService= new EmailManager();
		AuthService authService = new AuthManager(userService, userInfoValidationService, emailService);
		//
		authService.register(1, "msaimkuru@gmail.com", "1234abc", "Saim", "Kuru");	// Successful
		authService.register(2, "@msaimkurugmail.com", "1234abc", "Saim", "Kuru");	// Fails: because of wrong email format
		authService.register(3, "abcdefghij@gmail.com", "s", "Saim", "Kuru");		// Fails: because of short password
		authService.register(4, "xyzwtuors@gmail.com", "1234abc", "S", "K");			// Fails: because of short name and surname
		authService.register(5, "msaimkuru@gmail.com", "1234abc", "Saim", "Kuru");	// Fails: because of already used email
		//
		authService.login("msaimkuru@gmail.com", "1234abc");							// Fails: because of unverified subscription
		userService.verifyUser(1);													// Simulating verification of user
		authService.login("msaimkuru@gmail.com", "123");								// Fails: because of wrong password or email
		authService.login("msaimkuru@gmail.com", "1234abc"); 						// Successful
		authService.login("", "");													// Fails: because of empty password and email
		/* 
		 * If we don't use our project-requirements specific authentication service AuthManager
		 * but instead we directly use 3rd party GoogleAuthManager via GoogleAuthManagerAdapter 
		 * we then can not use our project specific validations or business rules. We can only 
		 * have what 3rd party service provides us.
		 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~ NOTE IT! ~~~~~~~~~~~~~~~~~~~~");
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(6, "msaimkuru@gmail.com", "1234abc", "Saim", "Kuru");
		googleAuthService.login("msaimkuru@gmail.com", "1234abc");
	}
}