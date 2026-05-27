package Unidade7;

public class Cachorro {
    String nome;
    String raça;
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro(); 
        dog1.nome = "Rex";
        dog1.raça = "Labrador";

        Cachorro dog2 = new Cachorro();
        dog2.nome = "Bella";
        dog2.raça = "Poodle";

        dog1.latir();
        dog2.latir();
    }
    public void latir() {
        System.out.println(nome + " está latindo!");
    }

}
