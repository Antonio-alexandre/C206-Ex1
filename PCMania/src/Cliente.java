public class Cliente {
    String nome;
    long cpf;
    Computador [] compras = new Computador[10];

    float calculaTotalCompra(){
        float ptotal = 0;
        for(int i = 0; i < compras.length; i++){
            if(compras[i] != null)
                ptotal += compras[i].preco;
        }
        return ptotal;
    }
}
