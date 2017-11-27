import java.util.Scanner;
public class main {

    public static void main(String[] args){
        String wzor="exit";
        System.out.println("Witaj Świecie!");
        System.out.println("Aby zamknąć aplikację, trzeba wpisać exit i nacisnąć klawisz enter");
        Scanner zamknij = new Scanner(System.in);
        String wpisano = zamknij.nextLine().toString();

        System.out.println(wpisano);
        if(!wpisano.equals(wzor)){

            while(!wpisano.equals(wzor)) {
                System.out.println("Aby zamknąć aplikację, trzeba wpisać exit i nacisnąć klawisz enter");
                wpisano = zamknij.nextLine();
                System.out.println(wpisano);
            }

            System.exit(0);

        }else{

            System.exit(0);
        }


    }
}
