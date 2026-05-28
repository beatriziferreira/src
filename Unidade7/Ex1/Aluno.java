package Unidade7.Ex1;
public class Aluno {
    String nome;
    double nota;
    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void situacao() {
        if (nota >= 7.0) {
            System.out.println(nome + " está aprovado(a) com nota " + nota);
        } else if (nota >= 4.0 && nota < 7.0) {
            System.out.println(nome + " está em recuperação com nota " + nota);
        } else {
            System.out.println(nome + " está reprovado(a) com nota " + nota);
        }
    }
}
