import java.util.Scanner;

public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public class Processor {
        private int cores;
        private double speed;

        public Processor(int cores, double speed) {
            this.cores = cores;
            this.speed = speed;
        }

        public void info() {
            System.out.println("Processor Cores: " + cores + ", Processor Speed: " + speed + " GHz");
        }
    }

    public static class RAM {
        private int size;
        private String type;

        public RAM(int size, String type) {
            this.size = size;
            this.type = type;
        }

        public void info() {
            System.out.println("RAM Size: " + size + " GB, RAM Type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CPU Price: $");
        double cpuPrice = scanner.nextDouble();
        CPU myCPU = new CPU(cpuPrice);

        System.out.print("Enter Processor Cores: ");
        int processorCores = scanner.nextInt();
        System.out.print("Enter Processor Speed (GHz): ");
        double processorSpeed = scanner.nextDouble();
        CPU.Processor myProcessor = myCPU.new Processor(processorCores, processorSpeed);

        System.out.print("Enter RAM Size (GB): ");
        int ramSize = scanner.nextInt();
        System.out.print("Enter RAM Type: ");
        String ramType = scanner.next();
        CPU.RAM myRAM = new CPU.RAM(ramSize, ramType);

        scanner.close();

        System.out.println("CPU Price: $" + myCPU.getPrice());
        System.out.print("Processor Information: ");
        myProcessor.info();
        System.out.print("RAM Information: ");
        myRAM.info();
    }
}

