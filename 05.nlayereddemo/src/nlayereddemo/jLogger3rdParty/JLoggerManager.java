package nlayereddemo.jLogger3rdParty;

/*
 * This package and class is to be regarded as a third party service consumed by our software project.
 * That is, this code is not written by us. In this project we try to find out how to add 3rd party
 * services into our project without making our project tightly coupled and highly dependent to that
 * 3rd party service. Because by time, we may change our strategy to use other services.
 */
public class JLoggerManager {
	public void log(String message) {
		System.out.println("Logged by JLogger 3rd Party Service: " + message);
	}
}