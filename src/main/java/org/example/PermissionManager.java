package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public PermissionLevel getCurrentLevel() {
        return mCurrentLevel;
    }

    public void setCurrentLevel(PermissionLevel level) {
        this.mCurrentLevel = level;
    }
}
