
public class Main {

	public static void main(String[] args) {
		Carte carte1 = new Carte(600);
		Carte carte2 = new Carte(600);
		
		if(carte1.equals(carte2)) {
			System.out.println("La fel");
		}
		else
			System.out.println("Nu sunt la fel");

	}

}
