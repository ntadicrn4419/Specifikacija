package storageSpec;

import java.util.Collection;

public class Directory {

    private Storage parentStorage;//skladiste kome direktorijum pripada
    private Directory parentDirectory;//direktorijum u kom se ovaj direktorijum nalazi. Ukoliko se nalazi direktno u skladistu(nije ugnjezden u neki drugi dir) ovo polje je null
    private Collection<MyFile> myFiles;
    private int maxFileNumber;

    public Directory(Storage parentStorage, Directory parentDirectory, Collection<MyFile> myFiles) {
        this.parentStorage = parentStorage;
        this.parentDirectory = parentDirectory;
        this.myFiles = myFiles;
        this.maxFileNumber = Integer.MAX_VALUE;
    }

    public Storage getParentStorage() {
        return parentStorage;
    }

    public void setParentStorage(Storage parentStorage) {
        this.parentStorage = parentStorage;
    }

    public Directory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(Directory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public Collection<MyFile> getFiles() {
        return myFiles;
    }

    public void setFiles(Collection<MyFile> myFiles) {
        this.myFiles = myFiles;
    }

    public int getMaxFileNumber() {
        return maxFileNumber;
    }

    public void setMaxFileNumber(int maxFileNumber) {
        this.maxFileNumber = maxFileNumber;
    }
}
