public class Computador {
    String marca;
    float preco;
    SistemaOperacional so;
    HardwareBasico [] hardware;
    MemoriaUSB memoria;


    public Computador(){
        this.so = new SistemaOperacional();

        this.hardware = new HardwareBasico[3];
        this.hardware[0] = new HardwareBasico();
        this.hardware[1] = new HardwareBasico();
        this.hardware[2] = new HardwareBasico();
    }
    void mostraPCConfigs(){
        System.out.println("Marca: " +marca);
        System.out.println("Preço: " + preco);
        System.out.println("Processador: " +hardware[0].nome + " " +hardware[0].capacidade + " Mhz");
        System.out.println("Memória RAM: " +hardware[1].nome + " " +hardware[1].capacidade + " Gb");
        System.out.println("HD : " +hardware[2].nome + " " +hardware[2].capacidade + "Gb");
        System.out.println("Sistema operacional: " +so.nome + " " +so.tipo + " bits");
        System.out.println("Adicional: " +memoria.nome + " de " +memoria.capacidade + " Gb");
        System.out.println();
    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.memoria = musb;
    }
}
