public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        int lossLives = 2;
        lives -= lossLives; //3
        lives --; //operador decremente //2
        lives++; //operador incremento //3

        //prefija y postfijo
        int gift = 100 + lives++; //postfijo: se accede al dato anterior de la variable
        System.out.println("Lives: " + lives);
        System.out.println("Gift: " +gift);
        int gitPrefijo = 100 + ++lives; //prefijo;
        System.out.println(gitPrefijo);
    }
}
