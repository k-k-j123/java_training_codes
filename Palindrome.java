public class Palindrome {

    public static void main(String args[]){
        
        String str = "A man a plan a canal Panama";
        String clean = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        boolean flag = true;
        int i =0;
        int j = clean.length()-1;
        while(i<j){
            if(clean.charAt(i)!= clean.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        
    }
}
