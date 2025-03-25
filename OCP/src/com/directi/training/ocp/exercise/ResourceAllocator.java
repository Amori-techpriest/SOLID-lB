package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    public int allocate(ResourceType resourceType)
    {
        int resourceId;
        for (Slot slot: slots) {
        resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
        }
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        for (Slot slot : slots) {
            markSlotFree(resourceId);
        }
    }
}
