package batiment;

public abstract class Batiments{
    
    private String name;
    private Integer pointVie;
    
    public Batiments(String name, Integer pointVie) {
        this.name = name;
        this.pointVie = pointVie;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPointVie() {
        return pointVie;
    }

    public void setPointVie(Integer pointVie) {
        this.pointVie = pointVie;
    }
    
    @Override
    public String toString() {
        return "Batiments [name=" + name + ", pointVie=" + pointVie + "]";
    }

    public abstract void utility();
}
