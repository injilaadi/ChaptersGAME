import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;


public class Sound {
    Clip clip;

    File sound[] = new File[30];



    public Sound(){

        try {

            sound[0]=new File("/src/sound/love-story-instrumental.wav");
            sound[1]=new File("/src/sound/sound-effect.wav");
            sound[2]=new File("/src/sound/yeat.wav");



        } catch (Exception e) {
            // TODO: handle exception
            //System.out.println(sound[0].getAbsolutePath());
            e.printStackTrace();
        }

    }

    public void setFile(int i)
    {
        try{

            AudioInputStream ais= AudioSystem.getAudioInputStream(sound[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();

        }catch (Exception e){
            System.out.print("could not play");
            e.printStackTrace();
        }

    }

    public void play(){
        clip.setFramePosition(0);
        clip.start();


    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
    }

}
