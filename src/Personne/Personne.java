package Personne;
import java.util.Scanner;

public class Personne {
	protected String nom;
	String prenom;
	int age;
	Personne(){
		this.nom="";
		this.prenom="";
		this.age=0;
	}
	Personne(String nom, String prenom, int age){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	public void show() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Personne : " + this.prenom);
		System.out.println("Age : " +this.age );
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public static void main(String[] args) {
		
		Personne per = new Personne();
		Scanner da = new Scanner(System.in);
		System.out.print("Entrer votre nom : ");
		per.setNom(da.nextLine());
		System.out.print("Entrer votre prenom : ");
		per.setPrenom(da.nextLine());
		System.out.print("Entrer votre age : ");
		per.setAge(da.nextInt());
		
		per.show();
		

	}
	

}


