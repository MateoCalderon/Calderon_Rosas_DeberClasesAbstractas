
package dominio;

public abstract class Animales extends SerVivo{
private String tipoA;
 @Override
    public void Alimentarse() {
        System.out.println("Hay dos tipos de animales:");
    }
    
    public void setTipoA(String tipoA){
        this.tipoA = tipoA;
    }
    public String getTipoA(){
        return this.tipoA;
    }

}
