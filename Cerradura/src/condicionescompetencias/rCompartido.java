package condicionescompetencias;

public class rCompartido {
    private String rc;
    private Cerradura cerr;
 
    rCompartido(Cerradura cerr, String rc){
        this.cerr = cerr;
        this.rc=rc;
    }
    
    rCompartido(){
        rc="";
        cerr = new Cerradura();
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

    public void setCerradura(String dato) {
         if(!cerr.isCerr()){
            cerr.Cierra();
            this.rc=dato;
            this.rc = dato;
        }
    }
   
}
