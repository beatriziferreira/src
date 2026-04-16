import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = scan.next();
        System.out.println("Informe a sua classe (1-Econômica | 2-Executiva | 3-Primeira Classe");
        int classe = scan.nextInt();
        
        double peso;
        String status;
        double pesoExcedido;
        double taxa;
        String mensagem;
        
        switch (classe) {
            case 1:
                System.out.println("Informe o peso da bagagem(em kg): ");
                peso = scan.nextDouble();
                if (peso >= 23) {
                    status = "Bagagem Excedente!";
                    pesoExcedido = peso - 23;
                    taxa = pesoExcedido * 15;
                    mensagem = "Diriga-se ao caixa para o pagamento antes do embarque.";
                } else {
                    status = "Dentro do limite!";
                    taxa = 0;
                    mensagem = "Boa viagem!";
                    pesoExcedido = 0;
                } 
                System.out.println("---Check-in VooBem---");
                System.out.println("Passageiro: " + nome);
                System.out.println("Classe: Econômica");
                System.out.println("Franquia: 23 kg");
                System.out.println("Peso da bagagem: " + peso + " kg");
                System.out.println("Status: " + status);
                System.out.println("Excesso: " + pesoExcedido + " kg");
                System.out.println("Taxa adicional: " + taxa + " R$");
                System.out.println(mensagem);
                break;
        
            case 2:
                System.out.println("Informe o peso da bagagem(em kg): ");
                peso = scan.nextDouble();
                if (peso >= 32) {
                    status = "Bagagem Excedente!";
                    pesoExcedido = peso - 32;
                    taxa = pesoExcedido * 10;
                    mensagem = "Diriga-se ao caixa para o pagamento antes do embarque.";
                } else {
                    status = "Dentro do limite!";
                    taxa = 0;
                    mensagem = "Boa viagem!";
                    pesoExcedido = 0;
                } 
                System.out.println("---Check-in VooBem---");
                System.out.println("Passageiro: " + nome);
                System.out.println("Classe: Executiva");
                System.out.println("Franquia: 32 kg");
                System.out.println("Peso da bagagem: " + peso + " kg");
                System.out.println("Status: " + status);
                System.out.println("Excesso: " + pesoExcedido + " kg");
                System.out.println("Taxa adicional: " + taxa + " R$");
                System.out.println(mensagem);
                break;
            
            case 3:
                System.out.println("Informe o peso da bagagem(em kg): ");
                peso = scan.nextDouble();
                if (peso >= 46) {
                    status = "Bagagem Excedente!";
                    pesoExcedido = peso - 46;
                    taxa = pesoExcedido * 7;
                    mensagem = "Diriga-se ao caixa para o pagamento antes do embarque.";
                } else {
                    status = "Dentro do limite!";
                    taxa = 0;
                    mensagem = "Boa viagem!";
                    pesoExcedido = 0;
                } 
                System.out.println("---Check-in VooBem---");
                System.out.println("Passageiro: " + nome);
                System.out.println("Classe: Primeira classe");
                System.out.println("Franquia: 46 kg");
                System.out.println("Peso da bagagem: " + peso + " kg");
                System.out.println("Status: " + status);
                System.out.println("Excesso: " + pesoExcedido + " kg");
                System.out.println("Taxa adicional: " + taxa + " R$");
                System.out.println(mensagem);
                break;
                
        } scan.close();
    }
}