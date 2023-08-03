public class Main {
    public static void main(String[] args) {
        try {
            AuthenticationValidator.checkAuthentication("login10_", "password", "password");
            System.out.println(" Аутенфикация пройдена успешно");

        } catch (WrongLoginException| WrongPasswordException ex) {
            System.out.println(ex.getMessage());

        }
    }
}