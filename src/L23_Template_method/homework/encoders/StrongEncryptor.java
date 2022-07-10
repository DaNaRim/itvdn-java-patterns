package L23_Template_method.homework.encoders;

import java.util.Base64;

public class StrongEncryptor extends Encryptor {

    private static final int FIRST_STEP_OFFSET = 3;

    @Override
    protected String encodeFirstStep(String input) {
        StringBuilder result = new StringBuilder();
        for (int character : input.getBytes()) {
            result.append((char) (character + FIRST_STEP_OFFSET));
        }
        return result.toString();
    }

    @Override
    protected String encodeSecondStep(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    @Override
    protected String encodeThirdStep(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    protected String decodeFirstStep(String input) {
        StringBuilder result = new StringBuilder();
        for (int character : input.getBytes()) {
            result.append((char) (character - FIRST_STEP_OFFSET));
        }
        return result.toString();
    }

    @Override
    protected String decodeSecondStep(String input) {
        return new String(Base64.getDecoder().decode(input));
    }

    @Override
    protected String decodeThirdStep(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
