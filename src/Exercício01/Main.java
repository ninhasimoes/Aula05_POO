package Exercício01;

public class Main {
    public static void main(String[] args) {
        //teste mocado
        MonitorEnergia monitor = new MonitorEnergia(200);
        monitor.registrar(3);
        monitor.registrar(1);
        monitor.registrar(2);

        System.out.println("Média dos consumos registrados: "+monitor.mediaDiaria());

    }
}
