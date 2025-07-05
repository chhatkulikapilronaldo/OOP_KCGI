package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import java.util.Base64;

public class PasswordEncoder {

    public static String encode(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    public static boolean matches(String rawPassword, String encodedPassword) {
        String encodedRaw = encode(rawPassword);
        return encodedRaw.equals(encodedPassword);
    }
}
