package Unidade5;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        String nome;
        int idade;
        int acimaDe20 = 0;
        String nomes18 = "";

        System.out.print("Digite a quantidade de alunos: ");
        n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine(); 

            if (idade == 18) {
                if (nomes18.isEmpty()) {
                    nomes18 = nome;
                } else {
                    nomes18 += " e " + nome;
                }
            }

            if (idade >= 20) {
                acimaDe20++;
            }
        }

        System.out.println("\nNomes dos alunos que têm 18 anos: " + nomes18);
        System.out.println("Quantidade de alunos com idade acima de 20 anos: " + acimaDe20);

        sc.close();
    }
}
    

