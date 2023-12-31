public class soal2 {
    public static void main(String[] args) {
        checkPalindrome("Angsa");
        checkPalindrome("KataK");
        checkPalindrome("kasur empuk");
        checkPalindrome("Aku Suka Kamu");
        checkPalindrome("Ibu Ratna antar ubi");
    }

    public static void checkPalindrome(String input) {
        String cleanInput = cleanAndLowercase(input);
        boolean isPalindrome = isPalindrome(cleanInput);

        if (isPalindrome) {
            System.out.println(input + ": eureeka!");
        } else {
            System.out.println(input + ": suka blyat");
        }
    }

    private static String cleanAndLowercase(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    private static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}