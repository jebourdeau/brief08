package batiment;

public class Mur_defense extends Batiments{
    public Mur_defense(String name, Integer pointVie){
        super(name, pointVie);
    }
    public void utility(){
        System.out.println("ceci est un mur");
    }
}
