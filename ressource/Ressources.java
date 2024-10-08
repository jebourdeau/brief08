package ressource;
public class Ressources {

    private String name;
    private Integer quantite;

    
    public Ressources(String name, Integer quantite) {
        this.name = name;
        this.quantite = quantite;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getQuantite() {
        return quantite;
    }


    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
   
    // ajoute des quantités aux ressources
    public void addQuantite(Integer quantite){
        this.quantite += quantite;
    }
    

    // enleve des quantités aux ressources
    public void substractQuantite(Integer quantite) {
        this.quantite -= quantite;
    }


}
