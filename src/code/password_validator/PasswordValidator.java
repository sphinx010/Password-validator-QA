package password_validator.password_validator;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
    private final List <ValidationRule> rules = new ArrayList<>();
    public void addRule (ValidationRule rule){
        rules.add(rule);
    }
    public boolean validate(String password, UserContext context){
        boolean isValid = true;
        for(ValidationRule rule : rules){
            if(!rule.validate(password, context)){
                System.out.println("❌" + rule.getErrorMessage());
                isValid = false;
            }
        }
        return isValid;
    }

}
