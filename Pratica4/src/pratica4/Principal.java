/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica4;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author gabal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exercícío 1\n");
        Scanner ler = new Scanner(System.in);
        
        int n=10;
        int vetor[] = new int[n];
        int i;
        
        for (i=0;i<n;i++){
            System.out.println(String.format("\nInsira o valor %s de %s: ",  (i+1),n));
            vetor[i] = ler.nextInt();
            System.out.println(vetor[i]);
        }
        
        System.out.println("\nExercícío 2\n");
        
        int m=10;
        int vetor2[] = new int[m];
        int j;
        
        for (j=0;j<m;j++){
            System.out.println(String.format("\nInsira o valor %s de %s: ",  (j+1),m));
            vetor2[j] = ler.nextInt();
            if (vetor2[j]>=20){
                System.out.println("Valor inserido maior ou igual a 20. Vetor igual a: ");
                System.out.println(vetor2[j]);
            }
        }
        
        System.out.println("\nExercícío 3\n");
            
        int o=10;
        int vetor3[] = new int[o];
        int k;
        int quant=0;
        int soma = 0;
        int maior = 0;
        
        for (k=0;k<o;k++){
           System.out.println(String.format("\nInsira o valor %s de %s: ",  (k+1),o));
           int valor = ler.nextInt();
           if (valor %2==0){
               vetor3[k] = valor;
               System.out.println("Valor par armazenado");
               quant++;
               soma += valor;
               if(valor>maior){
                   maior = valor;
               }
           }
        }
        System.out.println("Quantidade de pares armazenados: " +quant);
        System.out.println("Maior: " +maior);
        System.out.println("Média: " + (soma/quant));     
        
        System.out.println("\nExercícío 4\n");
        
        System.out.println("Digite a quantidade de números a serem digitados: ");
        int quant4 = ler.nextInt();
        int l;
        int vetor4[] = new int[quant4];
        
        for(l=0; l<quant4; l++){
            System.out.println(String.format("\nInsira o valor %s de %s: ",  (l+1),quant4));
            vetor4[l] = ler.nextInt();
        }
        
        System.out.println("Sequência na ordem inversa: ");
        for(l=quant4; l>0; l--){
            System.out.print(vetor4[l-1]);
        }
        
        System.out.println("\nExercícío 5\n");
        
        int b;
        int a=8;
        int vetor5[] = new int[a];
        
        for(b=4;b<a; b++){
            System.out.println("Digite um número: ");
            vetor5[b] = ler.nextInt();
        }
        for(b=0; b<4; b++){
            System.out.println("Digite um número: ");
            vetor5[b] = ler.nextInt();
        }
        for(b=0; b<a; b++){
            System.out.print(vetor5[b]);
        }
        
        System.out.println("\nExercícío 6\n");
        
        int vetor6[] = {2,5,4,54,43,22,5,9,30,15};
        int num;
        
        System.out.println("Valor a ser encontrado: ");
        num = ler.nextInt();
                
        for(a=0; a<10;a++){
            if(num==vetor6[a]){
                System.out.printf("O número foi encontrado na posição [%s] do vetor", a);
                break;
            }
        }
        
        System.out.println("\nExercícío 7\n");
        
        int vetorA[] = {1,2,4,6,21};
        int vetorB[] = {2,3,6,7,9,11,15,20};
        ArrayList valores = new ArrayList();
        
        for(a=0; a<5; a++){
            for(b=0;b<8;b++){
                if(vetorA[a]==vetorB[b]){
                    valores.add(vetorA[a]);
                }
            }
        }
        System.out.println(valores);
        
        System.out.println("\nExercícío 8\n");
        
        int vetorM[] = {1,2,3,4,5,6,7,8,9,10};
        int vetorN[] = {1,1,1,1,1,1,1,1,1,1};
        int produtoEscalar = 0;
        
        for(a=0; a<10; a++){
            produtoEscalar += vetorM[a]*vetorN[a];
        }
        System.out.println("O produto escalar de M por N é: " +produtoEscalar);
    }
        
        
        
}

