package lock;

public class rCompartido {
    private String rc;
 
    rCompartido(String rc){
        this.rc=rc;
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
   
}
