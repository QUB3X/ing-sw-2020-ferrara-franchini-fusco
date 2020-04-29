package it.polimi.ingsw.PSP14.client.view;

import it.polimi.ingsw.PSP14.core.proposals.GodProposal;
import it.polimi.ingsw.PSP14.core.proposals.PlayerProposal;

import it.polimi.ingsw.PSP14.client.view.GUIUtils;

import java.util.List;

public class GUI extends UI {

    @Override
    public void update() {

    }

    @Override
    Color getColor() {
        return null;
    }

    /**
     * Display a greeting to the player.
     */
    @Override
    public void welcome() {
        GUIUtils.launch(GUIUtils.class);
    }

    /**
     * Display on the UI that a player is trying to connect to a server
     *
     * @param hostname the address of the server
     * @param port     the port of the server
     */
    @Override
    public void notifyConnection(String hostname, int port) {

    }

    /**
     * Ask the player for how many players should participate in a match.
     *
     * @return the size of the lobby
     */
    @Override
    public int getLobbySize() {
        return 0;
    }

    /**
     * Display a notification to the player.
     *
     * @param s the content of the notification
     */
    @Override
    public void notify(String s) {

    }

    /**
     * Prompt the player to provide a username
     *
     * @return the chosen username
     */
    @Override
    public String askUsername() {
        return GUIUtils.getUsername();
    }

    /**
     * Prompt the player to select a god from the list of available gods.
     *
     * @param proposals Available gods
     * @return the index of the chosen god.
     */
    @Override
    public int chooseGod(List<GodProposal> proposals) {
        return 0;
    }

    /**
     * Ask the player to choose another player (even themselves) from a list.
     *
     * @param proposals the list of players to choose from
     * @return the index of the chosen player
     */
    @Override
    public int chooseFirstPlayer(List<PlayerProposal> proposals) {
        return 0;
    }

    /**
     * Ask the player to choose a worker from a list
     *
     * @return the index of the chosen worker
     */
    @Override
    public int chooseWorker() {
        return 0;
    }

    @Override
    public int chooseAvailableGods(List<GodProposal> gods) {
        return 0;
    }

    @Override
    public int[] chooseWorkerInitialPosition() {
        return new int[0];
    }
}