
public class Terre {
	final static int age = 4543;
	final static int population = 7753;
	static Terre instance = null;
	
	private Terre() {}
	
	
	public void afficher() {
		System.out.println("Informations g�n�riques sur la plan�te Terre.");
		System.out.println("age: "+ age +" milliards d'ann�es.");
		System.out.println("population: "+ population +" milliards d'habitants.\n");
	}
	
	
	public synchronized static Terre getInstance() {		
			// bloc synchronis�
			if( instance == null) {
				instance = new Terre();
			}
			return instance;
	}
	
}
