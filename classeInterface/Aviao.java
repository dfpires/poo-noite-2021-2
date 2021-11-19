package classeInterface;

public class Aviao {
    
    protected PousoController pouso;
    protected DecolaController decola;
    
    public PousoController getPouso() {
        return pouso;
    }
    public DecolaController getDecola() {
        return decola;
    }
    public void setDecola(DecolaController decola) {
        this.decola = decola;
    }
    public void setPouso(PousoController pouso) {
        this.pouso = pouso;
    }

    
}
