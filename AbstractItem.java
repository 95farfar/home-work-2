/**
 * Detta är superklassen
 * @author 95farfar
 */
public class AbstractItem implements Comparable {
    /**
     * Dessa är alla medlemsvarabler som programmet använder sig av
     */
    protected String name;
    protected String year;
    protected String genre;
    protected String producer;
    protected String type;
    
    public AbstractItem(){
      this.name = "FIFA 14";
      this.year = "2013"; 
      this.genre = "Sport";
      this.producer = "EA SPORTS";
      this.type = "Game";
      
    }
    /**
     * Detta är metoden som tilldelar medlemsvariablerna det användaren har
     * matat in
     * @param name Namnet eller titlen på objektet
     * @param year Året objektet blev släppt
     * @param genre Vad för genre objektet har
     * @param producer Utveklaren eller utgivaren av objektet
     */
    public AbstractItem(String name, String year, String genre, 
            String producer, String type){
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.type = type;
    }
    /**
     * Detta är metoden för hur man skriver till en CSV-fil
     * @return String
     */
    @Override
    public String toString(){
        return this.name + ";" + this.year + ";" + this.genre + ";" 
                + this.producer + ";" + this.type;
        
    }

    public String getName(){
        return name;
    }

    public String getYear(){
        return year;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public String getProducer(){
        return producer;
    }
    
    public String getType(){
        return type;
    }
    /**
     * Detta är Comparable metoden. Den sorterar med hjälp av Collection sort
     * CSV-filen när den skrivs ut. Sorteringen sker med avseende på namenet
     * @param o Den abstrakta itemet
     * @return Int:s som Collection sort använder sig av för att sortera filen 
     */
    @Override
    public int compareTo(Object o) {
       AbstractItem c = (AbstractItem) o; 
       return this.name.compareTo(c.getName());
    }
}

