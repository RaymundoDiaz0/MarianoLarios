package condicionescompetencias;

public class Cerradura {
    private boolean vcerr;
    
    Cerradura(){
        vcerr=false;
    }
    
    public boolean isCerr(){
        return vcerr;
    }
    
    public void setCerr(boolean vcerr){
        this.vcerr = vcerr;
    }
    
    public void Cierra(){
        vcerr=true;
    }
    
    public void Abre(){
        vcerr=false;
    }
    
}
