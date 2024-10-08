package batiment;

public class Caserne extends Batiments{
    private int quantiteSoldat;
    public Caserne(String name, Integer pointVie, int quantiteSoldat) {
        super(name, pointVie);
        this.quantiteSoldat = quantiteSoldat;
    }

    public void utility() {
        System.out.println("j'ai " + quantiteSoldat + " soldats");
    }
}
