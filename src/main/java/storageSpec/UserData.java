package storageSpec;

import java.util.Map;

public class UserData {
    private String userName;
    private String password;
    private Map<String, Privilege> storagesAndPrivileges;

    public UserData() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Privilege> getStoragesAndPrivileges() {
        return storagesAndPrivileges;
    }

    public void setStoragesAndPrivileges(Map<String, Privilege> storagesAndPrivileges) {
        this.storagesAndPrivileges = storagesAndPrivileges;
    }
}
