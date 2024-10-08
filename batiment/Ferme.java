package batiment;

public class Ferme extends Batiments {
    private Integer food;

    public Ferme(String name, Integer pointVie, Integer food) {
        super(name, pointVie);
        this.food = food;
    }
    public void utility(){
        System.out.println("stock de nourriture restant : " + food +".");
    }
}