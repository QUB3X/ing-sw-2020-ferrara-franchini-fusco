package it.polimi.ingsw.PSP14.core.messages;

import it.polimi.ingsw.PSP14.client.ServerConnection;
import it.polimi.ingsw.PSP14.client.view.UI;
import it.polimi.ingsw.PSP14.core.proposals.BuildProposal;

import java.util.Collection;

/**
 * ProposalMessage containing the details about a specific Build action.
 */
public class BuildProposalMessage extends ProposalMessage<BuildProposal> {
    public BuildProposalMessage(Collection<BuildProposal> p) {
        super(p);
    }

    @Override
    public boolean execute(UI ui, ServerConnection serverConnection) {
        // TODO: Implement
        return false;
    }
}