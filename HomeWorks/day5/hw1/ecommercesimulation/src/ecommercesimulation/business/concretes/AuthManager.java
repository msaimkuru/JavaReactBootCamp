package ecommercesimulation.business.concretes;

import ecommercesimulation.business.abstracts.AuthService;
import ecommercesimulation.business.abstracts.EmailService;
import ecommercesimulation.business.abstracts.UserService;
import ecommercesimulation.business.abstracts.UserValidationService;
import ecommercesimulation.core.utils.BusinessRules;
//import ecommercesimulation.core.utils.BusinessRules;
import ecommercesimulation.entities.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;
	UserValidationService userValidationService;
	EmailService emailService;

	public AuthManager(UserService userService, UserValidationService userValidationService,
			EmailService emailService) {
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String email, String password, String firstName, String lastName) {
		User userToRegister = new User(id, email, password, firstName, lastName, false);
		System.out.println(
				"~~~~~~~~~~~~~~~~~~~~ user registration for : " + firstName + " " + lastName + " ~~~~~~~~~~~~~~~~~~~~");
		if (!userValidationService.validate(userToRegister)) {
			System.out.println("User information is not valid. Please provide all information correctly.");
			return;
		}

		if (!BusinessRules.checkRules(checkIfUserExists(email))) {
			System.out.println("Registration failed. This email has already been used for registration.");
			return;
		}

		System.out.println("User registered successfully. To verify your subscription please chek your email.");
		emailService.send("Happy new registration!", userToRegister.getEmail());
		userService.add(userToRegister);
	}

	@Override
	public void login(String email, String password) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~ user login for : " + email + " ~~~~~~~~~~~~~~~~~~~~");
		if (!BusinessRules.checkRules(checkIfAllFieldsFilled(email, password))) {
			System.out.println("Login failed. Please provide information correctly.");
			return;
		}

		User userToLogin = userService.getByEmailAndPassword(email, password);

		if (userToLogin == null) {
			System.out.println("Login failed. Wrong password or email address.");
			return;
		}

		if (!checkIfUserVerified(userToLogin)) {
			System.out.println("Login failed. You have not verified your subscription yet.");
			return;
		}
		System.out
				.println("Login Successful. Welcome : " + userToLogin.getFirstName() + " " + userToLogin.getLastName());
	}

	private boolean checkIfUserExists(String email) {
		return userService.getByEmail(email) == null;
	}

	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}

	private boolean checkIfAllFieldsFilled(String email, String password) {
		if (email.length() <= 0 || password.length() <= 0) {
			return false;
		}
		return true;
	}
}