package programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Programa2 {
    public static void Quantas(String endereco) throws IOException{

        System.out.println(" ");
        BufferedReader leitor = new BufferedReader(new FileReader(endereco));
        String ven = leitor.readLine();
        String quan = leitor.readLine();
        int vende = Integer.parseInt(ven);
        int quantidade = Integer.parseInt(quan);

        double[] duracao = new double[quantidade];
        for(int i = 0; i < quantidade; ++i){
            String dur = leitor.readLine();
            int dura = Integer.parseInt(dur);
            duracao[i] = dura;
        }

        double[] vendedores = new double[vende];
        for(int i = 0; i < vende; ++i){
            vendedores[i] = 0;
        }

        double[] ligacao = new double[vende];
        for(int i = 0; i < vende; ++i){
            ligacao[i] = 0;
        }

        int soma=0;
        for(int i = 0; i < quantidade; ++i){
            soma += duracao[i];
        }

        if(vende < quantidade){
            int p=0;
            int q=0;
            int j=0;
            int b=vende-1;
            do{
                if(vendedores[p] < j && p < vende && q < quantidade){
                    vendedores[p]=duracao[q];
                    ligacao[p]+=1;
                    if(p == b){
                        p=0;
                        q+=1;
                        j++;
                    }else{
                        p+=1;
                        q+=1;
                        j+=0;
                    }
                }else if(vendedores[p] >= j && p < b && q < quantidade){
                    p+=1;
                    j+=0;
                }else if(vendedores[p] >= j && p == b && q < quantidade){
                    p=0;
                    j++;
                }else{
                    j=soma;
                }
            }while(j<soma);        
        }else{
            for(int i = 0; i < quantidade; ++i){
                if(vendedores[i]<duracao[i]){
                    vendedores[i]=duracao[i]; 
                    ligacao[i]+=1;
                }
            }
        }   
       
        System.out.println("Ligações feitas por vendedor: ");
        for(int i = 0; i < vende; ++i){
            int v = i+1;
            String ve =""+v;
            String li =""+ligacao[i];
            System.out.println(ve+" "+li);
        }
        leitor.close();
    }
}
