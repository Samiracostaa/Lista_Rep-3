/*1. Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em
determinado dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o
número de pessoas que estavam assistindo aquele canal. Se a televisão estivesse desligada, nada
era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
• leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
• calcule e mostre a porcentagem de audiência de cada canal.
Para encerrar a entrada de dados, digite o número do canal ZERO

*/
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int totalPessoas = 0;

        while (true) {
            System.out.print("Digite o número do canal (4, 5, 7, 12) ou 0 para encerrar: ");
            int canal = scanner.nextInt();

            if (canal == 0) {
                break; // Encerra o loop quando o usuário digitar 0
            }

            if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                System.out.print("Digite o número de pessoas assistindo: ");
                int pessoas = scanner.nextInt();
                totalPessoas += pessoas;

                switch (canal) {
                    case 4:
                        canal4 += pessoas;
                        break;
                    case 5:
                        canal5 += pessoas;
                        break;
                    case 7:
                        canal7 += pessoas;
                        break;
                    case 12:
                        canal12 += pessoas;
                        break;
                }
            } else {
                System.out.println("Canal inválido. Digite um canal válido.");
            }
        }

        if (totalPessoas > 0) {
            System.out.printf("Porcentagem de audiência do canal 4: %.2f%%\n", (canal4 * 100.0) / totalPessoas);
            System.out.printf("Porcentagem de audiência do canal 5: %.2f%%\n", (canal5 * 100.0) / totalPessoas);
            System.out.printf("Porcentagem de audiência do canal 7: %.2f%%\n", (canal7 * 100.0) / totalPessoas);
            System.out.printf("Porcentagem de audiência do canal 12: %.2f%%\n", (canal12 * 100.0) / totalPessoas);
        } else {
            System.out.println("Nenhum dado de audiência foi coletado.");
        }

        scanner.close();
    }
}
