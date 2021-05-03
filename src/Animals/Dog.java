package Animals;

public class Dog {
    //Attribute der Hundeklasse
    private String name;
    private String race;
    private String ownerName;
    private String furColor;

    public Dog(String name,String race, String ownerName,String furColor){ //Konstruktor der Klasse Dog
        this.name=name; //Zuweisung der Attributwerte der erzeugten Instanz
        //this.name drückt aus, dass auf das Attribut der Instanz zugegriffen werden soll
        this.race=race;
        this.ownerName=ownerName;
        this.furColor=furColor;
    }

    public void bark(){
        System.out.println(name+" Wufft!");
    }

    //getter und setter Beispiele
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
        System.out.println("Name zu " +name+ " geändert.");
    }

    public String getRace(){
        return this.race;
    }

    public void setRace(String race){
        this.race=race;
        System.out.println("Rasse zu " +race+ " geändert.");
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
        System.out.println("Besitzer zu " +ownerName+ " geändert.");
    }

    public String getFurColor(){
        return this.furColor;
    }

    public void setFurColor(String furColor){
        this.furColor=furColor;
        System.out.println("Fellfarbe zu " +furColor+ " geändert.");
    }


}
