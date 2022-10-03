import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado:");
        int lado = entrada.nextInt();
        int area = lado * lado;
        int dobro = area * 2;
        System.out.println("Area do quadrado eh igual a: " + area);
        System.out.println("O dobro da area do quadrado eh igual a: "+ dobro);

    }
}
