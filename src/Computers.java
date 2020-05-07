abstract class Computers {
    private int cpuClockSpeed;
    private int ramClockSpeed;
    private int temperatureCpu;
    private int temperatureRam;


    public int getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    public void setCpuClockSpeed(int cpuClockSpeed) {
        this.cpuClockSpeed = cpuClockSpeed;
    }

    public int getRamClockSpeed() {
        return ramClockSpeed;
    }

    public void setRamClockSpeed(int ramClockSpeed) {
        this.ramClockSpeed = ramClockSpeed;
    }

    public int getTemperatureCpu() {
        return temperatureCpu;
    }

    public void setTemperatureCpu(int temperatureCpu) {
        this.temperatureCpu = temperatureCpu;
    }

    public int getTemperatureRam() {
        return temperatureRam;
    }

    public void setTemperatureRam(int temperatureRam) {
        this.temperatureRam = temperatureRam;
    }

    public abstract void cpuClockSpeed();

    public abstract void temperatureCpu();

    public abstract void ramClockSpeed();

    public abstract void temperatureRam();
}






