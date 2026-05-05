package Unidade5;

public class Ex21 {
    public static void main(String[] args) {
    float chico = 1.5f;
    float ze = 1.1f;
    int anos = 0;
    while (chico >= ze) {
        chico += 0.02f;
        ze += 0.03f;
        anos++;
    }
    System.out.println("Anos necessários para Ze ser mais alto que Chico: " + anos);
    }
}
