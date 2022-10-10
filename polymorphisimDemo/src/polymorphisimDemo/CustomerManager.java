package polymorphisimDemo;

public class CustomerManager {
	private BaseLogger[] loggers;

	public CustomerManager(BaseLogger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add() {
		for (BaseLogger logger : loggers) {
			logger.log("Müşteri eklendi.");
		}
	}
}
