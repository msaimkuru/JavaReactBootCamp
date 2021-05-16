package nlayereddemo.core;

/*
 * This interface is used to adapt to the 3rd party looger: jLogger
 */
public interface LoggerService {
	void logToSystem(String message);
}