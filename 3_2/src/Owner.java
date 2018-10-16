package lab3_2;
import java.util.Scanner;

public class Owner {
    int numberOfAkita, numberOfBulldog;
    private void setNumberA(){
        System.out.println("Количество Акита-Ину: ");
        Scanner sc = new Scanner(System.in);
        numberOfAkita = sc.nextInt();
    }
    private void setNumberB(){
        System.out.println("\nКоличество Бульдогов: ");
        Scanner sc = new Scanner(System.in);
        numberOfBulldog = sc.nextInt();
    }

    public void getDogs(){
        setNumberA();
        setNumberB();
        AkitaInu[] a = new AkitaInu[numberOfAkita];
        for(int i=0; i<numberOfAkita; i++){
            a[i] = new AkitaInu();
        }
        for(int i=0; i<numberOfAkita; i++){
            System.out.println("__________________");
            System.out.println("Акита-ину "+(i+1));
            System.out.println("__________________");
            a[i].setHeight();
            a[i].setWeight();
            a[i].setLength();
        }
        Bulldog[] b = new Bulldog[numberOfBulldog];
        for(int i=0; i<numberOfBulldog; i++){
            b[i] = new Bulldog();
        }
        for(int i=0; i<numberOfBulldog; i++){
            System.out.println("__________________");
            System.out.println("Бульдог "+(i+1));
            System.out.println("__________________");
            b[i].setHeight();
            b[i].setWeight();
            b[i].setLength();
        }

        for(int i=0; i<numberOfAkita; i++){
            System.out.println("__________________");
            System.out.println("Акита-ину "+(i+1));
            System.out.println("__________________");
            a[i].allOut();
        }
        for(int i=0; i<numberOfBulldog; i++){
            System.out.println("__________________");
            System.out.println("Бульдог "+(i+1));
            System.out.println("__________________");
            b[i].allOut();
        }
    }
}
