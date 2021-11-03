package storageSpec;

import java.util.ArrayList;
import java.util.Collection;

public class Storage {

    private String storageName;
    private AbstractUser admin;//administrator skladista
    private String rootLocation;// lokacija na racunaru(ili google drajvu) gde se nalazi direktorijum koji predstavlja ovo skladiste
    private Collection<Directory> directories;//kolekcija svih direktorijuma u ovom skladistu
    private Collection<AbstractUser> users;

    public Storage(String storageName, AbstractUser admin, String rootLocation) {
        this.storageName = storageName;
        this.admin = admin;
        this.rootLocation = rootLocation;
        this.directories = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addDirectory(Directory dir){
        this.directories.add(dir);
    }
    public void removeDirectory(Directory dir){
        this.directories.remove(dir);
    }
    public void addUser(AbstractUser user){ this.users.add(user);}
    public void removeUser(AbstractUser user){ this.users.remove(user);}
    public void cleanStorage(){
        this.directories.clear();
    }

    public AbstractUser getAdmin() {
        return admin;
    }

    public String getRootLocation() {
        return rootLocation;
    }

    public Collection<Directory> getDirectories() {
        return directories;
    }

}
