package Unidade7.Exemplo;

public class EscolaMain {
    public static void main(String[] args) {
        Turma[] turmas = new Turma[10];
        Turma turma1 = new Turma();
        turmas[0] = turma1;
        turma1.addAluno(123, "João");
        turma1.addAluno(456, "Maria");
        turma1.addAluno(789, "Pedro");
        turma1.marcarPresenca(0); // Marca presença para a primeira aula
        

        Turma turma2 = new Turma();
        turmas[1] = turma2;
        turma2.addAluno(101, "Ana");
        turma2.addAluno(202, "Carlos");
        turma2.addAluno(303, "Daniela");
        turma2.marcarPresenca(0); // Marca presença para a primeira aula

        // Exibe o diário de presença da turma 1
        System.out.println("Diário de Presença - Turma 1:");
        turma1.exibirDiario();

        // Exibe o diário de presença da turma 2
        System.out.println(" ");
        System.out.println("Diário de Presença - Turma 2:");
        turma2.exibirDiario();

    }
}
