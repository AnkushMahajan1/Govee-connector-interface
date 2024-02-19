package com.example.demo.model;

public class ControlRequest {

    private Cmd cmd;

    // Constructor
    public ControlRequest(String cmdName, String valueName, int r, int g, int b) {
        this.cmd = new Cmd(cmdName, new Value(valueName, r, g, b));
    }

    // Getter and Setter for cmd
    public Cmd getCmd() {
        return cmd;
    }

    public void setCmd(Cmd cmd) {
        this.cmd = cmd;
    }

    // Inner classes for encapsulating nested JSON structure
    public static class Cmd {
        private String name;
        private Value value;

        // Constructor
        public Cmd(String name, Value value) {
            this.name = name;
            this.value = value;
        }

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for value
        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }
    }

    public static class Value {
        private String name;
        private int r;
        private int g;
        private int b;

        // Constructor
        public Value(String name, int r, int g, int b) {
            this.name = name;
            this.r = r;
            this.g = g;
            this.b = b;
        }

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for r, g, b
        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }

        public int getG() {
            return g;
        }

        public void setG(int g) {
            this.g = g;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }


}
