import java.util.InputMismatchException;

class PersonalComputer extends Computers {
    private static double ADDED_100_MHZ_TO_PROCESSOR_CPU_TEMPERATURE_INCREASES = 0.1;
    private static double ADDED_100_MHZ_TO_PROCESSOR_RAM_TEMPERATURE_INCREASES = 0.15;
    private int procesor;
    private int RAM;
    private int HDD;
    private int temperatureProc;
    private int temperatureRam;
    private int procesorRam;

    public PersonalComputer(int procesor, int RAM, int HDD,
                            int temperatureProc, int procesorRam,
                            int temperatureRam) {
        this.procesor = procesor;
        this.RAM = RAM;
        this.HDD = HDD;
        this.temperatureProc = temperatureProc;
        this.procesorRam = procesorRam;
        this.temperatureRam = temperatureRam;
    }

    public int getProcesorRam() {
        return procesorRam;
    }

    public void setProcesorRam(int procesorRam) {
        this.procesorRam = procesorRam;
    }

    public int getProcesor() {
        return procesor;
    }

    public void setProcesor(int procesor) {
        this.procesor = procesor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getTemperatureProc() {
        return temperatureProc;
    }

    public void setTemperatureProc(int temperatureProc) {
        this.temperatureProc = temperatureProc;
    }

    public int getTemperatureRam() {
        return temperatureRam;
    }

    public void setTemperatureRam(int temperatureRam) {
        this.temperatureRam = temperatureRam;
    }

    @Override
    public void cpuClockSpeed() {
        while (procesor <= 3150) {
            try {
                setCpuClockSpeed(procesor);
                if (procesor > 3150)
                    System.out.println("Za bardzo podkręcony procesor," +
                            " grozi przegrzaniem");
            } catch (InputMismatchException e) {
                System.out.println("Obniż taktowanie w MHz");
                System.out.println(procesor);
            }
        }
    }

    @Override
    public void temperatureCpu() {
        while (temperatureProc <= 65) {
            try {
                setTemperatureCpu(temperatureProc);
                if (temperatureProc > 65)
                    System.out.println("Za wysoka temperatura," +
                            " grozi przegrzaniem procesora CPU");
            } catch (InputMismatchException e) {
                System.out.println("Obniż taktowanie procesora CPU w MHz");
                System.out.println(temperatureProc);
            }
        }
    }

    @Override
    public void ramClockSpeed() {
        while (procesorRam <= 2266) {
            try {
                setRamClockSpeed(procesorRam);
                if (procesorRam > 2266)
                    System.out.println("Za bardzo podkręcony procesor RAM" +
                            " grozi przegrzaniem");
            } catch (InputMismatchException e) {
                System.out.println("Obniż taktowanie procesora RAM w MHz");
                System.out.println(procesorRam);
            }
        }
    }

    @Override
    public void temperatureRam() {
        while (temperatureRam <= 50) {
            try {
                setTemperatureRam(temperatureRam);
                if (temperatureRam > 50)
                    System.out.println("Za wysoka temperatura " +
                            " grozi przegrzaniem procesora RAM");
            } catch (InputMismatchException e) {
                System.out.println("Obniż taktowanie procesora RAM w MHz");
                System.out.println(temperatureRam);
            }

        }
    }
}
