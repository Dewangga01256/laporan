import java.util.Scanner;

public class SPL2Variabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukkan koefisien dari sistem persamaan
        System.out.println("Masukkan koefisien untuk persamaan pertama (a1x + b1y = c1):");
        System.out.print("a1: ");
        double a1 = input.nextDouble();
        System.out.print("b1: ");
        double b1 = input.nextDouble();
        System.out.print("c1: ");
        double c1 = input.nextDouble();
        
        System.out.println("Masukkan koefisien untuk persamaan kedua (a2x + b2y = c2):");
        System.out.print("a2: ");
        double a2 = input.nextDouble();
        System.out.print("b2: ");
        double b2 = input.nextDouble();
        System.out.print("c2: ");
        double c2 = input.nextDouble();
        
        // Menghitung determinan
        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;
        
        // Menentukan solusi
        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Sistem memiliki solusi tak terhingga (konsisten dan dependen). ");
            } else {
                System.out.println("Sistem tidak memiliki solusi (inkonsisten). ");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("Solusi sistem adalah: x = " + x + ", y = " + y);
        }
        
        input.close();
    }
}
