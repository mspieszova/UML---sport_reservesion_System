import util.ParametryKurtu;

/**
 * Je t��da reprezentuj�c� re�ln� kurt, kter� je mo�n� objednat.Je mo�n� i p�idat
 * nov� kurty - tzn.vytvo�en� nov�ch hodin k objedn�n�.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class Kurt {

	/**
	 * Objedn�vka kurtu.
	 */
	private Objednavka objednavka = null;
	/**
	 * Parametry kurtu.
	 */
	private ParametryKurtu parametry = null;

	public Kurt(){

	}

	/**
	 * Objedn�vka kurtu.
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
	 * Zjist�, zda je kurt voln�, pokud ano vr�t� hodnou true, pokud ne false.
	 */
	public boolean jeVolny(){
		return false;
	}

	/**
	 * Zjist�, zda je kurt ji� vytvo�en, pokud ano vr�t� hodnou true, pokud ne false.
	 */
	public boolean jeVytvoren(){
		return false;
	}

	/**
	 * Objedn� kurt.
	 */
	public void objednej(){

	}

	/**
	 * Nastav� parametry kurtu.
	 * 
	 * @param newVal
	 */
	public void setparametry(ParametryKurtu newVal){
		parametry = newVal;
	}

	/**
	 * Vyhled� voln� kurt.
	 */
	public void vyhledejVolny(){

	}

	/**
	 * Vytvo�� nov� kurt.
	 */
	public void VytvorNovy(){

	}

}