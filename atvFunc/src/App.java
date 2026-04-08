import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Funcionario Funcionario = new Funcionario();

        int opcao;
        double bonificacao;
       
        do {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Preencher informações do funcionário");
            System.out.println("2 - Ver informações do funcionário");
            System.out.println("3 - Bonificar funcionário");
            System.out.println("4 - Trocar de departamento");
            System.out.println("5 - Ativar ou desativar funcionário");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    Funcionario.preencherInfo();
                    break;

                case 2:
                    System.out.println(Funcionario.toString());
                    break;

                case 3:
                    System.out.println("Qual valor será a bonificação? ");
                    bonificacao = input.nextDouble();
                    Funcionario.bonificacao(bonificacao);
                    break;

                case 4:
                    Funcionario.trocarDepartamento();
                    break;

                case 5:
                    Funcionario.mudarStatusFunc();
                    break;

                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }

        }

        while (opcao != 6);

        input.close();

    }

}

/*
Modele um funcionário. Ele deve ter o nome do funcionário, o departamento
onde trabalha, seu salário (double), a data de entrada no banco (String), seu
RG (String) e um valor booleano que indique se o funcionário está na
empresa no momento ou se já foi embora.
Você deve criar alguns métodos de acordo com sua necessidade.
Além deles, crie um método bonifica que aumenta o salário do funcionário
de acordo com o parâmetro passado como argumento. Crie, também, um
método demite , que não recebe parâmetro algum, só modifica o valor
booleano indicando que o funcionário não trabalha mais aqui.
 */