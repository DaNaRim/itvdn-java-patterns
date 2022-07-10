package L23_Template_method.homework.encoders;

public class SimpleEncryptor extends Encryptor {

    private static final int CAESAR_OFFSET = 1;

    @Override
    protected String encodeFirstStep(String input) {
        //Caesar Cipher

        StringBuilder result = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (character == ' ') {
                result.append(character);
            } else {
                int originalPosition = character - 'a';
                int newAPosition = (originalPosition + CAESAR_OFFSET) % 26 + 'a';
                char newCharacter = (char) ('a' + newAPosition);
                result.append(newCharacter);
            }
        }
        return result.toString();
    }

    @Override
    protected String decodeFirstStep(String input) {
        //Caesar Cipher

        StringBuilder result = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (character == ' ') {
                result.append(character);
            } else {
                int originalPosition = character - 'a';
                int newAPosition = (originalPosition - CAESAR_OFFSET) % 26 - 'a';
                char newCharacter = (char) ('a' + newAPosition);
                result.append(newCharacter);
            }
        }
        return result.toString();
    }
}
