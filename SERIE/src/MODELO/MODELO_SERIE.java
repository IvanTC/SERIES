/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author ivantc
 */
public class MODELO_SERIE {
    public int limite;

    public MODELO_SERIE(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    public String generar_serie(){
        int a=1;
        int b=1;
        int c=1;
        int cont =1;
        int aux;
        int salida;
        String sf="";
        if(limite==1){
            sf="1";
        }else{
            if(limite==2){
                sf="1        1";
            }else{
                if(limite==3){
                    sf="1        1       1";
                }else{
                    sf="1        1       1";
                    while (cont <=limite-3){
                        salida = a + b;
                        aux = b;
                        b = c;
                        a = aux;
                        c = salida;
                        cont += 1;
                        sf = sf + "         " + salida;
                    }
                 
                }
            }
        }
        
        
        return sf;
        
    }
}
