import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Library{
    
    String filnamn;
    ArrayList <AbstractItem> item;
    ArrayList info;
    
    public Library(){
        info = new ArrayList<>();
    };
    /*
    Denna är metoden för läsning av en CSV-fil.
    */
    public ArrayList<AbstractItem> lasFil(){
        info.clear();
        String s;
        try{
            BufferedReader lastfil = new BufferedReader(new FileReader(filnamn));
            s = lastfil.readLine();
            s = lastfil.readLine();
            String[] datapost;
            
            while(s != null){
                datapost = s.split(";");
                
                AbstractItem item = new AbstractItem (datapost[0], datapost[1], 
                datapost[2], datapost[3], datapost[4]);
                
                info.add(item);
                s = lastfil.readLine();
            }
            
            Collections.sort(info);
            lastfil.close();
        }
        
        catch (IOException e){}
        catch(NullPointerException e){JOptionPane.showMessageDialog(null, 
                "You have not selected which file you want to read from!"
        );} 
        
        return info;
    }
    /*
    Denna är metoden för att välja vilken CSV-fil man skriver till eller 
    läser ifrån. När rutan kommer upp så kan man skapa en CSV-fil ifall 
    man inte vill välja någon av de som redan finns!
    */
    public String fileChooser(){
         
       JFileChooser fc = new JFileChooser ( System.getProperty("user.dir"));
       fc.showDialog(null, "Välj fil");
       filnamn = fc.getSelectedFile().getName();
       return filnamn;
    }
    /*
    Denna är metoden för att skriva till XML-filen. Man kan endast ha ett objekt
    * lagrad i filen. Varje gång man skriver till filen så skrivs det nya 
    * över det gamla objektet. Den fungerar inte dock...
    */
    public static void writeXML (String filnamn, AbstractItem item){
                
	String output = "myXML.xml";
	try{
            // Skapar XMLOutputFactory
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            // create XMLEventWriter
            XMLEventWriter eventWriter = outputFactory
                    .createXMLEventWriter(new FileOutputStream(output));

            // Skapar EventFactory
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            XMLEvent end = eventFactory.createDTD("\n");
            XMLEvent tab = eventFactory.createDTD("\t");
            // Skapa och skriva till Start Tag
            StartDocument startDocument = eventFactory.createStartDocument();
            eventWriter.add(startDocument);

            // Skapar en konfig tag
            StartElement libStartElement = eventFactory.createStartElement("",
                    "", "register");
                      eventWriter.add(end);
            eventWriter.add(libStartElement);
            eventWriter.add(end);
            StartElement itemStartElement = eventFactory.createStartElement("",
                    "", "item");

            eventWriter.add(tab);
            eventWriter.add(itemStartElement);
            eventWriter.add(end);
            createNode(eventWriter, "Name", item.getName());
            createNode(eventWriter, "Year", item.getYear());
            createNode(eventWriter, "Producer", item.getProducer());
            createNode(eventWriter, "Type", item.getType());
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createEndElement("", "", "item"));
            eventWriter.add(end);

            eventWriter.add(eventFactory.createEndElement("", "", "register"));
            eventWriter.add(end);
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
        } 
        catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
                
    }
    /*
    Denna är metoden som skapar en tagg.
    */
    private static void createNode(XMLEventWriter eventWriter, String name,
    String value) throws XMLStreamException {

        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        // Skapar start nod
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        // Skapar innehåll
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);

        // Skapar slut nod
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);

    }

}
