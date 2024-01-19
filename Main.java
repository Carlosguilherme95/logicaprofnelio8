import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Valor de A:");
        Float a = Float.valueOf(scanner.nextLine());
        System.out.println("Digite o valor de B:");
        Float b = Float.valueOf(scanner.nextLine());
        System.out.println("Digite o valor de C:");
        Float c = Float.valueOf(scanner.nextLine());
        areaQudrado(a);
        areaTriangRetang(a,b);
        areaTrapezio(a,b,c);
    }

    private static void areaTrapezio(Float a, Float b, Float c) {
        double calculando = (((a + b) * c) / 2);
        String resultado = String.format("%.4f", calculando);
        System.out.println("AREA DO TRAPEZIO "+resultado);
    }

    private static void areaTriangRetang(Float a, Float b) {
        double calculando = ((a * b) / 2);
        String resultado = String.format("%.4f", calculando);
        System.out.println("AREA DO TRIANGULO "+resultado);
    }

    private static void areaQudrado(Float a) {
        double calculando = (Math.pow(a, 2));
        String resultado = String.format("%.4f", calculando);
        System.out.println("AREA DO QUADRADO "+resultado);
    }
}

/**
 * Problema "medidas"
 * Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
 * com quatro casas decimais):
 * a) a área do quadrado que tem lado A
 * b) a área do triângulo retângulo que base A e altura B
 * c) a área do trapézio que tem bases A e B, e altura C
 * Exemplo 1:
 * Digite a medida A: 4.0
 * Digite a medida B: 3.5
 * Digite a medida C: 5.2
 * AREA DO QUADRADO = 16.0000
 * AREA DO TRIANGULO = 7.0000
 * AREA DO TRAPEZIO = 19.5000
 * Exemplo 2:
 * Digite a medida A: 7.13
 * Digite a medida B: 8.05
 * Digite a medida C: 11.912
 * AREA DO QUADRADO = 50.8369
 * AREA DO TRIANGULO = 28.6983
 * AREA DO TRAPEZIO = 90.4121
 */