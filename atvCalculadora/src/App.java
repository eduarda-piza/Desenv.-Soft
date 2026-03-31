import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o número 1: ");
    int n1 = input.nextInt();

    System.out.println("Digite o número 2: ");
    int n2 = input.nextInt();

    Calculadora Calculadora = new Calculadora(n1, n2);

    System.out.println(Calculadora.soma());
    System.out.println(Calculadora.subt());
    System.out.println(Calculadora.divi());
    System.out.println(Calculadora.multi());
    
    input.close();

    }
}


/*
Crie uma classe para representar uma pseudo calculadora, que possui dois
números inteiros como atributos. Nessa classe, os dois atributos devem ser
privados. Por isso, criem também os métodos que irão acessar os atributos
(getters e setters). Crie também métodos para realizar as seguintes
operações com os dois atributos: soma, subtração, divisão e mulLplicação.
Crie também uma outra classe, que possui um método principal e que
instancie um objeto da classe criada, e que realiza as operações
disponibilizadas pelo objeto.
 */