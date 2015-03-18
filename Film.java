/**
 * Detta är subklassen Film
 * @author 95farfar
 */
public class Film extends AbstractItem{
 /**
 * Detta är medlemsvariablerna jag använder mig av
 */
    public String name;
    public String year;
    public String genre;
    public String producer;
    
    public Film(){
      this.name = "Batman";
      this.year = "1995"; 
      this.genre = "Action";
      this.producer = "Cristopher Nolan";
    }
    /**
     * Detta är metoden som tilldelar medlemsvariablerna det användaren har
     * matat in
     * @param name Namnet eller titlen på objektet
     * @param year Året objektet blev släppt
     * @param genre Vad för genre objektet har
     * @param producer Utveklaren eller utgivaren av objektet
     */
    public Film(String name, String year, String genre, String producer){
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
    }
    /**
     * Detta är metoden för hur man skriver till en CSV-fil
     * @return String
     */
    @Override
    public String toString(){
        return this.name + ";" + this.year + ";" + this.genre + ";" + 
                this.producer + ";" + "Film";
    }
    /**
     * Detta är Comparable metoden. Den sorterar med hjälp av Collection sort
     * CSV-filen när den skrivs ut. Sorteringen sker med avseende på namenet
     * @param o Den objektet man jämför med
     * @return Int:s som Collection sort använder sig av för att sortera filen 
     */
    @Override
    public int compareTo(Object o) {
       AbstractItem c = (AbstractItem) o; 
       return this.name.compareTo(c.getName());
    }
}
