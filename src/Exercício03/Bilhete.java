package Exercício03;

import java.util.Random;

public class Bilhete {
    int numero;
    double saldo;
    final static double TARIFA = 5.40;
    //PARA LIGAR O BILHETE UNICO AO USUARIO
    Usuario usuario;

    public  Bilhete (Usuario usuario){
        Random random = new Random();
        this.numero= random.nextInt(1000,9999);//metódo sobrecarregado tem diversas funções
        this.usuario = usuario;
    }


    public void carregar(double valor) {
        saldo += valor;
    }

    public boolean passarNaCatraca(){
        double valor = TARIFA / 2;
        if (usuario.tipo.equalsIgnoreCase("comum")){
            valor = TARIFA;
        }
        if (saldo<valor){
            return false;
        }
        saldo -=valor;
        return true;

    }
}
