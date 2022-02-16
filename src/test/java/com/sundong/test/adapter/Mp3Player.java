package com.sundong.test.adapter;

public class Mp3Player implements AdvancedMediaPlayer
{

    @Override
    public void playMp3(String fileName) {
        System.out.println("Playing Mp3 file. Name : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
