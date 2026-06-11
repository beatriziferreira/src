package Unidade7.Exemplo;

public class Turma {

    Aluno[] alunos = new Aluno[15];

    boolean[][] presenca = new boolean[15][10]; // 15 alunos e 10 aulas

    public int addAluno(int codigoMatricula, String nome) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                Aluno aluno = new Aluno();
                aluno.id = i; // Atribui um ID baseado no índice do array
                aluno.codigoMatricula = codigoMatricula;
                aluno.nome = nome;
                alunos[i] = aluno;
                return i; // Retorna o índice do aluno adicionado
            }
        }
        return -1; // Retorna -1 se a turma estiver cheia
    }

    public void marcarPresenca(int numeroAula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                presenca[i][numeroAula] = true; // Marca presença para o aluno na aula especificada
            }
        }
    }


    public void exibirDiario() {
        for (int a = 0; a < presenca.length; a++) {
            if (alunos[a] == null) {
                continue; // Pula posições vazias do array de alunos
            }
            System.out.print("Aluno " + alunos[a].nome);
            for (int p = 0; p < presenca[a].length; p++) {
                if (presenca[a][p]) {
                    System.out.print( " P");
                } else {
                    System.out.print(" F");
                    
                }
            }
            System.out.println();
        }

}}
