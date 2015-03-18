/**
 * Detta är subklassen Game
 * @author 95farfar
 */
public class Game extends AbstractItem{
/**
 * Detta är medlemsvariablerna jag använder mig av
 */
    public String name;
    public String year;
    public String genre;
    public String producer;
    
    public Game(){
      this.name = "PES 2015";
      this.year = "2014"; 
      this.genre = "Sport";
      this.producer = "Ubisoft";
    }
    /**
     * Detta är metoden som tilldelar medlemsvariablerna det användaren har
     * matat in
     * @param name Namnet eller titlen på objektet
     * @param year Året objektet blev släppt
     * @param genre Vad för genre objektet har
     * @param producer Utveklaren eller utgivaren av objektet
     */
    public Game(String name, String year, String genre, String producer){
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
                this.producer + ";" +"Game";
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
