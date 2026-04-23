public class Peixe extends Animal {
    private int agua; //1 para doce e 0 para salgada

    public Peixe(){}

    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua){
      super(nome, patas, velocidade, localizacao);
      this.agua = agua;
    }

    public int getAgua() {return agua;}
    public void setAgua(int agua) {this.agua = agua;}

    public void mover(){
        System.out.println("Peixe " + getNome() + " se movendo");
        super.setLocalizacao(getLocalizacao() + 2);
    }

}
