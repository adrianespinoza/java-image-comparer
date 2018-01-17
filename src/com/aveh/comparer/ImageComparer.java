package com.aveh.comparer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageComparer {
    public static boolean areEquals(String firstImagePath, String secondImagePath) {
        ImagePHash p = new ImagePHash();
        try {
            String image1 = p.getHash(new FileInputStream(new File(firstImagePath)));
            String image2 = p.getHash(new FileInputStream(new File(secondImagePath)));
            int score = p.distance(image1, image2);
            System.out.println("Score is " + score);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

