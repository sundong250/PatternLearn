package com.sundong.test.adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType)
    {
        if (audioType.equalsIgnoreCase("mp3"))
        {
            advancedMediaPlayer = new Mp3Player();
        }
        else if (audioType.equalsIgnoreCase("mp4"))
        {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3"))
        {
            advancedMediaPlayer.playMp3(fileName);
        }
        else if (audioType.equalsIgnoreCase("mp4"))
        {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
