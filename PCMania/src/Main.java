import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "Antonio";
        cliente.cpf = 987654321;

        Computador[] computadores = new Computador[3];
        computadores[0] = new Computador();
        computadores[1] = new Computador();
        computadores[2] = new Computador();

        MemoriaUSB[] memorias = new MemoriaUSB[3];
        memorias[0] = new MemoriaUSB();
        memorias[1] = new MemoriaUSB();
        memorias[2] = new MemoriaUSB();

        computadores[0].marca = "Positivo";
        computadores[0].preco = 3300;
        computadores[0].so.nome = "Linux Ubuntu";
        computadores[0].so.tipo = 32;
        computadores[0].hardware[0].nome = "Pentium Core i3";
        computadores[0].hardware[0].capacidade = 2200;
        computadores[0].hardware[1].nome = "Memória RAM";
        computadores[0].hardware[1].capacidade = 8;
        computadores[0].hardware[2].nome = "HD";
        computadores[0].hardware[2].capacidade = 500;

        memorias[0].nome = "Pendrive";
        memorias[0].capacidade = 16;

        computadores[0].addMemoriaUSB(memorias[0]);

        computadores[1].marca = "Acer";
        computadores[1].preco = 8800;
        computadores[1].so.nome = "Windows 8";
        computadores[1].so.tipo = 64;
        computadores[1].hardware[0].nome = "Pentium Core i5";
        computadores[1].hardware[0].capacidade = 3370;
        computadores[1].hardware[1].nome = "Memória RAM";
        computadores[1].hardware[1].capacidade = 16;
        computadores[1].hardware[2].nome = "HD";
        computadores[1].hardware[2].capacidade = 1000;
        memorias[1].nome = "Pendrive";
        memorias[1].capacidade = 32;

        computadores[1].addMemoriaUSB(memorias[1]);

        computadores[2].marca = "Vaio";
        computadores[2].preco = 4800;
        computadores[2].so.nome = "Windows 10";
        computadores[2].so.tipo = 64;
        computadores[2].hardware[0].nome = "Pentium Core i7";
        computadores[2].hardware[0].capacidade = 4500;
        computadores[2].hardware[1].nome = "Memória RAM";
        computadores[2].hardware[1].capacidade = 32;
        computadores[2].hardware[2].nome = "HD";
        computadores[2].hardware[2].capacidade = 2000;
        memorias[2].nome = "HD externo";
        memorias[2].capacidade = 1000;

        computadores[2].addMemoriaUSB(memorias[2]);

        int op;
        int execucoes = 0;

        do {
            System.out.println("Digite a promoção que deseja adquirir: ");
            System.out.println("====================================================================================================");
            System.out.println("1 - Para a promoção 1 | 2 - Para a promoção 2 | 3 - Para a promoção 3 | 0 - Para finalizar a compra");
            System.out.println("====================================================================================================");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    cliente.compras[execucoes] = computadores[0];
                    execucoes++;
                    System.out.println("Computador da promoção 1 adicionado ao carrinho.");
                    break;
                case 2:
                    cliente.compras[execucoes] = computadores[1];
                    execucoes++;
                    System.out.println("Computador da promoção 2 adicionado ao carrinho.");
                    break;
                case 3:
                    cliente.compras[execucoes] = computadores[2];
                    execucoes++;
                    System.out.println("Computador da promoção 2 adicionado ao carrinho.");
                    break;
                case 0:
                    System.out.println("***********************************");
                    System.out.println("Compra finalizada!");
                    System.out.println("Cliente: " + cliente.nome);
                    System.out.println("CPF: " + cliente.cpf);
                    System.out.println("Compras realizadas: ");
                    System.out.println();
                    for (int i = 0; i < execucoes; i++){
                        if (cliente.compras[i] != null)
                            cliente.compras[i].mostraPCConfigs();
                    }
                    System.out.println();
                    System.out.println("Total: R$" +cliente.calculaTotalCompra());
                    break;
                default:
                    System.out.println("Operação inválida!!!");
            }
        } while (op != 0);
    }
}