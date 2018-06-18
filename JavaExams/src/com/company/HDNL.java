package com.company;

import java.io.ByteArrayInputStream;

public class HDNL {
    public void fakeInput(){
        String test = "";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }
    public static void main(String[] args) {

    }
}
