public class Animal {
    private String nome;
    private int patas;
    private double velocidade;
    private int localizacao;

    public Animal(String nome, int patas, double velocidade, int localizacao) {
        this.nome = nome;
        this.patas = patas;
        this.velocidade = velocidade;
        this.localizacao = localizacao;
    }

    public Animal(){}
    
    // Get e Set
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getPatas() {return patas;}
    public void setPatas(int patas) {this.patas = patas;}

    public double getVelocidade() {return velocidade;}
    public void setVelocidade(double velocidade) {this.velocidade = velocidade;}

    public int getLocalizacao() {return localizacao;}
    public void setLocalizacao(int localizacao) {this.localizacao = localizacao;}

    //ações
    public void mover(){
        System.out.println("Animal " + this.nome + " se movendo");
        this.localizacao++;
    }

    //to string
    @Override
    public String toString() {
        return "Animal: " + nome + " | Patas: " + patas + " | Velocidade: " + velocidade + " | Localizacao: " + localizacao;
    }

}
