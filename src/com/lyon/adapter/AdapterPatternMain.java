package com.lyon.adapter;

public class AdapterPatternMain {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "sky.mp3");
		audioPlayer.play("mp4", "cat.mp4");
		audioPlayer.play("vlc", "try.vlc");
		audioPlayer.play("avi", "tokyo.avi");
	}

}
