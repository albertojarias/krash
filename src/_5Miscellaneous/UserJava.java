package _5Miscellaneous;

import org.jetbrains.annotations.NotNull;

public class UserJava {

    private int id;
    String name;
    private boolean activeFlag;

    public UserJava(int id, String name, boolean activeFlag) {
        this.id = id;
        this.name = name;
        this.activeFlag = activeFlag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }
}
