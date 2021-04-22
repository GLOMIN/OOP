package Chap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Chap10_03 extends JFrame {
    private AudioInputStream sound1, sound2, sound3;
    private JButton playSound, loopSound, stopSound, pauseSound;
    private JComboBox<String> chooseSound;
    private Clip clip, clip1, clip2, clip3;
    private File Files1, Files2, Files3;
    long CliptimePosition = 0;

    // load the image when the applet begins executing
    public Chap10_03() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        String choices[] = { "Yak Ruw Tae Mai Yak Tham", "Taxi : Kid Tuang Chan Mai", "Player Hurt" };
        chooseSound = new JComboBox<String>(choices);
        chooseSound.addItemListener(new ItemListener() {

            // stop sound and change to sound to user's selection
            public void itemStateChanged(ItemEvent e) {
                clip.stop();
                if (chooseSound.getSelectedIndex() == 0) {
                    clip = clip1;
                } else if (chooseSound.getSelectedIndex() == 1) {

                    clip = clip2;
                }

                else if (chooseSound.getSelectedIndex() == 2) {

                    clip = clip3;
                }
            }
        } // end anonymous inner class
        ); // end addItemListener method call
        container.add(chooseSound);
        // set up button event handler and buttons
        ButtonHandler handler = new ButtonHandler();
        playSound = new JButton("Play");
        playSound.addActionListener(handler);
        container.add(playSound);
        loopSound = new JButton("Loop");
        loopSound.addActionListener(handler);
        container.add(loopSound);
        pauseSound = new JButton("Pause");
        pauseSound.addActionListener(handler);
        container.add(pauseSound);
        stopSound = new JButton("Stop");
        stopSound.addActionListener(handler);
        container.add(stopSound);
        // load sounds and set currentSound
        try {
            Files1 = new File("c:/OOP/src/Chap/Know.wav");
            sound1 = AudioSystem.getAudioInputStream(Files1);
            Files2 = new File("c:/OOP/src/chap/Taxi.wav");
            sound2 = AudioSystem.getAudioInputStream(Files2);
            Files3 = new File("c:/OOP/src/chap/PlayerHurt.wav");
            sound3 = AudioSystem.getAudioInputStream(Files3);
            clip = AudioSystem.getClip();
            clip1 = AudioSystem.getClip();
            clip2 = AudioSystem.getClip();
            clip3 = AudioSystem.getClip();
            clip1.open(sound1);
            clip2.open(sound2);
            clip3.open(sound3);
            clip = clip1;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // end method
    public static void main(String[] args) {
        String filepath = "d:/PlayerHurt.wav";
        Chap10_03 test = new Chap10_03();
        // test.playmusic(filepath);
        test.setSize(480, 150);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

    // private inner class to handle button events
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {

            if (actionEvent.getSource() == playSound) {
                clip.setMicrosecondPosition(CliptimePosition);

                clip.start();

            } else if (actionEvent.getSource() == loopSound)
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            else if (actionEvent.getSource() == pauseSound) {
                CliptimePosition = clip.getMicrosecondPosition();
                clip.stop();
            } else if (actionEvent.getSource() == stopSound) {
                clip.stop();
                CliptimePosition = 0L;
            }
        }
    } // end class ButtonHandler
} // end class