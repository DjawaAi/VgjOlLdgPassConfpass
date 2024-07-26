public class Main {

    public static void main(String[] args) {
        CheckLengthOfReceivedCharacters checkLengthOfReceivedCharacters = new CheckLengthOfReceivedCharacters();
        CheckingContents checkingContents = new CheckingContents();

        if (checkLengthOfReceivedCharacters.checkLengthOfReceived("asdfg67890_hnmiqwe32")) {
            checkingContents.checkContent("asdfg67890_hnmiqwe32");
        } else {
            System.out.println(0);
        }

    }
}