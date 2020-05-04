package it.polimi.ingsw.PSP14.client.model;

public class UICell {
    private int towerHeight;
    private boolean dome;
    private UIWorker worker;

    UICell() {
        this.towerHeight = 0;
        this.dome = false;
        this.worker = null;
    }

    public int getTowerHeight() {
        return towerHeight;
    }

    public void setTowerHeight(int towerHeight) {
        this.towerHeight = towerHeight;
    }

    public boolean hasDome() {
        return dome;
    }

    public void setDome(boolean dome) {
        this.dome = dome;
    }

    /**
     * Get the worker assigned to this cell.
     * @return the worker (<code>null</code> if there's no worker)
     */
    public UIWorker getWorker() {
        return worker;
    }

    public void setWorker(UIWorker worker) {
        if (this.worker != null)
            this.worker.unsetCell();
        this.worker = worker;
    }

    public void unsetWorker() {
        this.worker = null;
    }
}
