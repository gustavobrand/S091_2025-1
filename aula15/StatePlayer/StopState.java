package aula15.StatePlayer;

/**
 * Concrete states provide the special implementation for all interface methods.
 */
public class StopState extends State {

    StopState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onStop() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}