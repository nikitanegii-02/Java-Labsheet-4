import java.util.Scanner;
public class Q18ElectricBill {
    double units;
    static double fixedCharge = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q18ElectricBill e = new Q18ElectricBill();
        System.out.println("Enter electricity units:");
        double u = sc.nextDouble();
        e.units = u;
        double energyCharge;
        if (e.units <= 100) {
            energyCharge = e.units * 5;
        } else if (e.units <= 200) {
            energyCharge = e.units * 7;
        } else {
            energyCharge = e.units * 10;
        }
        double totalBill = energyCharge + fixedCharge;

        System.out.println("\nElectricity Bill:");
        System.out.println("Units: " + e.units);
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);

        sc.close();
    }
}