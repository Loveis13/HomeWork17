import java.util.regex.Pattern;

public class AuthenticationValidator {
    private static Pattern regex = Pattern.compile("[A-Za-z0-9_]{0,20}");

    public static void checkAuthentication(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        checkLogin(login);
        checkPassword(password);
        checkEqualsPassword(password,confirmPassword);

    }

    private static void checkLogin(String login) {
        if (!login.matches(regex.pattern())) {
            throw new WrongLoginException(" Логин должен содержать в себе только латинские буквы," +
                    " и знак подчеркивания. " +
                    " и должен быть не более 20 символов ");

        }
    }

    private static void checkPassword(String password) throws WrongPasswordException {
        if (!password.matches(regex.pattern())) {
            throw new WrongPasswordException(" Пароль должен содержать в себе только латинские буквы," +
                    " и знак подчеркивания. " +
                    " и должен быть не более 20 символов ");
        }
    }
    private static void checkEqualsPassword(String password,String confirmPassword)throws WrongPasswordException{
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException(" Пароль и повторный пароль должен " + " совподать ! ");
            }
        }
}
