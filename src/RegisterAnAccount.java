

public class RegisterAnAccount {
    public static void checkCorrectnessOfInput(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        CheckLengthOfReceivedCharacters checkLengthOfReceivedCharacters = new CheckLengthOfReceivedCharacters();
        CheckingContents checkingContents = new CheckingContents();


        if (checkLengthOfReceivedCharacters.checkLengthOfReceived(login)) {
            System.out.println("Вводимые данные в пределах");
            if (checkingContents.checkContent(login)) {
                System.out.println("Вводимые даннае корректны");
            } else {
                throw new WrongLoginException();
            }
        } else {
            throw new WrongLoginException();
        }

        if (checkLengthOfReceivedCharacters.checkLengthOfReceived(password)) {
            System.out.println("Вводимые данные в пределах");
            if (checkingContents.checkContent(password)) {
                System.out.println("Вводимые даннае корректны");
            } else {
                throw new WrongPasswordException();
            }
        } else {
            throw new WrongPasswordException();
        }

        if (password.equals(confirmPassword)) {
            System.out.println("Пароль подтверждён");
        } else {
           throw new  WrongPasswordException();
        }
    }
}
