package com.java.designpattern.pattern2_builder;

public class Computer {
    private String cpu;
    private String motherboard;
    private String displayCard;
    private String ram;
    private String disk;
    private String power;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", displayCard='" + displayCard + '\'' +
                ", ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setDisplayCard(String displayCard) {
        this.displayCard = displayCard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public static class Builder {
        private String cpu;
        private String motherboard;
        private String displayCard;
        private String ram;
        private String disk;
        private String power;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder setDisplayCard(String displayCard) {
            this.displayCard = displayCard;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setDisk(String disk) {
            this.disk = disk;
            return this;
        }

        public Builder setPower(String power) {
            this.power = power;
            return this;
        }

        public Computer create() {
            Computer computer = new Computer();

            if (cpu != null) {
                computer.setCpu(cpu);
            }
            if (motherboard != null) {
                computer.setMotherboard(motherboard);
            }
            if (displayCard != null) {
                computer.setDisplayCard(displayCard);
            }
            if (ram != null) {
                computer.setRam(ram);
            }
            if (disk != null) {
                computer.setDisk(disk);
            }
            if (power != null) {
                computer.setPower(power);
            }

            return computer;
        }
    }
}