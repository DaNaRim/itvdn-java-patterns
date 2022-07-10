package L23_Template_method.homework.encoders;

public abstract class Encryptor {

    public final String encode(String input) {
        String stage1 = encodeFirstStep(input);
        String stage2 = encodeSecondStep(stage1);
        String stage3 = encodeThirdStep(stage2);

        return stage3;
    }

    public final String decode(String input) {
        String stage3 = decodeThirdStep(input);
        String stage2 = decodeSecondStep(stage3);
        String stage1 = decodeFirstStep(stage2);

        return stage1;
    }


    protected abstract String encodeFirstStep(String input);

    protected String encodeSecondStep(String input) {
        return input;
    }

    protected String encodeThirdStep(String input) {
        return input;
    }

    protected abstract String decodeFirstStep(String input);

    protected String decodeSecondStep(String input) {
        return input;
    }

    protected String decodeThirdStep(String input) {
        return input;
    }
}
