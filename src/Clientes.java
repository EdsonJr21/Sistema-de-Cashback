public class Clientes {
    String nome;
    double saldoCashBack;

    public Clientes(String nome, double saldoCashBack) {
        this.nome = nome;
        this.saldoCashBack = saldoCashBack;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoCashBack() {
        return saldoCashBack;
    }

    public void setSaldoCashBack(double saldoCashBack) {
        this.saldoCashBack = saldoCashBack;
    }
}
