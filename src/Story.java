import java.awt.*;
import javax.swing.*;

public class Story{

    Game game;
    State ui;
    GameState vm;
    Boolean love;

    public Story(Game g, State s, GameState gs){
        game = g;
        ui = s;
        vm = gs;
    }

    public void defaultSetup(){

        love = true;
        Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
        ui.mainTextArea.setFont(normalFont);
        ui.mainTextArea.setBackground(Color.pink);
        ui.mainTextArea.setForeground(Color.black);//
        ui.titleNamePanel.setBackground(Color.pink);
        ui.startButtonPanel.setBackground(Color.pink);
        ui.mainTextPanel.setBackground(Color.pink);



        ui.playerPanel.setBackground(Color.pink);
        ui.choiceButtonPanel.setBackground(Color.pink);
        ui.window.getContentPane().setBackground(Color.pink);
        ui.startButton.setBackground(Color.pink);
        ui.choice1.setVisible(true);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
    }

    public void selectPosition(String next){
        //ui.stopMusic();
        switch(next){
            case "rules": rules();break;
            case "start": start();break;
            case "eavesdrop" : eavesdrop();break;
            case "ignore" : ignore();break;
            case "approach": approach();break;
            case "aliceDeath":aliceDeath();break;//
            case "recruitment": recruitment();break;
            case "trials" : trials();break;
            case "info": info();break;
            case "info2": info2();break;
            case "intro": intro();break;
            case "door": door(); break;
            case "teacup": teacup();break;
            case "bigQuestion": bigQuestion();break;
            case "allergicReaction" : allergicReaction();break;
            case "induct":induct();break;
            case "loveEnding": loveEnding();break;//
            case "escapeEnding": escapeEnding();break;//
            case "lonelyEnding": lonelyEnding();break;//
            case "specialDeath": specialDeath();break;//
            case "death": death();break;//
            case "toTitle": toTitle();break;


        }
    }

    public void rules(){
        ui.mainTextArea.setText("Rules: \nBrandon’s favorite color is Red \nKnock 3 times on every door \nNever comment on Alice’s blue hair \nYou’re allergic to lavender tea \nNever ask about the society master \nNever speak to the master unless spoken to");

        ui.choice1.setText("Next");

        game.nextPosition1 = "start";
        game.nextPosition2= "";
        game.nextPosition3 = "";


        ui.choice1.setVisible(true);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
    }
    public void start(){
        //main story
        ui.mainTextArea.setText("Emily begins her first day of college strolling through campus with her cat Meowzers. As Emily navigates the winding pathways, Meowzers suddenly releases from her leash, darting into a nearby grove of trees! Frantically, Emily calls for her cat, veering off the path into the foliage. As she continuously calls, Emily catches the murmur of tense voices. \n" +
                "Should she \n");
        ui.choice1.setText("Eavesdrop");
        ui.choice2.setText("Ignore and Walk");
        ui.choice3.setText("Approach them");

        ui.choice1.setVisible(true);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);

        game.nextPosition1 = "eavesdrop";
        game.nextPosition2= "ignore";
        game.nextPosition3 = "approach";


    }

    public void loveEnding(){
        ui.mainTextArea.setForeground(Color.white);
        ui.mainTextArea.setBackground(Color.magenta);
        ui.titleNamePanel.setBackground(Color.magenta);
        ui.startButtonPanel.setBackground(Color.magenta);
        ui.playerPanel.setBackground(Color.magenta);
        ui.choiceButtonPanel.setBackground(Color.magenta);
        ui.window.getContentPane().setBackground(Color.magenta);
        ui.mainTextPanel.setBackground(Color.magenta);
        ui.startButton.setBackground(Color.magenta);
        ending("BRANDON IS IMPRESSED BY YOU. YOU END UP TOGETHER AND AS PART OF THE SOCIETY. YOU HAVE UNLOCKED THE LOVE+INDUCT ENDING.\n");
    }
    public void escapeEnding(){
        ui.mainTextArea.setForeground(Color.white);
        ui.mainTextArea.setBackground(Color.magenta);
        ui.titleNamePanel.setBackground(Color.magenta);
        ui.startButtonPanel.setBackground(Color.magenta);
        ui.playerPanel.setBackground(Color.magenta);
        ui.choiceButtonPanel.setBackground(Color.magenta);
        ui.window.getContentPane().setBackground(Color.magenta);
        ui.mainTextPanel.setBackground(Color.magenta);
        ui.startButton.setBackground(Color.magenta);
        ending("YOU LEAVE THE UNDERGROUND CHAMBER THROUGH THE TRAP DOOR. YOU FAIL YOUR TRIAL AND BRANDON AND ALICE NEVER TALK TO YOU AGAIN. YOU HAVE UNLOCKED THE ESCAPE ENDING.");
    }

    public void lonelyEnding(){
        ui.mainTextArea.setForeground(Color.white);
        ui.mainTextArea.setBackground(Color.magenta);
        ui.titleNamePanel.setBackground(Color.magenta);
        ui.startButtonPanel.setBackground(Color.magenta);
        ui.playerPanel.setBackground(Color.magenta);
        ui.choiceButtonPanel.setBackground(Color.magenta);
        ui.window.getContentPane().setBackground(Color.magenta);
        ui.mainTextPanel.setBackground(Color.magenta);
        ui.startButton.setBackground(Color.magenta);
        ending("YOU HAVE HIVES ALL OVER YOU BECAUSE YOU DRANK THE WRONG TEA. BRANDON IS DISGUSTED BY YOU AND REJECTS YOU. HOWEVER, YOU HAVE SUCCESSFULLY BECOME A MEMBER OF THE SOCIETY.  YOU UNLOCKED THE LONELY ENDING.");

    }
    public void specialDeath(){
        ui.mainTextArea.setForeground(Color.white);
        ui.mainTextArea.setBackground(Color.black);
        ui.titleNamePanel.setBackground(Color.black);
        ui.startButtonPanel.setBackground(Color.black);
        ui.playerPanel.setBackground(Color.black);
        ui.choiceButtonPanel.setBackground(Color.black);
        ui.window.getContentPane().setBackground(Color.black);
        ui.mainTextPanel.setBackground(Color.black);
        ui.startButton.setBackground(Color.black);
        ending("GAME OVER. YOU ARE BOLD. NEVER INQUIRE ABOUT THE MASTER. YOU ARE STRIPPED OFF YOUR STATUS AS PART OF THE SOCIETY AND ARE TOSSED IN THE DUNGEON NEVER TO BE HEARD FROM AGAIN. YOU UNLOCKED THE SPECIAL DEATH ENDING.");

    }
    public void aliceDeath(){
        ui.mainTextArea.setForeground(Color.white);
        ui.mainTextArea.setBackground(Color.black);
        ui.titleNamePanel.setBackground(Color.black);
        ui.startButtonPanel.setBackground(Color.black);
        ui.playerPanel.setBackground(Color.black);
        ui.choiceButtonPanel.setBackground(Color.black);
        ui.window.getContentPane().setBackground(Color.black);
        ui.mainTextPanel.setBackground(Color.black);
        ui.startButton.setBackground(Color.black);
        ending("GAME OVER. NEVER COMMENT ON ALICE’S BLUE HAIR. SHE TOSSES YOU IN THE DUNGEON AND YOU MEET A TORTUROUS END. YOU UNLOCKED THE DEATH BY ALICE ENDING");

    }
    public void death (){
        ui.mainTextArea.setForeground(Color.white);
        ui.mainTextArea.setBackground(Color.black);
        ui.titleNamePanel.setBackground(Color.black);
        ui.startButtonPanel.setBackground(Color.black);
        ui.playerPanel.setBackground(Color.black);
        ui.choiceButtonPanel.setBackground(Color.black);
        ui.window.getContentPane().setBackground(Color.black);
        ui.mainTextPanel.setBackground(Color.black);
        ui.startButton.setBackground(Color.black);
        ending("GAME OVER. ALWAYS FOLLOW THE RULES AND ALWAYS PARTICIPATE. YOU UNLOCKED THE DEATH ENDING");

    }


    public void ending(String end){
        ui.mainTextArea.setText(end);
//        ui.mainTextArea.setForeground(Color.white);
//        ui.mainTextArea.setBackground(Color.black);
//        ui.titleNamePanel.setBackground(Color.black);
//        ui.startButtonPanel.setBackground(Color.black);
//        ui.playerPanel.setBackground(Color.black);
//        ui.choiceButtonPanel.setBackground(Color.black);
//        ui.window.getContentPane().setBackground(Color.black);
//        ui.mainTextPanel.setBackground(Color.black);
//        ui.startButton.setBackground(Color.black);
        Font font = new Font("Calibri", Font.PLAIN, 20);
        ui.mainTextArea.setFont(font);
        ui.choice1.setText("Start Again");
        ui.choice2.setText("");
        ui.choice3.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        //ui.playSE(2);

        ui.choice1.setVisible(true);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);

    }

    public void eavesdrop(){
        ui.mainTextArea.setText("Hiding behind the trees, Emily leans in more attentively to decipher the conversation. She peeks to see a dashing man and blue-haired woman. 'Induction is crucial today', the woman whispers. 'Yes, I heard the society has high expectations this year,' he responds conspiratorially. Emily gasps aloud at the news of this secret society. \n" +
                "Should she \n");
        ui.choice1.setText("Comment on the woman's blue hair");
        ui.choice2.setText("Ask what they are talking about");
        ui.choice3.setText("Ask to join");

        game.nextPosition1 = "aliceDeath";
        game.nextPosition2=  "recruitment";
        game.nextPosition3 = "recruitment";
    }

    public void ignore(){
        ui.mainTextArea.setText("Emily turns away from the mysterious voices, stealthily walking back towards the pathway. As she walks, Emily steps on a branch, letting out a loud crunch! Emily winces, knowing her cover is blown. The murmuring voices transform into increasing footsteps behind her. Reluctantly, Emily swivels her head around to two emerging figures. \n" + "'Hey, what are you doing here,' the left brunette guy barks, his dark brooding eyes challenging her. Emily stands stunned, contemplating her response.  What should she say? \n"+
                "What should she say? \n");
        ui.choice1.setText("Wow...you are beautiful");
        ui.choice2.setText("'I could say the same to you'");
        ui.choice3.setText("You and blue hair don't work");


        game.nextPosition1 = "recruitment";
        game.nextPosition2= "recruitment";
        game.nextPosition3 = "aliceDeath";
    }

    public void approach(){
        ui.mainTextArea.setText("Emily confidently makes her way over to the two whispering figures. One woman with blue hair, and one dashing man. She asks them who they are and is met with a huge side eye.   \n" +
                "Should she \n");
        ui.choice1.setText("Comment on the woman's hair.");
        ui.choice2.setText("Ask to join in on their plans");
        ui.choice3.setText("Stay quiet and stand awkwardly");

        game.nextPosition1 = "aliceDeath";
        game.nextPosition2= "recruitment";
        game.nextPosition3 = "recruitment";
    }
    public void recruitment(){
        ui.mainTextArea.setText("The mysterious man gives a sly smirk. “Hey I'm Brandon” He points to the woman with bright blue hair at his side. “This is my friend Alice.” Alice scowls. “I’m his BEST friend.” Brandon says, “We’re not really supposed to tell anyone this but since you already hear, we’re discussing plans for the secret society tonight. The induction is today, you should join.  \n" +
                "Should she \n");
        ui.choice1.setText("Say Yes and introduce yourself");
        ui.choice2.setText("Say No");
        ui.choice3.setText("Divert and ask about Alice’s hair");

        game.nextPosition1 = "trials";
        game.nextPosition2= "death";
        game.nextPosition3 = "aliceDeath";
    }


    public void trials(){
        ui.mainTextArea.setText("You exchange introductions. You (Emily) are then taken by Brandon and Alice down a spiral staircase near the campus. It is dark and underground. Brandon nudges you and says “Hey a just a tip the master of our society is intimidating. You’ll have to pass some tests first  \n" +
                "Should she \n");
        ui.choice1.setText("Ask more about this secret society");
        ui.choice2.setText("Ask who the master is");
        ui.choice3.setText("Ask how Brandon joined");

        game.nextPosition1 = "info";
        game.nextPosition2= "death";
        game.nextPosition3 = "info2";
    }

    public void info(){
        ui.mainTextArea.setText("“Unlike a sneaky sly fox over here,” Brandon glances at Emily, “I am a legacy here. My parents, and then their parents, and then their parents and so on were all part of the secret society. But I’m you stumbled across us.” He winks. They then reach the end of the staircase where Brandon then unlocks a secret tunnel to a room. “This is where the master resides” They walk in and the master is sitting atop a giant stone throne.\n" +
                "Should she \n");
        ui.choice1.setText("Humbly introduce herself");
        ui.choice2.setText("Awkwardly wait in silence ");
        ui.choice3.setText("Run away towards the door");

        game.nextPosition1 = "death";
        game.nextPosition2= "intro";
        game.nextPosition3 = "door";
    }
    ///
    public void info2(){
        ui.mainTextArea.setText("“Unlike a sneaky sly fox over here,” Brandon glances at Emily, “I am a legacy here. My parents, and then their parents, and then their parents and so on were all part of the secret society. But I’m glad you stumbled across us.” He winks. They then reach the end of the staircase where Brandon then unlocks a secret tunnel to a room. “This is where the master resides” They walk in and the master is sitting atop a giant stone throne. Should emily…");
        ui.choice1.setText("Humbly introduce herself");
        ui.choice2.setText("Awkwardly wait in silence");
        ui.choice3.setText("Run away towards the door");

        game.nextPosition1 = "death";
        game.nextPosition2= "intro";
        game.nextPosition3 = "door";

    }

    public void intro(){
        ui.mainTextArea.setText("The Master is dressed in a black gown and a black mask, his identity completely anonymous. The master mentions how the induction to the society consists of three trials. The door, the cup, and the question. The master motions for the wall to open behind Emily, which reveals a secret door." +
                "Should she \n");
        ui.choice1.setText("Place palm once and knock thrice");
        ui.choice2.setText("Use a hairpin to unlock it");
        ui.choice3.setText("Knock thrice");
        //ui.playMusic(1);

        game.nextPosition1 = "death";
        game.nextPosition2= "death";
        game.nextPosition3 = "teacup";

    }

    public void door(){
        ui.mainTextArea.setText("Emily runs frantically towards the door. How does she open it? ");
        ui.choice1.setText("Place palm once and knock thrice");
        ui.choice2.setText("Use a hairpin to unlock it");
        ui.choice3.setText("Knock thrice");

        game.nextPosition1 = "death";
        game.nextPosition2= "death";
        game.nextPosition3 = "teacup";


    }

    public void teacup(){
        ui.mainTextArea.setText("Emily successfully opens up the door. She then walks into an empty room with a table in the middle. Atop the table are four cups. Should she… ");
        ui.choice1.setText("Drink the dark purple tea");
        ui.choice2.setText("Drink the red tea");
        ui.choice3.setText("Mix the red and blue tea");

        game.nextPosition1 = "death";
        game.nextPosition2= "bigQuestion";
        game.nextPosition3 = "allergicReaction";



    }

    public void bigQuestion(){
        ui.mainTextArea.setText("Emily is able to progress to the next stage in which there is one big door, but a small trap door hidden next to the wall. She sees Brandon smiling at her from the viewing stage next to Alice. Should Emily… ");
        ui.choice1.setText("Run for the trap door");
        ui.choice2.setText("Enter through the big door");
        ui.choice3.setText("Yell at Alice that her hair is ugly");

        game.nextPosition1 = "escapeEnding";
        game.nextPosition2= "induct";
        game.nextPosition3 = "aliceDeath";


    }

    public void allergicReaction(){
        love = false;
        ui.mainTextArea.setText("Emily was able to dilute the lavender tea with the red tea. However, she’s still ALLERGIC HELLO????!!! Emily barely survives but she gets a bunch of hives on her face. Alice starts laughing at her. Emily is able to progress to the next stage in which there is one big door, but a small trap door hidden in the next to the wall. Should Emily… ");
        ui.choice1.setText("Make fun of Alice's hair");
        ui.choice2.setText("Run for the trap door");
        ui.choice3.setText("Enter through the big door");

        game.nextPosition1 = "aliceDeath";
        game.nextPosition2= "escapeEnding";
        game.nextPosition3 = "induct";


    }
    ///
    public void induct(){
        ui.mainTextArea.setText("Emily goes through the big door and is greeted by brandon, Alice, and the Master of the society. She is given her gown and mask and is told she is a part of the society. Brandon smiles kindly at her. Should Emily…");
        ui.choice1.setText("Tell brandon she loves him");
        ui.choice2.setText("Accept and exit the room");
        ui.choice3.setText("Try to take off the master’s mask");

        game.nextPosition1 = "loveEnding";
        game.nextPosition2= "lonelyEnding";
        game.nextPosition3 = "specialDeath";
        if (love==false) {
            game.nextPosition1 = "lonelyEnding";
            game.nextPosition2 = "lonelyEnding";
            game.nextPosition3 = "specialDeath";
        }
    }


    public void toTitle(){
        defaultSetup();
        vm.showTitleScreen();
    }

}