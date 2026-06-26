public class ReverseWords {
    public static char[] reverse(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return chars;
    }

    public static void display(char[] chars) {
        System.out.println();
        for (char x : chars) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) {
        String s = "India Maharashtra Pune Akurdi";

        char[] chars = s.toCharArray();
        int n = chars.length;

        chars = reverse(chars, 0, s.length() - 1);

        display(chars);

        int start = 0;
        for (int end = 0; end < n; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
        reverse(chars, start, n - 1);

        display(chars);
    }

    // String st = "kaushik joshi";
    // String[] starr = st.split(" ");

    // for(
    // int i = starr.length - 1;i>=0;i--)
    // {
    // System.out.print(starr[i] + " ");
    // }
}
