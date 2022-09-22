package com.example.teamcodebitzmusic;

import android.net.Uri;

public class MusicList {

    private String title, artists, duration;
    private boolean isPlaying;
    private Uri musicFile;

    public MusicList(String title, String artists, String duration, boolean isPlaying, Uri musicFileUris) {
        this.title = title;
        this.artists = artists;
        this.duration = duration;
        this.isPlaying = isPlaying;
        this.musicFile = musicFile;

    }

    public String getTitle() {
        return title;
    }

    public String getArtists() {
        return artists;
    }

    public String getDuration() {
        return duration;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public Uri getMusicFile() {
        return musicFile;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
