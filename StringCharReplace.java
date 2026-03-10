public class StringCharReplace {
    public static void main(String[] args) {
        String s = "BANANA";
        ;
        char[] arr = s.toCharArray();
        char x = 'A';
        char r = 'O';

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                int l = (int) r;
                l+=3; 
                char m = (char) l;
                arr[i] = m ;
            }
        }

        
        System.out.print(new String(arr));

    }
}
