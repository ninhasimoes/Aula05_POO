package Exercício01;

public class MonitorEnergia {
    double [] consumo; // só declara o vetor, valor será recebido no metódo construtor
    int indice;

    public MonitorEnergia (int tamanho){
        this.consumo=new double[tamanho];
    }

    public void registrar(double valor){
        if(indice<consumo.length) {
            consumo[indice] = valor;
            indice++;
        }
    }

    public double mediaDiaria (){
        double soma=0;
        for (int i = 0; i < indice; i++) {
            soma += consumo[i];
        }
        return soma/indice;
    }

}
