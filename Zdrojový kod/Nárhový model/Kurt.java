import util.ParametryKurtu;

/**
 * Je tøída reprezentující reálný kurt, který je možné objednat.Je možné i pøidat
 * nové kurty - tzn.vytvoøení nových hodin k objednání.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class Kurt {

	/**
	 * Objednávka kurtu.
	 */
	private Objednavka objednavka = null;
	/**
	 * Parametry kurtu.
	 */
	private ParametryKurtu parametry = null;

	public Kurt(){

	}

	/**
	 * Objednávka kurtu.
	 */
	public Objednavka getobjednavka(){
		return objednavka;
	}

	/**
	 * Parametry kurtu.
	 */
	public ParametryKurtu getparametry(){
		return parametry;
	}

	/**
	 * Zjistí, zda je kurt volný, pokud ano vrátí hodnou true, pokud ne false.
	 */
	public boolean jeVolny(){
		return false;
	}

	/**
	 * Zjistí, zda je kurt již vytvoøen, pokud ano vrátí hodnou true, pokud ne false.
	 */
	public boolean jeVytvoren(){
		return false;
	}

	/**
	 * Objedná kurt.
	 */
	public void objednej(){

	}

	/**
	 * Nastaví parametry kurtu.
	 * 
	 * @param newVal
	 */
	public void setparametry(ParametryKurtu newVal){
		parametry = newVal;
	}

	/**
	 * Vyhledá volný kurt.
	 */
	public void vyhledejVolny(){

	}

	/**
	 * Vytvoøí nový kurt.
	 */
	public void VytvorNovy(){

	}

}