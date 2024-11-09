import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        Integer opcao = 0; //0 = desligado ou não | 1 = ligado ou sim

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe seu nome: ");
            Aluno aluno = new Aluno(scanner.nextLine());

            System.out.println("Informe a primeira nota: ");
            aluno.registrarNota(scanner.nextDouble());

            System.out.println("Informe a segunda nota: ");
            aluno.registrarNota(scanner.nextDouble());

            System.out.println("Informe a terceira nota: ");
            aluno.registrarNota(scanner.nextDouble());

            alunos.add(aluno);

            System.out.println("Deseja sair? 0 = Não | 1 = Sim");
            opcao = scanner.nextInt();
        } while (opcao == 0);

        for (Aluno aluno : alunos){
            System.out.println(aluno.toString());
        }
    }
}