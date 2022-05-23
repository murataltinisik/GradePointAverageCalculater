import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// VARIABLES
        int math, physics, chemical, turkish, history, music;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Matematik Not: ");
        math = sc.nextInt();

        System.out.print("Fizik Not: ");
        physics = sc.nextInt();

        System.out.print("Kimya Not: ");
        chemical = sc.nextInt();

        System.out.print("Türkçe Not: ");
        turkish = sc.nextInt();

        System.out.print("Tarih Not: ");
        history = sc.nextInt();

        System.out.print("Müzik Not: ");
        music = sc.nextInt();

        int totalNote = math + physics + chemical + turkish + history + music;
        double average = totalNote / 6;
        String message =  average > 60 ? "Sınıfı geçti, Ortalamanız: " + average : "Sınıfta kaldı! Ortalamanız: " + average;

        System.out.println(message);
    }
}
