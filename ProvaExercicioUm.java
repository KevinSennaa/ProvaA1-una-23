import java.util.Scanner;

public class ProvaExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para calcular a estimativa do Km/h por consumo de combustiível.");

        System.out.print("Informe a placa do veículo: ");
        String placa = scanner.nextLine();

        System.out.print("Informe o valor do litro do combustível: R$ ");
        double valorLitro = scanner.nextDouble();

        System.out.print("Informe a quantidade de quilômetros rodados a 60 km/h: ");
        double km60 = scanner.nextDouble();

        System.out.print("Informe a quantidade de quilômetros rodados a 80 km/h: ");
        double km80 = scanner.nextDouble();

        System.out.print("Informe a quantidade de quilômetros rodados a 100 km/h: ");
        double km100 = scanner.nextDouble();

        System.out.print("Informe a quantidade de quilômetros rodados a 120 km/h: ");
        double km120 = scanner.nextDouble();

        System.out.print("Informe a quantidade de quilômetros rodados a 140 km/h: ");
        double km140 = scanner.nextDouble();

        double totalKm = km60 + km80 + km100 + km120 + km140;
        double litros60 = km60 / 30.7;
        double litros80 = km80 / 26.8;
        double litros100 = km100 / 22.4;
        double litros120 = km120 / 18.1;
        double litros140 = km140 / 14.1;
        double totalLitros = litros60 + litros80 + litros100 + litros120 + litros140;
        double velocidadeMediaPonderada = (60 * km60 + 80 * km80 + 100 * km100 + 120 * km120 + 140 * km140) / totalKm;
        double custoTotal = totalLitros * valorLitro;

        System.out.println("Estimativa do consumo da viagem feita é:");
        
        System.out.println("Placa do veículo: " + placa);
        System.out.printf("Custo total da viagem: R$ %.2f\n", custoTotal);
        System.out.printf("Velocidade média ponderada da viagem: %.2f km/h\n", velocidadeMediaPonderada);
        System.out.printf("Quantidade total de combustível utilizada: %.2f litros\n", totalLitros);

        scanner.close();
    }
}