package polymorphisimDemo;

public class Main {

	public static void main(String[] args) {
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("Log Mesajı");

		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
				new ConsoleLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		customerManager.add();
	}

}
