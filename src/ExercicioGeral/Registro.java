package ExercicioGeral;

import java.time.Duration;
import java.time.LocalTime;

public class Registro {
    Veiculo veiculo; //registro tem um veiculo, isso é composição
    String horaEntrada;
    String horaSaida;


    Registro(Veiculo veiculo, String horaEntrada) {
        this.veiculo = veiculo;
        this.horaEntrada = horaEntrada;
    }
    public double calcularTempo() {
        LocalTime inicio, fim;
        double valor;
        inicio = LocalTime.parse(horaEntrada);
        fim = LocalTime.parse(horaSaida);

        long minutos = Duration.between(inicio, fim).toMinutes();
        valor = minutos * 0.75;
        return valor;
    }
    }






