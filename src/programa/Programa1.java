package programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Programa1 {

    public static void Tamanho(String endereco) throws IOException{
        System.out.println(" ");
        int maximo=0;

        BufferedReader leitor = new BufferedReader(new FileReader(endereco));
        String pes = leitor.readLine();
        String san = leitor.readLine();
        int pessoas = Integer.parseInt(pes);
        int sanduiches = Integer.parseInt(san);
    
        double[] tamanho = new double[sanduiches];
        for(int i = 0; i < sanduiches; ++i){
            String tam = leitor.readLine();
            int tama = Integer.parseInt(tam);
            tamanho[i] = tama;
        }
        
        int n = 0;
        for(int i = 0; i < sanduiches; i++){
            n += tamanho[i];
        }
        
        int media = n/sanduiches;
        int soma=0;
        int j=media;
        do{
            for(int i=0; i<sanduiches; i++){
                soma += tamanho[i] / j;
            }
            if(soma==pessoas){
                maximo=j;
                j=media+1;
            }else{
                soma=0;
                j-=1;
            }
        }while(j<=media);
        String m = ""+maximo;
        System.out.println("Maximo tamanho possivel para os pedaços: "+m);
        leitor.close();
    }    
}
