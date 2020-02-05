package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {
    
    public abstract String speak(){
        return null;
    }
    //this speak function is redundant; it returns nothing. we add abstract to this method
    //implies every subclass has their own unique speak method
}
