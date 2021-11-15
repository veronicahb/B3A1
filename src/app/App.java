package app;

import programa.Programa1;
import programa.Programa2;
import programa.Programa3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner l = new Scanner(System.in);
        System.out.println("--------- MENU ---------");
        System.out.println(" ");
        System.out.println("Escolha o programa:");
        System.out.println(" ");
        System.out.println("1 - Pão a Metro");
        System.out.println("2 - Telemarketing");
        System.out.println("3 - Detectando Colisões");
        System.out.println(" ");
        System.out.println("Opção: ");
        String prog = l.next();
        int programa = Integer.parseInt(prog);
        if(programa == 1){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            Programa1.Tamanho(endereco);
        }else if(programa == 2){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            Programa2.Quantas(endereco);
        }else if(programa == 3){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            Programa3.Colisao(endereco);
        }else{
            System.out.println("Número Invalido");
        }
        l.close();            
    }    
}
