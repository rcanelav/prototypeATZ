package negocio;

public class Promotor extends Persona {
    private Persona representante;

    private Promotor(){
        
    }

    public Promotor(Persona representante){
        
        this.representante = representante;
    }
    
}
