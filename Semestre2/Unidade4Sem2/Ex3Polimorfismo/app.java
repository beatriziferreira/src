package Semestre2.Unidade4Sem2.Ex3Polimorfismo;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios  = new ArrayList<>();

        Funcionario g = new Gerente();
        Funcionario as = new ArquitetoSoftware();
        Funcionario c = new Consultor();
        Funcionario v = new Vendedor();

        funcionarios.add(g);
        g.setSalario(5000);
        funcionarios.add(as);
        as.setSalario(4000);
        funcionarios.add(c);
        c.setSalario(3500);
        funcionarios.add(v);

        v.setSalario(2500);

        for (Funcionario func : funcionarios) {
            System.out.println(func.calcularSalario());
        }
    }
}
