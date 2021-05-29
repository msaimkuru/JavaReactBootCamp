package ecommercesimulation.business.abstracts;

import java.util.List;

import ecommercesimulation.entities.concretes.User;

/*
 * Interface defining common operations to be used by both
 * UserService and UserDao interfaces. 
 */
public interface UserServicesCommonOperations {
	// Main user service operations
	void add(User user);

	void remove(User user);

	void update(User user);

	// Get user by id
	User get(int id);

	// Get user by email
	User getByEmail(String email);

	// Get user by email & password
	User getByEmailAndPassword(String email, String password);

	// Get list of all users
	List<User> getAll();
}