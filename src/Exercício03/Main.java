package Exercício03;

import java.util.Scanner;

public class Main {
    static Bilhete[] bilhete= new Bilhete[10]; //vetor de objeto, ele guarda o endereço de memória aonde estão os atributos do objeto
    static Scanner sc = new Scanner(System.in);
    static int index =0;//usamos index para o controle da posição
    public static void main(String[] args) {

        int opcao;//variavel local n tem valor
        do {
            System.out.println("*************************");
            System.out.println("Selecione uma opção do menu:");
            System.out.println("1- Cadastrar bilhete");
            System.out.println("2- Carregar");
            System.out.println("3- Passar na catraca");
            System.out.println("4- Finalizar");
            opcao = sc.nextInt();
        } while (opcao != 4);

        switch (opcao) {
            case 1 -> cadastrarBilhete();
            case 2 -> carregar();
            case 3 -> passarNaCatraca();
            case 4 -> System.out.println("Obrigado por usar o nosso App");
            default -> System.out.println("Opção inválida");
        }
        while (opcao != 4) ; //usa-se ; para do whilr

    }

    private static void carregar() {
        double valor;
        Bilhete bilheteEncontrado = pesquisar();
        if (bilheteEncontrado != null){
            System.out.println("Qual o valor da recarga? ");
            valor=sc.nextDouble();
            bilheteEncontrado.carregar(valor);
        }
    }

    private static void cadastrarBilhete () {
            String nome;
            long cpf;
            String tipoTarifa;
            if (index < bilhete.length) {
                System.out.println("Nome do usuário: ");
                nome=sc.nextLine();
                System.out.println("CPF: ");
                cpf=sc.nextLong();
                System.out.println("Tipo Tarifa: (ESTUDANTE | PROFESSOR | NORMAL)");
                tipoTarifa= sc.next();
                Usuario usuario = new Usuario(nome,cpf,tipoTarifa);//chamada do metódo construtor, os parametros DEVE estar em ordem
                //bilhete[index]=new Bilhete(usuario);
                index++;
            }
            else {
                System.out.println("Erro ao gerar o bilhete! Procure um aposto de atendimento");
        }
    }

        public static Bilhete pesquisar(){//retornamos um objeto do tipo bilhete para dar um return de tudo que tem no objeto
            long cpf;
            System.out.println("Qual o CPF para pesquisa? ");
            cpf = sc.nextLong();

            for (int i = 0; i < index; i++) {
                if (bilhete[i].usuario.cpf == cpf){
                    return  bilhete[i];
                }
            }
            return null;
        }
}
