package storageSpec;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
//ideja je da jedan isti user za neko skladiste moze da bude admin a za neko drugo da ima drugi nivo privilegije; znaci da svaki user moze imati pristup ka vise skladista i za svako
//se zna koji je njegov nivo privilegije-> zbog toga su ovoj klasi metode i za READ, DOWNLOAD, UPLOAD, DELETE, ADMIN nivo privilegije.
public abstract class AbstractUser {

    private String userName;
    private String password;
    private transient Storage currentActiveStorage;
    private Map<String, Privilege> storagesAndPrivileges;// spisak skladista kojima user ima pristup i nivo pristupa za svako skladiste
    //String je storageID
    public AbstractUser() {

    }
    //Prepraviti parametre i povratne vrednosti
    //Za svaku operaciju mora se definisati nad kojim skladistem se izvrsava!!!
    //Kada se zna na koje skladiste se odredjena operacija odnosi, mora da se proveri da li user koji zeli da izvrsi tu operaciju ima dovoljan nivo privilegije za
    //tu operaciju nad tim skladistem!!!

    public abstract void initStorage(String storageName, String rootLocation);
    public abstract void saveUserData(String filePath);
    public abstract void saveStorageData();// cuvanje vrednosti polja ove klase u nekom fajlu kako bi u sledecem pokretanju programa mogli da ih ponovo setujemo
    public abstract void createDir(String dirName, String path);
    public abstract void createDir(String dirName, String path, String namePrefix, int numberOfFiles);
    public abstract void createFile(String fileName, String path, String storageName, String fileType);
    public abstract void uploadExistingFile(String fileName, String path, String storageName, String fileType);
    public abstract void move(Collection<String> files, String path);
    public abstract void move(String file, String path);
    public abstract void delete(String path);
    public abstract void download(String path, String whereToDownload);
    public abstract Collection<String> searchFilesInDir(String dirPath);
    public abstract Collection<String> searchDirsInDir(String dirPath);
    public abstract Collection<String> searchByName(String fileName);
    public abstract Collection<String> searchByExtension(String extension);
    public abstract Collection<String> getFilesInDirSortedByName(String dir);
    public abstract Object getModificationDate(String path);
    public abstract Object getCreationDate(String path);
    public abstract Collection<String> searchByDateCreationRange(Date start, Date end);
    public abstract Collection<String> searchFilesInDirByDateCreationRange(Date start, Date end, String dirPath);

    //adminove metode
    public abstract void setStorageSize(int bytes, Storage storage);
    public abstract void setForbiddenExtensions(Collection<String> extensions, Storage storage);
    public abstract void setMaxFileNumberInDir(int number, Storage storage, String dirPath);
    public abstract void addUser(AbstractUser user, Storage storage, Privilege privilege);
    public abstract void removeUser(AbstractUser user, Storage storage);

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, Privilege> getStoragesAndPrivileges() {
        return storagesAndPrivileges;
    }
    public void addStorage(String storageId, Privilege privilege){
        this.storagesAndPrivileges.put(storageId, privilege);
    }
    public void removeStorage(String storageId){
        this.storagesAndPrivileges.remove(storageId);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void initStoragesAndPrivileges(Map<String, Privilege> map) {
        this.storagesAndPrivileges = map;
    }

    public Storage getCurrentActiveStorage() {
        return currentActiveStorage;
    }

    public void setCurrentActiveStorage(Storage currentActiveStorage) {
        this.currentActiveStorage = currentActiveStorage;
    }
}
