
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA JAVA ===");

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble(')';

        System.out.print("Digite o operador (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Não pode dividir por zero!");
                    sc.close();
                    return;
                }
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operador inválido!");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
