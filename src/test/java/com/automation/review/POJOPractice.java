package com.automation.review;

import java.util.Base64;

public class POJOPractice {
    public static void main(String[] args) {

            byte[] decoded = Base64.getDecoder().decode("YWRtaW46YWRtaW4=");
            String value = new String(decoded);
            System.out.println(value);

    }
}
