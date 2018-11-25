package pl.sda.gofpatterns.creational.factoryMethod.creational.prototype;

public class Computer {
    private final String processorType;
    private final Integer memorySize;
    private final Integer diskSize;

    public Computer(String processorType, Integer memorySize, Integer diskSize) {
        this.processorType = processorType;
        this.memorySize = memorySize;
        this.diskSize = diskSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorType='" + processorType + '\'' +
                ", memorySize=" + memorySize +
                ", diskSize=" + diskSize +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
