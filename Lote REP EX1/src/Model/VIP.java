package Model;

public class VIP extends Ingresso {
    
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public float valorFinal(float conveniencia) {
        return super.valorFinal(conveniencia)*1.18f;
    }

}
