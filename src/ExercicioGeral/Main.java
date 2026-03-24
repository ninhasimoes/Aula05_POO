package ExercicioGeral;

import java.util.Scanner;
//byte usado para numeros pequenos ate 127
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Veiculo [] veiculo = new Veiculo[5];
    static int indexVeiculo;
    static  Registro[] registro = new Registro[10];
    static int indexRegistro;
    public static void main(String[] args) {


        int opcao;
        do {
            System.out.println("#### ESTACIONAMENTO PARKEASY #####");
            System.out.println("[1] Entrada de veículos");
            System.out.println("[2] Saída de veículos");
            System.out.println("[3] Imprimir veículos estacionados");
            System.out.println("[4] Imprimir a receita");
            System.out.println("[5] Finalizar");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> entrada();
                case 3 -> imprimirVeiculos();
            }


        } while (opcao != 5);
    }



    //assinatura do metódo seu cabeçalho
    private static void entrada() {
        Veiculo veiculoEncontrado = pesquisarVeiculo();
        String nome;
        String marca, modelo, placa;
        long cpf;
        String horaEntrada;
        if (veiculoEncontrado == null){
            System.out.print("Marca --> ");
            marca =sc.next();
            System.out.print("Modelo --> ");
            modelo =sc.next();
            System.out.print("Placa--> ");
            placa =sc.next().toUpperCase();
            System.out.print("Nome do proprietário");
            nome = sc.next();
            System.out.print("CPF -->");
            cpf = sc.nextLong();
            Proprietario proprietario = new Proprietario(nome,cpf);
            veiculo[indexVeiculo]=new Veiculo(marca,modelo,placa,proprietario);
            indexVeiculo++;

        }
        else {
            System.out.println("Hora de entrada no formato hh:mm-->");
            horaEntrada = sc.next();
            registro[indexRegistro]= new Registro(veiculoEncontrado,horaEntrada);
            indexRegistro++;
        }
    }
    private static void imprimirVeiculos() {
        System.out.println("###### Veículos Estacionados ######");
        for (int i = 0; i < indexRegistro; i++) {
            System.out.println("Placa --> "+registro[i].veiculo.placa);
            System.out.println("Modelo --> "+registro[i].veiculo.modelo);
            System.out.println("Marca --> "+registro[i].veiculo.marca);
            System.out.println("Marca --> "+registro[i].veiculo.proprietario);

        }
    }
    public static Veiculo pesquisarVeiculo () {
        String placa;
        System.out.print("Placa --> ");
        placa = sc.next().toUpperCase();
        for (int i = 0; i < indexVeiculo; i++) {
           if (veiculo[i].placa.equals(placa));//estamos comparando a placa
            return veiculo[i];
        }

        System.out.println("Veículo não encontrado");
        return null; //para objeto sempre retornar null
    }


}
