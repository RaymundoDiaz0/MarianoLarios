package pExclusion;

public class rCompartido {
    boolean algCond;
    boolean algInt;
    boolean algCerr;
    boolean algMutex;
    boolean algLock;
    boolean algDekker;
    public Interrupcion i1 = new Interrupcion();
    public Interrupcion i2 = new Interrupcion();
    public Interrupcion i3 = new Interrupcion();
    private Cerradura cerr;
    private String rc;
    private Mutex mutex = new Mutex();
    boolean pDentro;
    boolean pDesea;
    int turno;
    
    public rCompartido(Cerradura cerr, String rc, int turno) {
        this.cerr = cerr;
        this.rc = rc;
        this.turno = turno;
    }
    
    rCompartido(){
        rc="";
        cerr = new Cerradura();
        pDentro = true;
        pDesea = false;
    }
   
    public String getRc() {
        return rc;
    }
    
    public void setRc(String dato){
        this.rc=dato;
    }
    
    public String getCerradura() {
        String aux = "En espera...";
        if(cerr.isCerr()){
            cerr.Cierra();
            aux=rc;
            cerr.Abre();
        }
        return aux;
    }

    public void setCerradura(String dato){
        if(!cerr.isCerr()){
            cerr.Cierra();
            this.rc=dato;
            this.rc = dato;
        }
    }
    
}

