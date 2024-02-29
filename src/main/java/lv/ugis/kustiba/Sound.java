package lv.ugis.kustiba;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;

public class Sound {
    private Clip clip;

    public Sound(URL url) {
        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(inputStream);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void start () {
        clip.setFramePosition(0);
        clip.start();
    }

    public void stop () {
        clip.stop();
    }
}
