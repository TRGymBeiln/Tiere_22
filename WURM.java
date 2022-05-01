/**
 * Beschreiben Sie hier die Klasse WURM.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WURM implements TIER
{
    private String name;
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse WURM
     */
    public WURM()
    {
        name = "WURM";

    }

    /**
     * Geraeusch eines Wurms
     * 
     * @return        gib das Gerausch zurueck
     */
    public String machtGeraesch()
    {
        return "Blubb";
    }
}