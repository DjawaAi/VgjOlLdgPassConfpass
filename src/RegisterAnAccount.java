

public class RegisterAnAccount {
    public static void checkCorrectnessOfInput(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        CheckLengthOfReceivedCharacters checkLengthOfReceivedCharacters = new CheckLengthOfReceivedCharacters();
        CheckingContents checkingContents = new CheckingContents();


        if (checkLengthOfReceivedCharacters.checkLengthOfReceived(login)) {
            if (!checkingContents.checkContent(login)) {
                throw new WrongLoginException();
            }
        } else {
            throw new WrongLoginException();
        }

        if (checkLengthOfReceivedCharacters.checkLengthOfReceived(password)) {
            if (!checkingContents.checkContent(password)) {
                throw new WrongPasswordException();
            }
        } else {
            throw new WrongPasswordException();
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
