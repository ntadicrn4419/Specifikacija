package storageSpec;

/**
 * Defines user privileges.
 * ADMIN: can read, download, upload, delete; operations:
 * public abstract int setStorageSize(long bytes);
 * public abstract int setForbiddenExtensions(Collection<String> extensions);
 * public abstract int setMaxFileNumberInDir(int number, String dirPath);
 * public abstract int addUser(String userName, String password, Privilege privilege);
 * public abstract int removeUser(String userName);

 * DELETE: can read, download, upload, delete
 * UPLOAD: can read, download, upload
 * DOWNLOAD: can read, download
 * READ: can read
 * */

public enum Privilege {
    READ, DOWNLOAD, UPLOAD, DELETE, ADMIN;
    //Privilegije su poredjane hijerarhijski: najmanja privilegija koju user moze da ima je read. Ako neki user ima privilegiju download, automatski ima i privilegiju read
    //tj. ima pristup operacijama istog ili nizeg nivoa privilegije -> User sa admin privilegijom moze da izvrsava sve operacije
}
