import util.Adresa;
import kolekce.ObjednavkyZakaznika;

/**
 * Tøída Zakaznik reprezentuje zakazníky sporzone. Tøída Zakaznik  deklaruje
 * operace, které mùže zákazník provádìt nebo které je možné provádìt jménem
 * zákazníka.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class Zakaznik {

	/**
	 * Bydlištì zákazníka
	 */
	private Adresa bydliste = null;
	/**
	 * Identifikaèní èíslo zákazníka.
	 */
	private int Id;
	/**
	 * Jméno zákazníka.
	 */
	private String jmeno = "";
	/**
	 * Seznam kurtù zákazníka.
	 */
	private KurtyZakaznika kurtyZakaznika = null;
	/**
	 * Seznam objednávek zákazníka.
	 */
	private ObjednavkyZakaznika objednavkyZakaznika = null;
	public Platba m_Platba;
	private Adresa bydlištì;
	public ObjednavkyZakaznika m_ObjednavkyZakaznika;

	/**
	 * Vyvtvoøí novou instanci.
	 */
	public Zakaznik(){

	}

	/**
	 * Adresa zákazníka.
	 */
	public Adresa getbydliste(){
		return bydliste;
	}

	/**
	 * Id Zákazníka.
	 */
	public int getId(){
		return Id;
	}

	/**
	 * Jméno zákazníka.
	 */
	public int getjmeno(){
		return jmeno;
	}

	/**
	 * Zjistí, zda je již nìjaká objednávka zákazníka, pokud ano vrátí true, pokud ne
	 * vrátí false.
	 */
	public boolean jeObjednavka(){
		return false;
	}

	/**
	 * Ovìøí  Id zákazníka.
	 */
	public void overId(){

	}

	/**
	 * Zjístí poèet objednávek.
	 */
	public int poèetObjednavek(){
		return 0;
	}

	/**
	 * Bydlištì zákazníka.
	 * 
	 * @param newVal
	 */
	public void setbydliste(Adresa newVal){
		bydliste = newVal;
	}

	/**
	 * Id zákazníka.
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		Id = newVal;
	}

	/**
	 * Jméno zákazníka.
	 * 
	 * @param newVal
	 */
	public void setjmeno(int newVal){
		jmeno = newVal;
	}

	/**
	 * Vypíše Objednávky.
	 */
	public void vypisObjednavky(){

	}

	/**
	 * Vytvoøí objednávku.
	 */
	public void vytvor(){

	}

	/**
	 * Zaplatí objednávku.
	 */
	public void zaplatObjednavku(){

	}

}