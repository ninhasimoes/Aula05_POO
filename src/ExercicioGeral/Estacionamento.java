package ExercicioGeral;

import java.time.LocalTime;

public class Estacionamento {
    Registro[] ativos= new Registro[100];
    Registro[] historico= new Registro[100];
    int qtdAtivos;
    int qtdHistorico;
    double receitaTotal;

    void entradaVeiculo(Veiculo veiculo, String horaEntradaStr) {
        for (int i = 0; i < qtdAtivos; i++) {
            if (ativos[i].veiculo.placa.equals(veiculo.placa)) {
                System.out.println("Veículo já está estacionado.");
                return;
            }
        }

        System.out.println("Entrada registrada com sucesso.");
    }


}
