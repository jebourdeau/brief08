```mermaid
---
Legacy of Lands
---

classDiagram
        class Main {
            +lancementDuJeu()
        }
        
        class Village {
            +creationDeBatiment()
            +creationDUnites()
            +creationDeRessources()
        }
        
        class Ressource {
            <<abstract>>
        }
        
        class Quetes {
            +description()
        }
        
        class Ressources {
            +quantite()
        }
        
        class Batiment {
            <<abstract>>
        }
        
        class Ferme {
            +creationDeRessource()
        }
        
        class Caserne {
            +creationDUnitesMilitaires()
        }
        
        class Atelier {
            +creationDArmesMateriaux()
        }
        
        class Maison {
            +repos()
        }
        
        class MurDefense {
            +protegerLeVillage()
        }
        
        class Unites {
            <<abstract>>
        }
        
        class Chef {
            +dirigerCommandement()
            +defendreVillage()
            +buffTroupe()
        }
        
        class Soldat {
            +defendreVillage()
            +quetes()
        }
        
        class Eclaireur {
            +explorer()
            +reposerEnMaison()
        }
        
        class Villageois {
            +recolterRessources()
            +construire()
            +seReposer()
            +vaguer()
        }
        
        class Artisan {
            +fabriquerOutilsArmes()
            +vaguer()
            +seReposer()
        }
    

    Village "1" *-- "many" Batiment : "contient"
    Village "1" o-- "many" Unites : "contient"
    Village "1" *-- "many" Ressource : "contient"
    
    Batiment <|-- Ferme
    Batiment <|-- Caserne
    Batiment <|-- Atelier
    Batiment <|-- Maison
    Batiment <|-- MurDefense

    Unites <|-- Chef
    Unites <|-- Artisan
    Unites <|-- Eclaireur
    Unites <|-- Soldat
    Unites <|-- Villageois

    Artisan --> Atelier : "travaille"
    Artisan --> Maison : "se repose"
    Artisan --> Village : "appartient"
    
    Chef --> Village : "appartient"
    Chef --> Maison : "se repose"
    Chef --> Quetes : "accomplit"

    Soldat --> Village : "appartient"
    Soldat --> Maison : "se repose"
    Soldat --> Quetes : "accomplit"

    Eclaireur --> Maison : "se repose"
    Eclaireur --> Village : "appartient"

    Villageois --> Ressources : "collecte"
    Villageois --> Batiment : "construit"
    Villageois --> Quetes : "accomplit"
    Villageois --> Village : "appartient"

    Ressource <|-- Quetes
    Ressource <|-- Ressources

 style Main fill:grey,stroke:#000,stroke-width:2px;
 style Village fill:#b71,stroke:#000,stroke-width:2px;

    style Batiment fill:#f32,stroke:#000,stroke-width:2px;
    style Atelier fill:#f32,stroke:#000,stroke-width:2px;
    style Caserne fill:#f32,stroke:#000,stroke-width:2px;
    style Ferme fill:#f32,stroke:#000,stroke-width:2px;
    style Maison fill:#f32,stroke:#000,stroke-width:2px;
    style MurDefense fill:#f32,stroke:#000,stroke-width:2px;


    style Unites fill:#0000ff,stroke:#000,stroke-width:2px;
    style Soldat fill:#0000ff,stroke:#000,stroke-width:2px;
    style Eclaireur fill:#0000ff,stroke:#000,stroke-width:2px;
    style Villageois fill:#0000ff,stroke:#000,stroke-width:2px;
    style Artisan fill:#0000ff,stroke:#000,stroke-width:2px;
    style Chef fill:#0000ff,stroke:#000,stroke-width:2px;

    style Ressource fill:#ffff00,stroke:#000,stroke-width:2px;
    style Quetes fill:#ffff00,stroke:#000,stroke-width:2px;
    style Ressources fill:#ffff00,stroke:#000,stroke-width:2px;
    



