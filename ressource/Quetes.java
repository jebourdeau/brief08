package ressource;
public class Quetes {
    private String description;
    private Boolean terminer;
    private Ressources recompense;
    private int quantitéRécompense;
    public Quetes(String description, Boolean terminer, Ressources recompense, int quantitéRécompense) {
        this.description = description;
        this.terminer = terminer;
        this.recompense = recompense;
        this.quantitéRécompense = quantitéRécompense;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getTerminer() {
        return terminer;
    }
    public void setTerminer(Boolean terminer) {
        this.terminer = terminer;
    }
    public Ressources getRecompense() {
        return recompense;
    }
    public void setRecompense(Ressources recompense) {
        this.recompense = recompense;
    }
    public int getQuantitéRécompense() {
        return quantitéRécompense;
    }
    public void setQuantitéRécompense(int quantitéRécompense) {
        this.quantitéRécompense = quantitéRécompense;
    }






    
}
