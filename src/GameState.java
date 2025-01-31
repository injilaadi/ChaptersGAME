public class GameState{

    State ui;

    public GameState (State userI){
        ui = userI;

    }
    public void titleToTown(){

        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);




    }

    public void showTitleScreen(){
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        //ui.playMusic(0);
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);


    }


}