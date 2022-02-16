package com.sundong.test.adapter;

public class Test
{
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "test.mp3");
        audioPlayer.play("mp4", "test.mp4");
        audioPlayer.play("avi", "test.avi");
    }
}
