package password_validator.password_validator;

public class LengthRule implements ValidationRule {
    private final int minLength;
    private String errorMessage = "";

    public LengthRule (int minLength){
        this.minLength = minLength;
    }

    public boolean validate (String password, UserContext context){
        if(password == null || password.length() < minLength){
            errorMessage = "Password must be at least " + minLength + " characters.";
            return false;
        }
        return true;
    }

    public String getErrorMessage (){
        return errorMessage;
    }

}
