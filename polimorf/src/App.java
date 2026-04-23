public class App {
    public static void main(String[] args) throws Exception {
       Animal animais[] = new Animal[10];

       Animal doguinho = new Animal("Doguinho", 3, 5.5, 0);
       animais[0] = doguinho;
       animais[0].mover(); 

       animais[1] = new Peixe("Nemo", 1, 0.2, 3, 1);
       animais[1].mover();

       animais[2] = new Ave("Pardal", 2, 10, 0);
       animais[2].mover();
    }
}
 /*
 for(Animal a : animais){
        a.mover();
       }
 */