import kolekce.ObjednavkySportovniPomucky;
import kolekce.ObjednavkyKurtu;

/**
 * Tøída Objednavka slouží k reprezentaci aktu objednání kuurtu zákazníkerm.
 * Instance ze tøídy obdjenávka vznikaji objednáním kurtu a zaníkají zrušením
 * objdednávky.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class Objednavka {

	/**
	 * Identifikace objednávky.
	 */
	private int Id;
	/**
	 * Objednávky kurtù.
	 */
	private ObjednavkyKurtu objednavkyKurtu = null;
	/**
	 * Objednávky sportovních pomùcek.
	 */
	private ObjednavkySportovniPomucky objednavkySportovniPomucky = null;
	/**
	 * Sportovní pomùcka.
	 */
	private SportovniPomucka sportovniPomucka = null;
	/**
	 * Zákazník.
	 */
	private Zakaznik zakaznik = null;
	public Platba m_Platba;
	private ObjednavkyKurtu m_ObjednavkyKurtu;

	/**
	 * Vytvoøí instanci ze tøídy.
	 */
	public Objednavka(){

	}

	public int getId(){
		return Id;
	}

	public Zakaznik getzakaznik(){
		return zakaznik;
	}

	/**
	 * Zjistí, zda je objednávka zaplacena, pokud ano vrátí true, jinak false.
	 */
	public boolean jeZaplacena(){
		return false;
	}

	/**
	 * Provede objednávku.
	 */
	public void provedObjednavkuKurtu(){

	}

	/**
	 * Nastaví Id.
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		Id = newVal;
	}

	/**
	 * Vyhledá objednávku.
	 */
	public void vyhledej(){

	}

	/**
	 * Vytvoøí novou objednávku.
	 */
	public void vytvorNovou(){

	}

	/**
	 * Zruší objednávku.
	 */
	public void zrus(){

	}

}