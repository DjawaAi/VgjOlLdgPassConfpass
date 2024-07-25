public class CheckingContents {
    public boolean checkСontent(String f) {
        boolean a = false;
        int s = 0;
        int b = 0;
        String validCharacters = "abcdefjghiklmnopqrstvxyz_ABCDEFJGHIKLMNOPQRSTVXYZ1234567890";
        for (int z = 0; z < f.length(); z++) {
            for (int i = 0; i < validCharacters.length(); i++) {
                if (validCharacters.charAt(i) == f.charAt(z)) {
                    a = true;
                    s++;
                    System.out.println(i + "true " + z);
                    break;
                } else {
                    a = false;
                    b++;
                    System.out.println(z + " " + i);
                }
            }
        }
        if (s == f.length()) {
            System.out.println("Пароль вверен" +s+ " " +f.length());
        } else {
            System.out.println("Недопустимый символ" +s+ " " +f.length());
        }
        return s == 20;
    }
}
