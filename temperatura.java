import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        

        for (int i = 0; i < 12; i++) {
              
            System.out.println("Digite a temperatura de hoje:");
            double temp = sc.nextDouble();
            if (temp < 4 || temp > 10){               
                System.out.println("Valores Invalidos!");
                return;
            }
            soma += temp;
        }
        double res = soma / 12;
        System.out.printf("A média de hoje das temperaturas é: %.1fº c", res);
        sc.close();
    }
}
