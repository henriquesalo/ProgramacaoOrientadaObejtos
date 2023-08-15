package Atividade1;
public class VerificaNumeroPrimo {
    
    public static void main(String args[]){
        System.out.println( verificarNumeroPrimo(1));
        System.out.println( verificarNumeroPrimo(2));
        System.out.println( verificarNumeroPrimo(3));
    }

    /*
        A função irá me retornar:
            0 - se o número não for primo;

            1 - se o número for primo.
     */

    public static int verificarNumeroPrimo(int n) {
        if (n <= 1 ) {
            return 0;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1; 
        }
    }
}