package ecommercesimulation.dataaccess.concretes;

import java.util.List;
import java.util.ArrayList;

import ecommercesimulation.dataaccess.abstracts.UserDao;
import ecommercesimulation.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void remove(User user) {
		// we can also utilize a lambda expression such:
		// users.removeIf(obj -> obj.getId() == user.getId());
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == user.getId()) {
				users.remove(i);
			}
		}
	}

	@Override
	public void update(User user) {
		// Update simulation, should be modeled and implemented for real cases.
		User userToUpdate = this.get(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}
}