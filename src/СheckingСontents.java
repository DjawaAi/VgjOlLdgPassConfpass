public class СheckingСontents {
    public boolean checkСontent(String f) {
        boolean a = false;
        String validCharacters = "abcdefghiklmnopqrstvxyz_ ABCDEFGHIKLMNOPQRSTVXYZ1234567890";
        for (int z = 0; z < f.length(); z++) {
            for (int i = 0; i < validCharacters.length(); i++) {
                if (validCharacters.charAt(i) == f.charAt(z)) {
                    a = true;
                    break;
                } else {
                    a = false;
                }
            }
        }
        return a;
    }
}
