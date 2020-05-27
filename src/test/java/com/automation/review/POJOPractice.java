package com.automation.review;

import java.util.Base64;

public class POJOPractice {
    public static void main(String[] args) {

        //We can use Base64 -to encode and decoding
            byte[] decoded = Base64.getDecoder().decode("YWRtaW46YWRtaW4=");
            String value = new String(decoded);
            System.out.println(value);// admin admin

    }
}
