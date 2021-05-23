package ecommercesimulation.core.utils;

/*
 * Class for providing a means for examining if all validation rules (any arbitrary number of rules)
 * are satisfied or not.
 */
public class ValidationRules {
	public static boolean checkRules(boolean... validationRules) {
		for (boolean validationRule : validationRules) {
			if (!validationRule)
				return false;
		}
		return true;
	}
}