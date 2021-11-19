package storageSpec;

import java.util.Map;
/**
 * Class for AbstractUser serialization
 * */
public class UserData {
    /**
     * AbstractUsers username
     * */
    private String userName;
    /**
     * AbstractUsers password
     * */
    private String password;
    /**
     * AbstractUsers storagesAndStorages
     * */
    private Map<String, Privilege> storagesAndPrivileges;
    /**
     * Constructs empty object of UserData
     */
    public UserData() {

    }
    /**
     * Getters and setters
     */
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
