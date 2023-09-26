import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = input.nextInt();
        System.out.print("3. Kenarı Giriniz: ");
        c = input.nextInt();

        cevre = (a + b + c) / 2;
        alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));

        System.out.println("Alan: " + alan);
    }
}