package tanques;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Agua {
    
    public int rc;
    public int y;
    private Rectangle2D agua;
    
    Agua(){
        this.rc = 0;
        this.y = 250;
        this.agua = new Rectangle2D.Double(0,0,0,0);
    }
    
    public Rectangle2D Agua(){
        agua.setRect(50, y-rc, 100, rc);
        return agua;
    }
            
}
