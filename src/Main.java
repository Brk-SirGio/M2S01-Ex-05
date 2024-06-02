import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção para converter:");
        System.out.println("1. Comprimento");
        System.out.println("2. Peso");
        System.out.print("Digite sua opção: ");
        int categoria = scanner.nextInt();

        if (categoria == 1) {
            System.out.println("Escolha a unidade inicial:");
            System.out.println("1. Metros");
            System.out.println("2. Centímetros");
            System.out.println("3. Polegadas");
            System.out.print("Opção: ");
            int unidadeOrigem = scanner.nextInt();

            System.out.println("Converter para:");
            System.out.println("1. Metros");
            System.out.println("2. Centímetros");
            System.out.println("3. Polegadas");
            System.out.print("Opção: ");
            int unidadeDestino = scanner.nextInt();

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            double resultado = 0;

            switch (unidadeOrigem) {
                case 1: // Metros
                    switch (unidadeDestino) {
                        case 1: // Metros
                            resultado = valor;
                            break;
                        case 2: // Centímetros
                            resultado = valor * 100;
                            break;
                        case 3: // Polegadas
                            resultado = valor * 39.3701;
                            break;
                    }
                    break;
                case 2: // Centímetros
                    switch (unidadeDestino) {
                        case 1: // Metros
                            resultado = valor / 100;
                            break;
                        case 2: // Centímetros
                            resultado = valor;
                            break;
                        case 3: // Polegadas
                            resultado = valor * 0.393701;
                            break;
                    }
                    break;
                case 3: // Polegadas
                    switch (unidadeDestino) {
                        case 1: // Metros
                            resultado = valor * 0.0254;
                            break;
                        case 2: // Centímetros
                            resultado = valor * 2.54;
                            break;
                        case 3: // Polegadas
                            resultado = valor;
                            break;
                    }
                    break;
            }

            System.out.printf("Resultado da conversão: %.2f\n", resultado);

        } else if (categoria == 2) {
            System.out.println("Escolha a unidade de origem:");
            System.out.println("1. Quilogramas");
            System.out.println("2. Gramas");
            System.out.println("3. Libras");
            System.out.print("Opção: ");
            int unidadeOrigem = scanner.nextInt();

            System.out.println("Escolha a unidade de destino:");
            System.out.println("1. Quilogramas");
            System.out.println("2. Gramas");
            System.out.println("3. Libras");
            System.out.print("Opção: ");
            int unidadeDestino = scanner.nextInt();

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            double resultado = 0;

            switch (unidadeOrigem) {
                case 1: // Quilogramas
                    switch (unidadeDestino) {
                        case 1: // Quilogramas
                            resultado = valor;
                            break;
                        case 2: // Gramas
                            resultado = valor * 1000;
                            break;
                        case 3: // Libras
                            resultado = valor * 2.20462;
                            break;
                    }
                    break;
                case 2: // Gramas
                    switch (unidadeDestino) {
                        case 1: // Quilogramas
                            resultado = valor / 1000;
                            break;
                        case 2: // Gramas
                            resultado = valor;
                            break;
                        case 3: // Libras
                            resultado = valor * 0.00220462;
                            break;
                    }
                    break;
                case 3: // Libras
                    switch (unidadeDestino) {
                        case 1: // Quilogramas
                            resultado = valor * 0.453592;
                            break;
                        case 2: // Gramas
                            resultado = valor * 453.592;
                            break;
                        case 3: // Libras
                            resultado = valor;
                            break;
                    }
                    break;
            }

            System.out.printf("Resultado da conversão: %.2f\n", resultado);
        } else {
            System.out.println("Categoria inválida.");
        }

        scanner.close();
    }

    }