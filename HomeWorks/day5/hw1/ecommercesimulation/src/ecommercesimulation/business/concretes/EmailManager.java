package ecommercesimulation.business.concretes;

import ecommercesimulation.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send(String message, String to) {
		System.out.println("E-mail Manager message: " + message + " has just been sent to " + to);
	}
}