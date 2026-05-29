package Unidade7.Ex2;

public class Pedido {
    String nomeItem;
    int quantidade;
    double precoUnitario;

    public Pedido(String nomeItem, int quantidade, double precoUnitario) {
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;

    }

    public double calcularTotal (int quantidade , double precoUnitario){
        return (quantidade * precoUnitario);
    }
}