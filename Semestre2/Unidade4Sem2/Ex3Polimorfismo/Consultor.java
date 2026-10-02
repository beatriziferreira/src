package Semestre2.Unidade4Sem2.Ex3Polimorfismo;

public class Consultor extends Funcionario {

    private int viagens;

    public int getViagens() {
        return viagens;
    }

    public void setViagens(int viagens) {
        this.viagens = viagens;
    }

    @Override 
    public double calcularSalario() {
        return getSalario() + (getViagens() * 100);
    }

    

}
