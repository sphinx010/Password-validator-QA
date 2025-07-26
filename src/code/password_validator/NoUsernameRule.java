package password_validator.password_validator;

public class NoUsernameRule implements ValidationRule{
    private String errorMessage = "";

    public boolean validate (String password, UserContext context){
        if(!password.contains(context.getUsername())){
            return true;
        }
        errorMessage = "Password should not contain username";
        return false;
    }

    public String getErrorMessage (){
        return errorMessage;
    }
}
