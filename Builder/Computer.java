package Builder;

public class Computer {

    private final String cpu;
    private final String ram;
    private final String ssd;
    private final String hdd;
    private final String gpu;
    private final String power;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.hdd = builder.hdd;
        this.gpu = builder.gpu;
        this.power = builder.power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", gpu='" + gpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

    public static class Builder {

        private String cpu;
        private String ram;
        private String ssd;
        private String hdd;
        private String gpu;
        private String power;

        public Computer build() {
            return new Computer(this);
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder ssd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder hdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder power(String power) {
            this.power = power;
            return this;
        }
    }

}
