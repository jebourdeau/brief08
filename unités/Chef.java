package unités;

import java.util.List;

public class Chef extends Unités{
    private int buff;
    
    
    public Chef(String name, Integer pointVie, int buff){
        super(name, pointVie);
        this.buff = buff;

        buff = + 10;
    }

    public void action(List<Soldat> cibles){
        System.out.println("c'est qui le patron!!");
        for (Soldat cibleSoldat : cibles) {
            cibleSoldat.setPointVie(cibleSoldat.getPointVie()+this.buff);
            
        }
    }

    @Override
    public void action() {
        System.out.println("je me sens seul!");
    }
    public void repos(){
        System.out.println("je fais la sieste");
    }
    public void fight(){
        System.out.println("Aux Armes!!!!!");
    }
}
