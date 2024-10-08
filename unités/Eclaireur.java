package unités;

public class Eclaireur extends Unités {
    public Eclaireur(String name, Integer pointVie){
        super(name, pointVie);
    }
    
    @Override

    public void action() {
        System.out.println("je fais le lapin");
    }
}
