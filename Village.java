import java.util.List;
import java.util.ArrayList;

import batiment.Atelier;
import batiment.Batiments;
import batiment.Caserne;
import batiment.Ferme;
import batiment.Maison;
import batiment.Mur_defense;
import ressource.Ressources;
import unités.Artisan;
import unités.Chef;
import unités.Eclaireur;
import unités.Soldat;
import unités.Unités;
import unités.Villageois;

public class Village {

    private String name;
    private List<Unités> unités;
    private List<Ressources> ressources;
    private List<Batiments> batiment;

    public Village(String name) {
        this.name = name;
        this.batiment = new ArrayList<>();
        this.unités = new ArrayList<>();
        this.ressources = new ArrayList<>();
        stockInitialResources();
        stockUnités();
        stockBatiment();
        
    }

    //stock initial au départ du jeu
    private void stockInitialResources(){
        ressources.add(new Ressources("bois", 150));
        ressources.add(new Ressources("fer", 150));
        ressources.add(new Ressources("pierre", 150));
        ressources.add(new Ressources("food", 200));
    }

    // stock troupe au départ
    private void stockUnités(){
        unités.add(new Soldat("Chuck Norris", 200));
        unités.add(new Eclaireur("Adam", 100));
        unités.add(new Villageois("Rowan", 150));
        unités.add(new Artisan("Allan", 150));
        unités.add(new Chef("Chouchounouguerre", 500, 20));
    }

    //stock batiment au départ
    private void stockBatiment(){
        batiment.add(new Atelier("forge", 700, 3, 3, 1));
        batiment.add(new Caserne("military Base", 1000, 10));
        batiment.add(new Ferme("Ferme", 600, 2000));
        batiment.add(new Maison("baraque", 700, 6));
        batiment.add(new Mur_defense("La grande Muraille", 1000));
        
    }

    // methode de lancement 
    public void startGame(){
        System.out.println("Welcome to " + name);
        display();
        collectRessource(ressources.get(0), 200);

    }   
    
    private void display() {
        System.out.println("Village :");
        System.out.println("Ressources :");
        for (Ressources ressource : ressources) {
            System.out.println(ressource.getName() + " : " + ressource.getQuantite() );
        }
        System.out.println("Batiment : " + batiment + batiment.size());
        System.out.println("Unités : "+ unités + unités.size());

    }
    private void collectRessource(Ressources ressource, int quantite){
        for (Unités unité : unités) {
            if(unité instanceof Villageois){
                Villageois villageois = (Villageois) unité;
                villageois.collectRessource(ressource, quantite);
                System.out.println("collecter " + quantite + " " + ressource.getName()+ ".");
                return;
            }
            
        }
        System.out.println("personne ne boss");
    }
   

    // methode pour ajouter un batiment
    public void addBatiment(Batiments batiments){
        batiment.add(batiments);
    }
    // methode pour ajouter des unités
    public void addUnit(Soldat soldat){
        unités.add(soldat);
    }
}
