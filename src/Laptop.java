/**
 * This is the laptop class implements computer interface
 * @author Haoran Yin yin143@purdue.edu
 * @version 2018/10/15-00
 */
public class Laptop implements Computer{

    private String name;
    private int numCores, memorySize, storageSize;
    private double weight, screenSize;
    private boolean isConvertible;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getNumCores() {
        return numCores;
    }

    @Override
    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    @Override
    public int getMemorySize() {
        return memorySize;
    }

    @Override
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public int getStorageSize() {
        return storageSize;
    }

    @Override
    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    @Override
    public void printConfig() {
        String isConver = "no";
        if (isConvertible)
            isConver = "yes";
        System.out.println("Name: " + getName() + "\n" +
                "Cores: " + getNumCores() + "\n" +
                "Memory: " + getMemorySize() + " MB\n" +
                "Storage: " + getStorageSize() + " GB\n" +
                "Weight: " + getWeight() + " lbs\n" +
                "Screen size: " + getScreenSize() + " in\n" +
                "Convertible: " + isConver);
    }
}
