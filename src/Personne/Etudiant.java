package Personne;

public class Etudiant extends Personne {
	
	public void show() {
		System.out.println("Je suis un etudiant");
		super.show();
	}
	
	Etudiant(){
		
	}
	
	public static void main(String[] args) {
		Etudiant etud = new Etudiant();
		
		etud.show();

	}

}
