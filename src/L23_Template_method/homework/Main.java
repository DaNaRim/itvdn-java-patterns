package L23_Template_method.homework;

import L23_Template_method.homework.encoders.SimpleEncryptor;
import L23_Template_method.homework.encoders.StrongEncryptor;

public class Main {

    public static void main(String[] args) {
        SimpleEncryptor simpleEncryptor = new SimpleEncryptor();
        StrongEncryptor strongEncryptor = new StrongEncryptor();

        String text = "Hello word! This is test text to encrypt and num 123%$#";

        String result = strongEncryptor.encode(text);
        String back = strongEncryptor.decode(result);

        System.out.println(text);
        System.out.println(result);
        System.out.println(back);
    }
}
