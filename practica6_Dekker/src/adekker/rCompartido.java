package adekker;

public class rCompartido {
    private String rc;
    boolean pDentro;
    boolean pDesea;
    int turno;
    
    public rCompartido(String rc, int turno) {
        this.rc = rc;
        this.turno = turno;
    }
    
    rCompartido(){
        rc="";
        pDentro = true;
        pDesea = false;
    }
   
    public String getRc() {
        return rc;
    }
    
    public void setRc(String dato){
        this.rc=dato;
    }
    
}

