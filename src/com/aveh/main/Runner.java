package com.aveh.main;

import com.aveh.comparer.ImageComparer;

public class Runner {
    public static void main(String[] args) {
        ImageComparer.areEquals("./images/test1.png", "./images/test2.png");
    }
}
