import java.util.Scanner;
class KilometerToMile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km;
        double milesPerKm = 1.6;
        System.out.print("Enter distance in kilometers: ");
        km = scanner.nextDouble();
        double miles = km / milesPerKm;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        scanner.close();
    }
}