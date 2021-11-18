package storageSpec;

import java.util.Collection;

public class StorageData {

    private String storageName;
    private String storageID;
    private String rootLocation;
    private int storageSize;
    private Collection<String> forbiddenExtensions;

    public StorageData() {

    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStorageID() {
        return storageID;
    }

    public void setStorageID(String storageID) {
        this.storageID = storageID;
    }

    public String getRootLocation() {
        return rootLocation;
    }

    public void setRootLocation(String rootLocation) {
        this.rootLocation = rootLocation;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public Collection<String> getForbiddenExtensions() {
        return forbiddenExtensions;
    }

    public void setForbiddenExtensions(Collection<String> forbiddenExtensions) {
        this.forbiddenExtensions = forbiddenExtensions;
    }
}
