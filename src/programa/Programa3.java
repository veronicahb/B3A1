package programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Programa3 {
    public static void Colisao(String endereco) throws IOException{
        double[][] retangulo1 = new double[2][2];
        double[][] retangulo2 = new double[2][2];

        System.out.println(" ");

        BufferedReader leitor = new BufferedReader(new FileReader(endereco));

        for(int i = 0; i <= 1; ++i){
            for(int j = 0; j <= 1; ++j){
                String num = leitor.readLine();
                int nume = Integer.parseInt(num);
                retangulo1[i][j] = nume;
            }     
        }

        for(int a = 0; a <= 1; ++a){
            for(int b = 0; b <= 1; ++b){
                String nume = leitor.readLine();
                //String nume = l.next();
                int numer = Integer.parseInt(nume);
                retangulo2[a][b] = numer;
            }     
        }

        System.out.println(" ");
        System.out.print("Resultado: ");

        if(retangulo1[0][0]==retangulo2[0][0] || retangulo1[1][1]==retangulo2[1][1]){
            System.out.println("1");    
        }else if(retangulo1[0][0]>retangulo2[0][0]){
            if(retangulo1[0][0]-retangulo2[0][0]!=1){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else if( retangulo2[0][0]>retangulo1[0][0]){
            if(retangulo2[0][0]-retangulo1[0][0]!=1){
                
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else if(retangulo1[1][1]>retangulo2[1][1]){
            if(retangulo1[1][1]-retangulo2[1][1]!=1){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else if(retangulo2[1][1]>retangulo1[1][1]){
            if(retangulo2[1][1]-retangulo1[1][1]!=1){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else{
            System.out.println("0");
        }
        leitor.close();
    }
}
