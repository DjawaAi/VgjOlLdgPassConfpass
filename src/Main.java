public class Main {

    public static void main(String[] args) {
        RegisterAnAccount registerAnAccount = new RegisterAnAccount();
        try {
            registerAnAccount.checkCorrectnessOfInput("lflldf7788", "fjhjhgFFDD25343_", "fjhjhgFFDD25343_");
        } catch (WrongLoginException e) {
            System.out.println("В поле login имеется превышение или недопустимые символы");
        } catch (WrongPasswordException e) {
            System.out.println("В поле password имеется превышение или недопустимые символы, confirmPassword не совпадает с password");
        } finally {
            System.out.println("Проверка регистрационных данных завершена");
        }
    }
}