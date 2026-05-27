package Unidade7.AppDelivery;

public class Pedido {
    String cliente;
    String produto;
    Double valor;
    Boolean entregue;

    // Construtor para inicializar os atributos do pedido
    public Pedido(String cliente, String produto, Double valor) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.entregue = false;
    }

    public boolean entregar() {
        // Atualiza o status do pedido para entregue
        entregue = true;
        // Retorna o status de entrega
        return entregue;
    }

    void exibirDetalhes() {
        // Exibe os detalhes do pedido
        if (entregue){
            System.out.println("Pedido para " + cliente + ": " + produto + " - R$" + valor + " (Entregue)");
        } else {
            System.out.println("Pedido para " + cliente + ": " + produto + " - R$" + valor + " (Pendente)");
        }
    }
    
        
}
