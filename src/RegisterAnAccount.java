import WrongLoginException.WrongLoginException;

public class RegisterAnAccount {
    public static void checkCorrectnessOfInput(String login, String password,String confirmPassword) {
        CheckLengthOfReceivedCharacters checkLengthOfReceivedCharacters = new CheckLengthOfReceivedCharacters();
        CheckingContents checkingContents = new CheckingContents();


        if (checkLengthOfReceivedCharacters.checkLengthOfReceived(login)) {
            System.out.println("Вводимые данные в пределах");
            if (checkingContents.checkContent(login)){
                System.out.println("Вводимые даннае корректны");
            } else { throw new WrongLoginException();}
        }
    }
}
