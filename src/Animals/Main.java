package Animals;

public class Main {
    public static void main(String args[]){
        Cat garfield=new Cat("Garfield","Siam","Peter","white-black");
        System.out.println("Fellfarbe von Arlene: "+garfield.furColor);
        System.out.println("Besitzer von Arlene: "+garfield.ownerName);
        garfield.meow();
        Cat arlene=new Cat("Arlene","British Shorthair","Peter","brown");

        System.out.println("Fellfarbe von Arlene: "+arlene.furColor);
        System.out.println("Besitzer von Arlene: "+arlene.ownerName);
        arlene.meow();
        //verändern von Attributwerten
        arlene.ownerName="Max";
        System.out.println("Besitzer von Arlene: "+arlene.ownerName);

        Dog juergen=new Dog("Jürgen","Schäferhund","Peter","brown");

        //!!! Private Variable
        //System.out.println("Besitzer von Jürgen: "+juergen.ownerName);
        //zugriff mit Getter
        System.out.println("Besitzer von Jürgen: "+juergen.getOwnerName());
        juergen.setOwnerName("Felix");
        System.out.println("Besitzer von Jürgen: "+juergen.getOwnerName());

    }
}
