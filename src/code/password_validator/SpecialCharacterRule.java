package password_validator.password_validator;

public class SpecialCharacterRule implements ValidationRule{
    private final String SPECIALS = "!@#$%^&*()_+-={}[]|:;\"'<>,.?/~`" ;
    private String errorMessage = "";

    public boolean validate(String password, UserContext context){
        for(char pass: password.toCharArray()){
            for(char sChar: SPECIALS.toCharArray()){
                if(pass == sChar){
                    return true;
                }
            }
        }
        errorMessage = "Password should contain at least one Special Character";
        return false;
    }

    public String getErrorMessage (){
        return errorMessage;
    }
}
