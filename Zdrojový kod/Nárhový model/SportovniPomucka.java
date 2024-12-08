import util.TypPomucky;

/**
 * T��da SportovniPomucka reprezentuje pom�cky, kter� si je mo�n� vyp�j�it, ale to
 * pouze k dan� objedn�vce.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class SportovniPomucka {

	/**
	 * Typ pom�cky.
	 */
	private TypPomucky typPomucky = null;
	private Objednavka objednavka;

	public SportovniPomucka(){

	}

	/**
	 * P�e�te typ pom�cky.
	 */
	public TypPomucky gettypPomucky(){
		return typPomucky;
	}

	/**
	 * Zjist� dostupnost, pokud pravda vr�t� true, jinak false.
	 */
	public boolean jeDostupna(){
		return false;
	}

	/**
	 * Zjist� zda-li je pot�eba p�j�it, pokud pravda vr�t� true, jinak false.
	 */
	public boolean jePotrebaPujcit(){
		return false;
	}

	/**
	 * P�j�� pom�cku.
	 */
	public void pujci(){

	}

	/**
	 * Nastav� typ pom�cky.
	 * 
	 * @param newVal
	 */
	public void settypPomucky(TypPomucky newVal){
		typPomucky = newVal;
	}

}