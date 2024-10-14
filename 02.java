/*
2. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada.
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma mensagem.
*/


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
          
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Calcular média aritmética");
            System.out.println("2: Calcular média ponderada");
            System.out.println("3: Sair do programa");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    System.out.println("Digite a primeira nota:");
                    double nota1 = scanner.nextDouble();
                    System.out.println("Digite a segunda nota:");
                    double nota2 = scanner.nextDouble();
                    
                    double mediaAritmetica = (nota1 + nota2) / 2;
                    System.out.println("A média aritmética é: " + mediaAritmetica);
                    break;

                case 2:
                  
                    System.out.println("Digite a primeira nota:");
                    nota1 = scanner.nextDouble();
                    System.out.println("Digite o peso da primeira nota:");
                    double peso1 = scanner.nextDouble();
                    
                    System.out.println("Digite a segunda nota:");
                    nota2 = scanner.nextDouble();
                    System.out.println("Digite o peso da segunda nota:");
                    double peso2 = scanner.nextDouble();
                    
                    System.out.println("Digite a terceira nota:");
                    double nota3 = scanner.nextDouble();
                    System.out.println("Digite o peso da terceira nota:");
                    double peso3 = scanner.nextDouble();

                    double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
                    System.out.println("A média ponderada é: " + mediaPonderada);
                    break;

                case 3:
                    
                    System.out.println("Saindo");
                    break;

                default:
                    
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 3);
    }
}
