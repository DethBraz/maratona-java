package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.printf("isDezMaiorQueVinte "+isDezMaiorQueVinte);
    }
}
