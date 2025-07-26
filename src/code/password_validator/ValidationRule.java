package password_validator.password_validator;
//Defines methods that must be current by any class implementing this interface logic:
//validate password
public interface ValidationRule {
    boolean validate (String password, UserContext context);
    String getErrorMessage ();
}
