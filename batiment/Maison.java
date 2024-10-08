package batiment;

public class Maison extends Batiments {
    private Integer capaciter;

    public Maison(String name, Integer pointVie, Integer capaciter) {
        super(name, pointVie);
        this.capaciter = capaciter;
    }
    
    public void utility(){
        System.out.println("j'ai " + capaciter + " place disponible");
    }
   
}
