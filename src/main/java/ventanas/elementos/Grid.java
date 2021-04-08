package ventanas.elementos;

import java.awt.*;

public class Grid extends GridBagConstraints{

    public Grid(){
        super();
    }

    public Grid(int x, int y, int width, int top, int left){
        this.gridx = x;
        this.gridy = y;
        this.gridwidth = (width > 0) ? width : 1;
        this.insets = new Insets((top != 0) ? top : 0, (left != 0) ? left : 0, 0 , 0);
    }

    public Grid(int x, int y, int width, int top, int left, int ipadx, int ipady){
        this(x, y, width, top, left);
        this.ipadx = ipadx;
        this.ipady = ipady;
    }

    
}
