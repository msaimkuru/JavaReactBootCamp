package ecommercesimulation.business.abstracts;

import ecommercesimulation.entities.concretes.User;
/*
 * Interface defining User Validation protocol.
 */
public interface UserValidationService {
	boolean validate(User user);
}