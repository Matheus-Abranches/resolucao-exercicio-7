import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean matheusegay = false;
        boolean matheusehomem = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("matheus é gay ou homem?");
        String resposta = scanner.nextLine();

        if (resposta.equals("gay")){
            System.out.println(matheusegay);
        }if (resposta.equals("homem")){
            System.out.println(matheusehomem);
        }
    }
}
