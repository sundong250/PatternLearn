package com.sundong.test.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playMp3(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name : " + fileName);
    }
}
