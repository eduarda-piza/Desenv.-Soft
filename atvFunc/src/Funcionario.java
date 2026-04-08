import java.util.Scanner;

public class Funcionario {
    public String nomeFuncionario;
    public String departamento;
    public double salario;
    public String entradaBanco;
    public String rg;
    public boolean ativo;

    Scanner input = new Scanner(System.in);

    public void mudarStatusFunc(){
        if(this.ativo){
            System.out.println("Confirmação para desativar o funcionário: " + this.nomeFuncionario);
            this.ativo = false;
        }
        else{
            System.out.println("Confirmação para ativar o funcionário: " + this.nomeFuncionario);
           this.ativo = true;
        }
    }

    public void trocarDepartamento(){
        if (this.ativo) {
            System.out.println("Confirme para mudar o funcionário " + this.nomeFuncionario + " de departamento [S/N]: ");
            String decisao = input.nextLine();
        
            if(decisao.equals("sim") || decisao.equals("SIM") || decisao.equals("s") || decisao.equals("S")){
                System.out.println("Qual o novo departamento desse funcionário? ");
                this.departamento = input.nextLine();
            }
        }
        else{
            System.out.println("Funcionário inativo");
        }
    }

    public void bonificacao(double bonificacao){
        if(ativo){
            System.out.println("Confirmação para bonificar o funcionário " + this.nomeFuncionario + " [S/N]: ");
            String escolha = input.nextLine();
            if(escolha.equals("sim") || escolha.equals("SIM") || escolha.equals("s") || escolha.equals("S")){
                this.salario += bonificacao;
                System.out.println("Agora o funcionário: " + this.nomeFuncionario + " recebe R$" + this.salario);
            }
        }
        else{
            System.out.println("Funcionário inativo");
            
        }
    }

    public void preencherInfo(){
        System.out.println("Digite o nome do funcionário: ");
        this.nomeFuncionario = input.nextLine();

        System.out.println("Digite o departamento do funcionário: ");
        this.departamento = input.nextLine();

        System.out.println("Digite o salário incial do funcionário: ");
        this.salario = input.nextDouble();

        input.nextLine();

        System.out.println("Digite a data de entrada do funcionário: ");
        this.entradaBanco = input.nextLine();

        System.out.println("Digite o RG do funcionário: ");
        this.rg = input.nextLine();

        this.ativo = true;
    }

    public String toString(){
        return "Nome do funcionário: " + this.nomeFuncionario + " | Departamento: " + this.departamento + 
        " | Salario: R$" + this.salario + " | Data de entrada: " + this.entradaBanco + " | RG: " + this.rg + " | Ativo? " + this.ativo;
    }


}
