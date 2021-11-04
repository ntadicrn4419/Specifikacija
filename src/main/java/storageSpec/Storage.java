package storageSpec;

import java.util.ArrayList;
import java.util.Collection;

public class Storage {

    private String storageName;
    private String storageID;
    private AbstractUser admin;//administrator skladista
    private String rootLocation;// lokacija na racunaru(ili google drajvu) gde se nalazi direktorijum koji predstavlja ovo skladiste
    private Collection<AbstractUser> users;

    public Storage(String storageName, AbstractUser admin, String rootLocation, String storageID) {
        this.storageName = storageName;
        this.admin = admin;
        this.rootLocation = rootLocation;
        this.users = new ArrayList<>();
        this.storageID = storageID;
    }

    public void addUser(AbstractUser user){ this.users.add(user);}
    public void removeUser(AbstractUser user){ this.users.remove(user);}

    public AbstractUser getAdmin() {
        return admin;
    }

    public String getRootLocation() {
        return rootLocation;
    }

    public String getStorageID() {
        return storageID;
    }
    public void setStorageID(String storageID) {
        this.storageID = storageID;
    }

    public String getStorageName() {
        return storageName;
    }

    public Collection<AbstractUser> getUsers() {
        return users;
    }

}
