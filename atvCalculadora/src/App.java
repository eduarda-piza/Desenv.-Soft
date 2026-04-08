import java.util.Scanner;

public class App {
        
    public static void main(String[] args) throws Exception {
     Scanner input = new Scanner(System.in);
     int opcao;

        do{
        System.out.println("Digite o número 1: ");
        int num1 = input.nextInt();
        System.out.println("Digite o número 2: ");
        int num2 = input.nextInt();

        Calculadora Calculadora = new Calculadora(num1, num2);

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(Calculadora.soma());
                break;
            case 2:
                    System.out.println(Calculadora.subtracao());
                    break;
            case 3:
                    System.out.println(Calculadora.multiplicacao());
                    break;
            case 4:
                    System.out.println(Calculadora.divisao());
                    break;
            default:
                    System.out.println("Opção Inválida");
                break;
        }

    }while (opcao != 5);

        input.close();
    }
}
