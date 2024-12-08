import kolekce.ObjednavkySportovniPomucky;
import kolekce.ObjednavkyKurtu;

/**
 * T��da Objednavka slou�� k reprezentaci aktu objedn�n� kuurtu z�kazn�kerm.
 * Instance ze t��dy obdjen�vka vznikaji objedn�n�m kurtu a zan�kaj� zru�en�m
 * objdedn�vky.
 * @author Martina Spieszova
 * @version 1.0
 * @created 06-1-2013 13:24:49
 */
public class Objednavka {

	/**
	 * Identifikace objedn�vky.
	 */
	private int Id;
	/**
	 * Objedn�vky kurt�.
	 */
	private ObjednavkyKurtu objednavkyKurtu = null;
	/**
	 * Objedn�vky sportovn�ch pom�cek.
	 */
	private ObjednavkySportovniPomucky objednavkySportovniPomucky = null;
	/**
	 * Sportovn� pom�cka.
	 */
	private SportovniPomucka sportovniPomucka = null;
	/**
	 * Z�kazn�k.
	 */
	private Zakaznik zakaznik = null;
	public Platba m_Platba;
	private ObjednavkyKurtu m_ObjednavkyKurtu;

	/**
	 * Vytvo�� instanci ze t��dy.
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
	 * Zjist�, zda je objedn�vka zaplacena, pokud ano vr�t� true, jinak false.
	 */
	public boolean jeZaplacena(){
		return false;
	}

	/**
	 * Provede objedn�vku.
	 */
	public void provedObjednavkuKurtu(){

	}

	/**
	 * Nastav� Id.
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		Id = newVal;
	}

	/**
	 * Vyhled� objedn�vku.
	 */
	public void vyhledej(){

	}

	/**
	 * Vytvo�� novou objedn�vku.
	 */
	public void vytvorNovou(){

	}

	/**
	 * Zru�� objedn�vku.
	 */
	public void zrus(){

	}

}