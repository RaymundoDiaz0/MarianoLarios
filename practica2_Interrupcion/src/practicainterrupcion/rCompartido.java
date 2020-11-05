package practicainterrupcion;

public class rCompartido {
    public Interrupcion i1 = new Interrupcion();
    public Interrupcion i2 = new Interrupcion();
    public Interrupcion i3 = new Interrupcion();
    private String rc;
    
    public rCompartido(String rc) {
        this.rc = rc;
    }
    
    rCompartido(){
        rc="";
    }
    
    public String getRC() {
        return rc;
    }
    
    public void setRC(String dato){
        this.rc=dato;
    }
    
    public String getRc() {
        return rc;
    }
    
}

