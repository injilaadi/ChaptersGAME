//case and break, fix labels, add end boolean, add story choices, add images

public class Game{
    ChoiceHandler handle = new ChoiceHandler(this);
    State ui = new State();
    GameState vm = new GameState(ui);
    Story story = new Story(this, ui, vm);

    String nextPosition1, nextPosition2, nextPosition3;

    public Game(){
        ui.createUI(handle);

        story.defaultSetup();
        vm.showTitleScreen();

    }

    public static void main(String[] args){
        Game launch = new Game();



    }

}
