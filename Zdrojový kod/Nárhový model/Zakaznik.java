import util.Adresa;
import kolekce.ObjednavkyZakaznika;

/**
 * T��da Zakaznik reprezentuje zakazn�ky sporzone. T��da Zakaznik  deklaruje
 * operace, kter� m��e z�kazn�k prov�d�t nebo kter� je mo�n� prov�d�t jm�nem
 * z�kazn�ka.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class Zakaznik {

	/**
	 * Bydli�t� z�kazn�ka
	 */
	private Adresa bydliste = null;
	/**
	 * Identifika�n� ��slo z�kazn�ka.
	 */
	private int Id;
	/**
	 * Jm�no z�kazn�ka.
	 */
	private String jmeno = "";
	/**
	 * Seznam kurt� z�kazn�ka.
	 */
	private KurtyZakaznika kurtyZakaznika = null;
	/**
	 * Seznam objedn�vek z�kazn�ka.
	 */
	private ObjednavkyZakaznika objednavkyZakaznika = null;
	public Platba m_Platba;
	private Adresa bydli�t�;
	public ObjednavkyZakaznika m_ObjednavkyZakaznika;

	/**
	 * Vyvtvo�� novou instanci.
	 */
	public Zakaznik(){

	}

	/**
	 * Adresa z�kazn�ka.
	 */
	public Adresa getbydliste(){
		return bydliste;
	}

	/**
	 * Id Z�kazn�ka.
	 */
	public int getId(){
		return Id;
	}

	/**
	 * Jm�no z�kazn�ka.
	 */
	public int getjmeno(){
		return jmeno;
	}

	/**
	 * Zjist�, zda je ji� n�jak� objedn�vka z�kazn�ka, pokud ano vr�t� true, pokud ne
	 * vr�t� false.
	 */
	public boolean jeObjednavka(){
		return false;
	}

	/**
	 * Ov���  Id z�kazn�ka.
	 */
	public void overId(){

	}

	/**
	 * Zj�st� po�et objedn�vek.
	 */
	public int po�etObjednavek(){
		return 0;
	}

	/**
	 * Bydli�t� z�kazn�ka.
	 * 
	 * @param newVal
	 */
	public void setbydliste(Adresa newVal){
		bydliste = newVal;
	}

	/**
	 * Id z�kazn�ka.
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		Id = newVal;
	}

	/**
	 * Jm�no z�kazn�ka.
	 * 
	 * @param newVal
	 */
	public void setjmeno(int newVal){
		jmeno = newVal;
	}

	/**
	 * Vyp�e Objedn�vky.
	 */
	public void vypisObjednavky(){

	}

	/**
	 * Vytvo�� objedn�vku.
	 */
	public void vytvor(){

	}

	/**
	 * Zaplat� objedn�vku.
	 */
	public void zaplatObjednavku(){

	}

}