/*
4-Fazer um algoritmo, utilizando o comando for, que calcule e escreva a soma dos 50 primeiros
termos da seguinte série: S = 1000/1 − 997/2 + 994/3 − 991/4 +
*/
public class Main {
    public static void main(String[] args) {
        
        Serie serie = new Serie();

        double resultado = serie.calcularSomaSerie();
        System.out.println("A soma dos 50 primeiros termos da série é: " + resultado);
    }
}


class Serie {
    public double calcularSomaSerie() {
        double soma = 0.0;
        int numerador = 1000;
      
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                
                soma -= (double) numerador / i;
            } else {
               
                soma += (double) numerador / i;
            }
            numerador -= 3;
        }

        return soma; 
    }
}
