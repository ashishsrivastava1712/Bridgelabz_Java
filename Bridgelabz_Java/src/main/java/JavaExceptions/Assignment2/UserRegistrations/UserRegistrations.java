/*
 * Question: Implementation and demonstration of User Registrations
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for User Registrations.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaExceptions.Assignment2.UserRegistrations;



import java.util.HashSet;
import java.util.Set;

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

class UserService {
    private Set<String> users = new HashSet<>();

    public void registerUser(String username)
            throws UserAlreadyExistsException {

        if (users.contains(username)) {
            throw new UserAlreadyExistsException(
                "User already exists: " + username
            );
        }

        users.add(username);
        System.out.println("User registered: " + username);
    }

    public void checkUserExistence(String username)
            throws UserNotFoundException {

        if (!users.contains(username)) {
            throw new UserNotFoundException(
                "User not found: " + username
            );
        }

        System.out.println("User exists: " + username);
    }
}

public class UserRegistrations {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        UserService service = new UserService();

        try {
            service.registerUser("Ashish");
            service.registerUser("Ashish");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.checkUserExistence("Rahul");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
