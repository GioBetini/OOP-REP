package Model;

public class Ingresso{
    private String codigo;
    private float valor;

    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public float valorFinal(float conveniencia){
        return valor + conveniencia;
    }
    
}