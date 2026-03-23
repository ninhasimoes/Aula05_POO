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
    public long calcularTempo() {
        LocalTime inicio = LocalTime.parse(horaEntrada);
        LocalTime fim = LocalTime.parse(horaSaida);

        return Duration.between(inicio, fim).toMinutes();
    }
    public double calcularValor() {
        return calcularTempo() * 0.75;
    }
    public void registrarSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }



}
