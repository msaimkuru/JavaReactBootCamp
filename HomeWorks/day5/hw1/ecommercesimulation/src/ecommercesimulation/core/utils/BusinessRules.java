package ecommercesimulation.core.utils;

/*
 * Class for providing a means for examining if all business rules (any arbitrary number of rules)
 * are satisfied or not.
 */
public class BusinessRules {
	public static boolean checkRules(boolean... businessRules) {
		for (boolean businessRule : businessRules) {
			if (!businessRule)
				return false;
		}
		return true;
	}
}