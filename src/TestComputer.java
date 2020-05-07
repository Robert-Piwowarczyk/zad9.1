import java.util.InputMismatchException;
class TestComputer {
    public static void main(String[] args) {
        Computers computers = new PersonalComputer
                (3000, 4096, 128, 50,
                        2133, 40);



        computers.cpuClockSpeed();
        System.out.println("Taktowanie procesora PC: " +
                computers.getCpuClockSpeed() + " MHz");
        computers.temperatureCpu();
        System.out.println("Temperatura procesora PC: " +
                computers.getTemperatureCpu() + " stopni");

        computers.ramClockSpeed();
        System.out.println("Taktowanie procesora RAM: " +
                computers.getRamClockSpeed() + " MHz");
        computers.temperatureRam();
        System.out.println("Temperatura procesora RAM: " +
                computers.getTemperatureRam() + " stopni");
    }
}
