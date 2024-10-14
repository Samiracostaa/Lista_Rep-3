/*
3. Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
• a média das idades das dez pessoas;
• o total que possui superior a 90 kg e altura inferior a 1,50 metro;
• a porcentagem de pessoas com idade entre 10 e 30 anos entre aquelas que medem mais de
1,90 m.
• uma opção para apresentar todos os dados coletados;

*/
import java.util.Scanner;

public class MAIN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int[] idades = new int[10];
        double[] pesos = new double[10];
        double[] alturas = new double[10];

        int totalPesoAcima90AlturaMenor150 = 0;
        int totalIdadeEntre10e30AlturaMaior190 = 0;
        double somaIdades = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idades[i] = scanner.nextInt();

            System.out.println("Digite o peso (em kg) da pessoa " + (i + 1) + ":");
            pesos[i] = scanner.nextDouble();

            System.out.println("Digite a altura (em metros) da pessoa " + (i + 1) + ":");
            alturas[i] = scanner.nextDouble();

            somaIdades += idades[i];

            if (pesos[i] > 90 && alturas[i] < 1.50) {
                totalPesoAcima90AlturaMenor150++;
            }

            if (idades[i] >= 10 && idades[i] <= 30 && alturas[i] > 1.90) {
                totalIdadeEntre10e30AlturaMaior190++;
            }
        }

   
        double mediaIdades = somaIdades / 10;

        double porcentagemIdadeEntre10e30AlturaMaior190 = (totalIdadeEntre10e30AlturaMaior190 / 10.0) * 100;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Total de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + totalPesoAcima90AlturaMenor150);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos e altura superior a 1,90 m: " + porcentagemIdadeEntre10e30AlturaMaior190 + "%");

        System.out.println("Deseja ver todos os dados coletados? (S/N)");
        char opcao = scanner.next().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Dados coletados:");
            for (int i = 0; i < 10; i++) {
                System.out.println("Pessoa " + (i + 1) + ": Idade: " + idades[i] + ", Peso: " + pesos[i] + " kg, Altura: " + alturas[i] + " m");
            }
        }

        scanner.close();
    }
}
