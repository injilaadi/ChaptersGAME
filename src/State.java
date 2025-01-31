import java.awt.*;
import javax.swing.*;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class State{


    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, imagePanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, imageLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;


    Sound sound = new Sound();




    public void addButton(JButton choice, Color back, Color fore, ChoiceHandler h){


        choice.setBackground(back);
        choice.setForeground(fore);
        choice.setFont(normalFont);
        choice.setFocusPainted(false);
        choice.addActionListener(h);
        choiceButtonPanel.add(choice);


    }
    public void createUI(ChoiceHandler han){


        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.pink);
        window.setLayout(null);
        window.setVisible(true);


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.pink);
        titleNameLabel  =new JLabel("CHOICES");
        titleNameLabel.setForeground(Color.black);
        titleNameLabel.setFont(titleFont);
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,200);
        startButtonPanel.setBackground(Color.pink);
        startButton = new JButton("START");
        startButton.setBackground(Color.white);
        startButton.setForeground(Color.black);
        startButton.setFont(normalFont);
        startButton.addActionListener(han);
        startButton.setActionCommand("start");
        startButton.setFocusPainted(false);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.setVisible(true);




        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.pink);
        window.add(mainTextPanel);
        mainTextArea = new JTextArea ("The story goes that...");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.pink);
        mainTextArea.setForeground(Color.black);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setEditable(false);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);


        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350, 300,150);
        choiceButtonPanel.setBackground(Color.pink);
        choiceButtonPanel.setLayout(new GridLayout(3,1));
        window.add(choiceButtonPanel);


        choice1 = new JButton("Choice1");
        addButton(choice1, Color.white, Color.black, han);
        choice1.setActionCommand("c1");
        choice2 = new JButton("Choice2");
        addButton(choice2, Color.white, Color.black, han);
        choice2.setActionCommand("c2");
        choice3= new JButton("Choice3");
        addButton(choice3, Color.white, Color.black, han);
        choice3.setActionCommand("c3");



        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.pink);
        playerPanel.setLayout(new GridLayout(1,3));//
        window.add(playerPanel);




    }
    public void playMusic(int i){
        sound.setFile(i);
        sound.play();
        sound.loop();
    }
    public void stopMusic(){
        sound.stop();


    }
    public void playSE(int i){
        sound.setFile(i);
        sound.play();
    }






}


