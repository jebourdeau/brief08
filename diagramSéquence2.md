
```mermaid

---
Legacy of Lands
---

sequenceDiagram
    actor Villageois
    participant Ressources
    participant Batiment
    participant Quetes
    participant Village

    activate Villageois
    Villageois ->> Village: "Appartient"
    deactivate Villageois

    activate Villageois
    Villageois ->> Ressources: "Collecte"
    deactivate Villageois

    activate Villageois
    Villageois ->> Batiment: "Construit"
    deactivate Villageois

    activate Villageois
    Villageois ->> Quetes: "Accomplit"
    deactivate Villageois

    activate Villageois
    Villageois ->> Village: "Retourne"
    deactivate Villageois

    activate Village
    Village ->> Villageois: "Donne nouvelles missions"
    deactivate Village




