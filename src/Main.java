import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de planète : ");
        byte nb_planete = sc.nextByte();
        System.out.println("Vous avez choisi un nombre de " + nb_planete + " planètes.");

        switch (nb_planete) {

            case 7:
                System.out.println("C'est entre 1600 et 1700 que l'on dénombrait 7 planètes.");
                break;

            case 8:
                System.out.println("Depuis Août 2006, on dénombre 8 planètes.");
                System.out.println("Cependant on en dénombrait autant entre 1700 et 1800.");
                break;

            case 9:
                System.out.println("On denombrait 9 planètes entre 1800 et 2006");
                break;

            default:

                System.out.println("Le programme ne permet pas de savoir l'année pour le nombre de planète choisi :( .");
        }
    }
}