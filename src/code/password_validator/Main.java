package password_validator.password_validator;
public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("\n=== Password Validator ===");
            String username = InputService.prompt("Enter your username").trim();
            String oldPassword = InputService.prompt("Enter your old password");
            String newPassword = InputService.prompt("Enter your new password");
            UserContext context = new UserContext(username, oldPassword, newPassword);
            PasswordValidator validator = new PasswordValidator();
            validator.addRule(new LengthRule(8));
            validator.addRule(new UpperCaseRule());
            validator.addRule(new SpecialCharacterRule());
            validator.addRule(new NoUsernameRule());
            validator.addRule(new NotOldPasswordRule());
            if(validator.validate(newPassword, context)){
                System.out.println("\u2705 password successfully updated! \n");
            }else{
                System.out.println("Please try again with a stronger password. \n");
            }
            String again = InputService.prompt("Do you want to create a new account? (YES/NO)").toLowerCase();
            if(!again.contains("yes")) break;
        }
    }
}
