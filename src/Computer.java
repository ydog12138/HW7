/**
 * This is the computer interface
 * @author Haoran Yin yin143@purdue.edu
 * @version 2018/10/15-00
 */
public interface Computer {

    String getName();
    int getNumCores();
    int getMemorySize();
    int getStorageSize();
    void setName(String name);
    void setNumCores(int numCores);
    void setMemorySize(int memory);
    void setStorageSize(int storage);

    default void printConfig() {
        System.out.println("Name: " + getName() + "\n" +
                "Cores: " + getNumCores() + "\n" +
                "Memory: " + getMemorySize() + " MB\n" +
                "Storage: " + getStorageSize() + " GB");
    }
}
