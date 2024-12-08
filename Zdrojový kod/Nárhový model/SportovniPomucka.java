import util.TypPomucky;

/**
 * Tøída SportovniPomucka reprezentuje pomùcky, které si je možné vypùjèit, ale to
 * pouze k dané objednávce.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class SportovniPomucka {

	/**
	 * Typ pomùcky.
	 */
	private TypPomucky typPomucky = null;
	private Objednavka objednavka;

	public SportovniPomucka(){

	}

	/**
	 * Pøeète typ pomùcky.
	 */
	public TypPomucky gettypPomucky(){
		return typPomucky;
	}

	/**
	 * Zjistí dostupnost, pokud pravda vrátí true, jinak false.
	 */
	public boolean jeDostupna(){
		return false;
	}

	/**
	 * Zjistí zda-li je potøeba pùjèit, pokud pravda vrátí true, jinak false.
	 */
	public boolean jePotrebaPujcit(){
		return false;
	}

	/**
	 * Pùjèí pomùcku.
	 */
	public void pujci(){

	}

	/**
	 * Nastaví typ pomùcky.
	 * 
	 * @param newVal
	 */
	public void settypPomucky(TypPomucky newVal){
		typPomucky = newVal;
	}

}