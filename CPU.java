class CPU
{
    private String model;

    CPU(String model)
    {
        this.model = model;
    }

    String getModel()
    {
        return model;
    }
}

class Computer
{
    private String brand;
    CPU cpu;

    Computer(String brand, String cpuModel)
    {
        this.brand = brand;
        this.cpu = new CPU(cpuModel);
    }

    String getComputerInfo()
    {
        return brand + " " + cpu.getModel();
    }

    void start()
    {
        System.out.println("Computer started with CPU: " + cpu.getModel());
    }
}

class Main
{
    public static void main(String[] args) {
        
        Computer computer = new Computer("Dell", "Intel i5");
        System.out.println(computer.getComputerInfo());
        computer.start();
    }
}