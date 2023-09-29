package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        mCurrentLevel = PermissionLevel.USER;
    }

    public String getRoleName(PermissionLevel level) {
        switch (level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown";
        }
    }

    public String getCurrentRoleName() {
        return getRoleName(mCurrentLevel);
    }

    public void setPermissionLevel(PermissionLevel level) {
        mCurrentLevel = level;
    }

    public PermissionLevel getCurrentPermissionLevel() {
        return mCurrentLevel;
    }
}
