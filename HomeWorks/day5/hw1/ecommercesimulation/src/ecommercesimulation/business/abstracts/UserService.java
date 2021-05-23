package ecommercesimulation.business.abstracts;

/*
 * Interface defining User Service protocol.
 */
public interface UserService extends UserServicesCommonOperations {
	void verifyUser(int id);
}