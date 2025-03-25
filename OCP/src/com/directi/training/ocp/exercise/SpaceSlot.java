package com.directi.training.ocp.exercise;

public class SpaceSlot extends Slot {
    private final int resourceId;

    public SpaceSlot(int resourceId) {
        this.resourceId = resourceId;
    }

    private void markSlotFree(int resourceId)
    {
    }

    private void markSlotBusy(int resourceId)
    {
    }

    private int findFreeSlot()
    {
        return 0;
    }
}