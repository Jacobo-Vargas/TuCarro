package model;
import model.TuCarro;
public enum SistemaInstance {

    SISTEMAINSTANCE;
    private final TuCarro tuCarro;

    SistemaInstance() {
        this.tuCarro = new TuCarro();
    }

    public TuCarro getSistema(){
        return tuCarro;
    }

    public TuCarro getTuCarro() {
        return tuCarro;
    }
}
