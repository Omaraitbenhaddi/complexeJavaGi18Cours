package aiac.gi18.java.complexe;

import java.util.ArrayList;

public class Listecomplexe extends ArrayList<Complexe>  {

    private double reel;
    private double img; 
    @Override
    public boolean add(Complexe e) {
        if(this.contains(e)) return false;
        else return super.add(e);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Complexe)) return false;
		return ((Complexe)o).reel==this.reel && ((Complexe)o).img==this.img;
    }

    
    

    

}
