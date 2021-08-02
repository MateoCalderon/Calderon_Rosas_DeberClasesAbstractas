
package dominio;

public abstract class SerVivo {
    private String tipo;
    public abstract void Alimentarse();
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
}
