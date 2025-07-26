package password_validator.password_validator;

public class UpperCaseRule implements ValidationRule{
    private String errorMessage = "";
    public boolean validate(String password, UserContext context) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        errorMessage = "Password should contain at least one uppercase letter";
        return false;
    }

    public String getErrorMessage(){
        return errorMessage;
    }
}
