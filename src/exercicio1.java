import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
// primeiro e condicao inicial, segundo e o que vai ser feito e o terceiro e o incremento
// for e uma estrutura de repeticao com cenario definido
// o if entra como uma condicao para a repeticao voltar
        for (int i=1; i<=x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
