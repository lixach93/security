package com.example.jwtsecurity.util;

import lombok.experimental.UtilityClass;

import java.util.Base64;

@UtilityClass
public class DecodeUtil {

    Base64.Decoder decoder = Base64.getDecoder();
    Base64.Encoder encoder = Base64.getEncoder();

    public static String decode(String str) {
        return new String(decoder.decode(str));
    }

    public static String encode(String str) {
        return encoder.encodeToString(str.getBytes());
    }
}
