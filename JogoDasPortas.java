import java.util.Scanner;

public class JogoDasPortas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Diante de você, tem 3 portas.");
        System.out.println("Qual você escolhe para entrar?");
        System.out.println("Número 1, 2 ou 3?");

        int escolhaDoUsuario = scanner.nextInt();

        int portaComPremio = (int) (Math.random() * 3)+1;

        if (escolhaDoUsuario == portaComPremio) {
            System.out.println("Parabéns! Você ganhou o prêmio!" + portaComPremio + " tinha um prêmio.");
    } else {
        System.out.println("O prêmio estava atrás da porta" + portaComPremio + ".");
    }

    scanner.close();
    }
}