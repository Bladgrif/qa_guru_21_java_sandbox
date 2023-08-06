package lesha_marshal_java;

public class Computer {
    private int memory;
    private int cpu;
    private String name;

    Computer() {

    }


    Computer(int memory, int cpu, String name) {
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
