package pExclusion;

public class Mutex {
    
    public Mutex(){}
    
    public void lock(){
        try{
            wait(100);
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void unlock(){
        try{
            notify();
        }catch(Exception e){e.printStackTrace();}
    }
}
