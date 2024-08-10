public class Main {

    public static void main(String[] args) {
        RegisterAnAccount registerAnAccount = new RegisterAnAccount();
        try {
            registerAnAccount.checkCorrectnessOfInput("55555555555555df7788", "fjhjhgFF25343_", "fjhjhgFF25343_");
        } catch (WrongLoginException e) {
            System.out.println("В поле login имеется превышение или недопустимые символы");
        } catch (WrongPasswordException e) {
            System.out.println("В поле password имеется превышение или недопустимые символы, confirmPassword не совпадает с password");
        } finally {
            System.out.println("Проверка регистрационных данных завершена");
        }
    }
}