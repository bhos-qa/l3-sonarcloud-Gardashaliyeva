package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    PermissionManager() {
        mCurrentLevel = PermissionLevel.USER;
    }

    public String getCurrentRoleName() {
        return mCurrentLevel.name();
    }

    public void setPermissionLevel(PermissionLevel level) {
        mCurrentLevel = level;
    }
}
