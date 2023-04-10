import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        float nota1, nota2, nota3, nota4, media; 
        // Entrada de Dados 
        System.out.println("Informe a primeira nota: ");
        Scanner teclado = new Scanner(System.in); 
        nota1 = teclado.nextFloat(); 

        System.out.println("Informe a segunda nota: ");
        nota2 = teclado.nextFloat(); 

        System.out.println("Informe a terceira nota ");
        nota3 = teclado.nextFloat(); 

        System.out.println("Informe a quarta nota ");
        nota4 = teclado.nextFloat();
        // Resolução do Problema 
        media = (nota1 + nota2 + nota3 + nota4) / 4; 
        // Saída de Dados 
        System.out.println("A sua média final é: " + media);
    }
}
