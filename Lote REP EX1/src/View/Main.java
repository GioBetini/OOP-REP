package View;

import Model.Ingresso;
import Model.VIP;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        VIP ingressoVIP = new VIP();

        ingressoVIP.setCodigo("1");
        ingressoVIP.setValor(100);
        ingressoVIP.setCargo("Pescador de Ouriço-do-mar");
        System.out.println(ingressoVIP.valorFinal(10));

        Ingresso ing = new Ingresso();

        ing.setCodigo("2");
        ing.setValor(50);
        System.out.println(ing.valorFinal(5));

        
    }
}
