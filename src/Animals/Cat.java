package Animals;

public class Cat {
    //Attribute der Katzenklasse
    public String name;
    public String race;
    public String ownerName;
    public String furColor;

    public Cat(String name,String race, String ownerName,String furColor){ //Konstruktor der Klasse Katze
        this.name=name; //Zuweisung der Attributwerte der erzeugten Instanz
        //this.name drückt aus, dass auf das Attribut der Instanz zugegriffen werden soll
        this.race=race;
        this.ownerName=ownerName;
        this.furColor=furColor;
    }

    public void meow(){
        System.out.println(name+" meowt!");
    }


}
