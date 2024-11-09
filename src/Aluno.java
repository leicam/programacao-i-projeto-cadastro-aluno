import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();
    private Double[] notas2 = new Double[3];

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void registrarNota(double nota){
        this.notas.add(nota);
    }

    public double calcularMedia(){
        double total = 0.0;

        /*
        Faz exatamente o mesmo processo do for abaixo
        for (int i = 0; i < this.notas.size(); i++){
            total = total + this.notas.get(i);
        }
        */

        for (double nota : this.notas){
            //total = total + nota; esta linha faz exatamente a mesma
            //coisa que a linha abaixo
            total += nota;
        }

        return total / this.notas.size();
    }

    @Override
    public String toString() {
        return this.nome + "\n" +
                "Notas: " + this.notas.get(0) + ", " +
                this.notas.get(1) + ", " +
                this.notas.get(2) + "\n" +
                "Media: " + calcularMedia();
    }
}