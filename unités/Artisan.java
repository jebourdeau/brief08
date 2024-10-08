package unités;

public class Artisan extends Unités{
    public Artisan(String name, Integer pointVie){
        super(name, pointVie);
    }
    
    @Override

    public void action(){
        System.out.println("fabrique, améliore batiments et armes");
    }
    public void repos() {
        System.out.println(" se repose");
    }
    
}
