package ecommercesimulation.business.concretes;

import ecommercesimulation.business.abstracts.AuthService;
import ecommercesimulation.business.abstracts.EmailService;
import ecommercesimulation.business.abstracts.UserService;
import ecommercesimulation.business.abstracts.UserInfoValidationService;
import ecommercesimulation.core.utils.BusinessRules;
import ecommercesimulation.entities.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;
	UserInfoValidationService userInfoValidationService;
	EmailService emailService;

	public AuthManager(UserService userService, UserInfoValidationService userInfoValidationService,
			EmailService emailService) {
		this.userService = userService;
		this.userInfoValidationService = userInfoValidationService;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String email, String password, String firstName, String lastName) {
		User userToRegister = new User(id, email, password, firstName, lastName, false);
		System.out.println(
				"~~~~~~~~~~~~~~~~~~~~ user registration for : " + firstName + " " + lastName + " ~~~~~~~~~~~~~~~~~~~~");
		// 1. Invoke user info validation rules
		if (!userInfoValidationService.validate(userToRegister)) {
			System.out.println("User information is not valid. Please provide all information correctly.");
			return;
		}
		// 2. Invoke business rules
		if (BusinessRules.checkRules(this.checkIfUserExists(email))) {
			System.out.println("Registration failed. This email has already been used for registration.");
			return;
		}
		// 3. After user info & business validation completed successfully we can register user
		userService.add(userToRegister);
		emailService.send("Happy new registration!", userToRegister.getEmail());
		System.out.println("User registered successfully. To verify your subscription please chek your email.");
	}

	@Override
	public void login(String email, String password) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~ user login for : " + email + " ~~~~~~~~~~~~~~~~~~~~");
		// 1. Invoke business rules
		if (!BusinessRules.checkRules(this.checkIfAllLoginFieldsFilled(email, password))) {
			System.out.println("Login failed. Please provide information correctly.");
			return;
		}
		// 2. Check if user given by user-name, password pair exists or not.
		User userToLogin = userService.getByEmailAndPassword(email, password);

		if (userToLogin == null) {
			System.out.println("Login failed. Wrong password or email address.");
			return;
		}
		// 3. Check if user given by user-name, password pair is verified or not.
		if (!this.checkIfUserVerified(userToLogin)) {
			System.out.println("Login failed. You have not verified your subscription yet.");
			return;
		}
		// 4. Give message for Successful Login.
		System.out
				.println("Login Successful. Welcome : " + userToLogin.getFirstName() + " " + userToLogin.getLastName());
	}

	private boolean checkIfUserExists(String email) {
		return userService.getByEmail(email) != null;
	}

	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}

	private boolean checkIfAllLoginFieldsFilled(String email, String password) {
		if (email.length() <= 0 || password.length() <= 0) {
			return false;
		}
		return true;
	}
}