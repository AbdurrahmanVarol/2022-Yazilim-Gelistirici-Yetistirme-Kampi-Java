package youtubeEgitim;

public abstract class CrediManagerBase implements ICreditManager {
	
	public abstract void calculate();

	public void save() {
		System.out.println("Kredi katdedildi.");
	}

}
