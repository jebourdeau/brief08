package unités;

import ressource.Ressources;

public class Villageois extends Unités{
    public Villageois(String name, Integer pointVie){
        super(name, pointVie);
    }

    @Override
      public void collectRessource(Ressources ressource, int quantite){
        ressource.addQuantite(quantite);
        System.out.println("collecte les ressources");
        
    }
    public void repos() {
        System.out.println(" se repose");
    }

}
