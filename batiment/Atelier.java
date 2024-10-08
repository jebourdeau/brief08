package batiment;

public class Atelier extends Batiments{
    private Integer craftWeapon;
    private Integer craftUtils;
    private Integer upgrade;
    


    public Atelier(String name, Integer pointVie, Integer craftWeapon, Integer craftUtils, Integer upgrade) {
        super(name, pointVie);
        this.craftWeapon = craftWeapon;
        this.craftUtils = craftUtils;
        this.upgrade = upgrade;

    }


    public void utility() {
        System.out.println("vous voulez créer : "+ craftUtils + " ou " + craftWeapon + " ou "+ upgrade);
    }

}
