package unités;

public abstract class Unités {
    private String name;
    private Integer pointVie;



    public Unités(String name, Integer pointVie) {
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

    public abstract void action();
    
    @Override
    public String toString() {
        return "Unités [name=" + name + ", pointVie=" + pointVie + "]";
    }

    

}
