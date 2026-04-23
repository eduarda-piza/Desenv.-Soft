public class Ave extends Animal{

   public Ave(String nome, int patas, double velocidade, int localizacao){
    super(nome, patas, velocidade, localizacao);
   }

   public void mover(){
        System.out.println("Ave " + getNome() + " se movendo");
        super.setLocalizacao(getLocalizacao() + 5);
    }

} 
