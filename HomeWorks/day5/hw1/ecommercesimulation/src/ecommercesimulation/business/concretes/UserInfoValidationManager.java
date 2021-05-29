package ecommercesimulation.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ecommercesimulation.business.abstracts.UserInfoValidationService;
import ecommercesimulation.core.utils.ValidationRules;
import ecommercesimulation.entities.concretes.User;

public class UserInfoValidationManager implements UserInfoValidationService {
	/*
	 * Source: https://stackoverflow.com/questions/8204680/java-regex-email
	 */
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	@Override
	public boolean validate(User user) {
		boolean result = ValidationRules.checkRules(isEmailFormatValid(user.getEmail()),
				isPasswordLengthValid(user.getPassword()), isFirstNameValid(user.getFirstName()),
				isLastNameValid(user.getLastName()),
				isAllFieldsFilled(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword()));

		return result;
	}

	private boolean isEmailFormatValid(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}

	private boolean isPasswordLengthValid(String password) {
		return password.length() > 6;
	}

	/*
	 * Source:
	 * https://stackoverflow.com/questions/46326822/java-regex-first-name-validation
	 */
	private boolean isFirstNameValid(String firstName) {
		if (firstName.length() < 2)
			return false;
		
		if (firstName.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$"))
			return true;
		else
			return false;
	}

	/*
	 * Source:
	 * https://stackoverflow.com/questions/46326822/java-regex-first-name-validation
	 */
	private boolean isLastNameValid(String lastName) {
		if (lastName.length() < 2)
			return false;
		
		if (lastName.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$"))
			return true;
		else
			return false;
	}

	private boolean isAllFieldsFilled(String firstName, String lastName, String email, String password) {
		if (firstName.length() <= 0 || lastName.length() <= 0 || email.length() <= 0 || password.length() <= 0) {
			return false;
		}
		return true;
	}
}