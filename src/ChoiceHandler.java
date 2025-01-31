
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChoiceHandler implements ActionListener{


    Game game;

    public ChoiceHandler(Game g) {
        game = g;
    }

    public void actionPerformed(ActionEvent event){

        String yourChoice = event.getActionCommand();

        switch(yourChoice){
            case "start": game.vm.titleToTown(); game.story.rules(); break;
            case "c1": game.story.selectPosition(game.nextPosition1);break;
            case "c2": game.story.selectPosition(game.nextPosition2);break;
            case "c3": game.story.selectPosition(game.nextPosition3);break;
            //case "c4": game.story.selectPosition(game.nextPosition4);break;
        }
    }
}