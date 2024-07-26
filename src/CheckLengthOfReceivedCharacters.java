public class CheckLengthOfReceivedCharacters {
    public static boolean checkLengthOfReceived(String stringOfCharacters) {
        return stringOfCharacters.length() <= 20 && stringOfCharacters != null;
    }
}
