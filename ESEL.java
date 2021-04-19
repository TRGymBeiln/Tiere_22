/**
 * Beschreiben Sie hier die Klasse ESEL.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ESEL implements TIER
{
    private String name;
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**
     * Konstruktor für Objekte der Klasse ESEL
     */
    public ESEL()
    {
        name = "Esel";

    }

    /**
     * Gerausch eines Esels
     * 
     * @return        gib das Gerausch zurueck
     */
    public String machtGeraesch()
    {
        return "IA";
    }
}