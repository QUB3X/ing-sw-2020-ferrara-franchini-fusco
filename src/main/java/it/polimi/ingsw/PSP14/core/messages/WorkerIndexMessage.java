package it.polimi.ingsw.PSP14.core.messages;

import it.polimi.ingsw.PSP14.client.controller.ServerConnection;
import it.polimi.ingsw.PSP14.client.view.UI;

import java.io.IOException;

/**
 * This class purpose is to retrieve a
 */
public class WorkerIndexMessage implements ClientExecutableMessage {
    @Override
    public void execute(UI ui, ServerConnection serverConnection) throws IOException {
        int index = ui.chooseWorker();
        serverConnection.sendMessage(new ChoiceMessage(index));
    }
}
