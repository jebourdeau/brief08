package unités;

public class Soldat extends Unités{
    public Soldat(String name, Integer pointVie){
        super(name, pointVie);
    }
    
    @Override
    public void action(){
        System.out.println("Défend le village!");
    }
    
    public void fight(){
        System.out.println("c'est l'heure du duel");
    }
    
}
