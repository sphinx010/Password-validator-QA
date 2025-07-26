package password_validator.password_validator;

import java.util.Scanner;
//this class ensures that system output are rendered discretely and scanner values are captured covertly
public class InputService {
    private static final Scanner scanner = new Scanner(System.in);
    public static String prompt (String message){
        System.out.println(message + ": ");
        //used nextLine to enable full inputs are captured.
        return scanner.nextLine();
    }

    //Factory style for CLI use --Decoupling concerns
    public static UserContext
    fromUserInput(){
        String username = prompt("Enter your username");
        String oldPassword = prompt("Enter your former password");
        String newPassword = prompt("Enter your new password");

        return new UserContext(username, oldPassword, newPassword);
    }
}
