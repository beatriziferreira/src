package Unidade7.AppDelivery;

public class AppDelivery {
    public static void main(String[] args) {
        // Criando um pedido
        Pedido pedido1 = new Pedido("João", "Pizza", 29.90);
        Pedido pedido2 = new Pedido("Maria", "Hambúrguer", 19.90);
        
        pedido1.entregar();

        pedido1.exibirDetalhes();
        pedido2.exibirDetalhes();
           
    }
}
