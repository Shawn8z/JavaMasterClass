package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

    }

}

class Album {
    String name;
    String artist;
    ArrayList<Song> songs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return false;
            }
        }

        Song newSong = new Song(title, duration);
        songs.add(newSong);
        return true;
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = (trackNumber == 0) ? trackNumber : trackNumber - 1;
        Song song = songs.get(index);

        if (playList.contains(song)) {
            return false;
        }

        playList.add(song);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);

        if (song == null) return false;
        if (playList.contains(song)) return false;

        playList.add(song);
        return true;
    }
}

class Song {
    String title;
    double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
