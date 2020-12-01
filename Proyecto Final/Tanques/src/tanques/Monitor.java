package tanques;

public class Monitor {
    
    public Agua agua;
    
    public Monitor(){
        
    }
    
    public void setAgua(Agua agua){
        this.agua = agua;
    }
    
    public synchronized void inc(){
        this.agua.rc = this.agua.rc + 5;
    }
    
    public synchronized void dec(){
        this.agua.rc = this.agua.rc = 5;
    }
    
}
