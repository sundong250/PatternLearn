package com.sundong.test.adapter;

public class AudioPlayer implements MediaPlayer
{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("avi"))
        {
            System.out.println("playing avi file. name : " + fileName);
        }
        else if (audioType.equalsIgnoreCase("mp3") || audioType.equalsIgnoreCase("mp4"))
        {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }
}
