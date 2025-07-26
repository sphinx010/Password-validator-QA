package password_validator.password_validator;

public class UserContext {
    // although the rule requires that you initialize when using the final modifier, but it can be done in retrospect
    private final String username;
    private final String oldPassword;
    private final String newPassword;

    //class constructor for instantiation
    public UserContext (String username, String oldPassword, String newPassword){
        this.username = username;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    // getter methods
    public  String getUsername (){
        return username;
    }
    public  String getOldPassword (){
        return oldPassword;
    }
    public String getNewPassword (){
        return newPassword;
    }
}

