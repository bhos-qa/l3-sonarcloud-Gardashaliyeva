package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PermissionManagerTest {

    @Test
    public void getCurrentLevel() {
        PermissionManager manager = new PermissionManager();
        assertEquals(manager.getCurrentLevel(), PermissionLevel.USER);
    }

    @Test
    public void setCurrentLevel() {
        PermissionManager manager = new PermissionManager();
        manager.setCurrentLevel(PermissionLevel.DEVELOPER);
        assertEquals(manager.getCurrentLevel(), PermissionLevel.DEVELOPER);
    }
}