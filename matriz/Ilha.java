package matriz;

import java.util.ArrayList;

public class Ilha {
    private ArrayList<String> pontos;

    public Ilha() {
        this.pontos = new ArrayList<String>();
    }

    public ArrayList<String> getPontos() {
        return pontos;
    }
    
    public String toString(){
    	return ""+getPontos();
    }
    
}