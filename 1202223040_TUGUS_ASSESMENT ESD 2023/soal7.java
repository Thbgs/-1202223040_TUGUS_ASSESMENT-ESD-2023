public class soal7 {
    public static void main(String[] args) {
        String encryptedChat = "xfqfr bfmdz\ngjxtp lzj rfz ifkyfw jxi snm\ngwt, gjxtp qz rfz rfpfs in bfwlty lfp?\nfpz xfdfsl pfrz, rfz lfp ofin ufhfwpz\ndfsl pnwnr xynhpjw otrtp pz pnhp ifwn lwzu";
        String decryptedChat = decryptMessage(encryptedChat);
        System.out.println(decryptedChat);
    }

    public static String decryptMessage(String encryptedMessage) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char character : encryptedMessage.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                int newCharCode = character - 5;

                if (Character.isUpperCase(character)) {
                    if (newCharCode < 'A') {
                        newCharCode += 26;
                    }
                }
                else {
                    if (newCharCode < 'a') {
                        newCharCode += 26;
                    }
                }
                decryptedMessage.append((char) newCharCode);
            } else {
                decryptedMessage.append(character);
            }
        }
        return decryptedMessage.toString();
    }
}