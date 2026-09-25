/*
 * Create a program to generate 10 random 6-digit OTPs and check
 * whether all generated OTPs are unique.
 *
 * Hint =>
 * 1. Write a method to generate a random 6-digit OTP.
 * 2. Create an integer array to store 10 OTPs.
 * 3. Generate 10 OTPs and store them in the array.
 * 4. Write a method to check whether all generated OTPs are unique.
 * 5. Finally display all generated OTPs and the uniqueness result.
 *
 * Author: Ashish Srivastava
 */




package JavaMethods.Level3;

public class OTPGenerator {

    // Generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otpNumbers) {

        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {

                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Create array to store 10 OTPs
        int[] otpNumbers = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");

        for (int otp : otpNumbers) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areOTPsUnique(otpNumbers);

        System.out.println("\nAre all OTPs unique? " + unique);
    }
}