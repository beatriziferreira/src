package Semestre2.Unidade4Sem2.Ex3Polimorfismo;

public class ArquitetoSoftware extends Programador {

    @Override 
    public double calcularSalario() {
        double salario = super.calcularSalario();
        double comissao = getSalario() * (getLinguagens().size() * 2);
        return  salario + comissao;
    }
}
