import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws InterruptedException {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Esse e o trabalho 1 da disciplina de PEOO da turma 2019.2 da UECE sobre tratamento de excecoes.");

        int opcao;
        boolean rodar = true;

        while(rodar) {
            System.out.println("Para visualizar o exemplo com apenas um robo movimentando-se com o auxilio do usuario, digite 1.");
            System.out.println("Para visualizar o exemplo com dois robos movimentando-se randomicamente digite 2.");
            System.out.println("Para visualizar o exemplo com um robo normal e um robo inteligente movendo-se randomicamente digite 3.");
            System.out.println("Para parar a execucao do programa digite 4.");

            opcao = ler.nextInt();

            if(opcao == 1){
                Exemplo1 e1 = new Exemplo1();
                e1.rodarExemplo();
            }
            else if(opcao == 2) {
                Exemplo2 e2 = new Exemplo2();
                e2.rodarExemplo();
            }
            else if(opcao == 3){
                Exemplo3 e3 = new Exemplo3();
                e3.rodarExemplo();
            }
            else if(opcao == 4)
                rodar = false;

            System.out.println("");
        }

        ler.close();

    }
}