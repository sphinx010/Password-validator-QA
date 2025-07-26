package password_validator.password_validator;

public class NotOldPasswordRule implements ValidationRule {
    private String errorMessage = "";

    public boolean validate(String password, UserContext context){
        password = context.getNewPassword();
        if(!password.equals(context.getOldPassword())){
            return true;
        }
        errorMessage = "Password must not be the same as Old password";
        return false;
    }

    public String getErrorMessage (){
        return errorMessage;
    }

}
