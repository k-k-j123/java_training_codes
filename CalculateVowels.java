public class CalculateVowels {
    public static void main(String[] args) {
        String s = "Hello World";
        int vowels = 0;

        for (int i = 0; i < s.length(); i++) {
            // if (s.charAt(i) == 'A' || s.charAt(i) == 'a' ||
            // s.charAt(i) == 'E' || s.charAt(i) == 'e' ||
            // s.charAt(i) == 'I' || s.charAt(i) == 'i' ||
            // s.charAt(i) == 'O' || s.charAt(i) == 'o' ||
            // s.charAt(i) == 'U' || s.charAt(i) == 'u') {
            // vowels++;
            // }
            switch (Character.toLowerCase(s.charAt(i))) {
                case 'a':
                    vowels++;
                    break;

                case 'e':
                    vowels++;
                    break;

                case 'i':
                    vowels++;
                    break;

                case 'o':
                    vowels++;
                    break;

                case 'u':
                    vowels++;
                    break;

                default:
                    break;

            }
        }

        System.out.println("Vowels : " + vowels );
    }
}
