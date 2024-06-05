package com.davidnguyen.builder.immutable;

public class House {
    private int windows;
    private int doors;
    private int walls;
    private String roof;
    private String yard;
    private String swimmingPool;
    private String garage;

    public static class Builder {
        // required parameters
        private final int windows;
        private final int doors;
        private final int walls;
        private final String roof;

        // optional parameters
        private String yard;
        private String swimmingPool;
        private String garage;

        public Builder(int windows, int doors, int walls, String roof) {
            this.windows = windows;
            this.doors = doors;
            this.walls = walls;
            this.roof = roof;
        }

        Builder yard(String val) {
            yard = val;
            return this;
        }

        Builder swimmingPool(String val) {
            swimmingPool = val;
            return this;
        }

        Builder garage(String val) {
            garage = val;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    private House(Builder builder) {
        windows = builder.windows;
        doors = builder.doors;
        walls = builder.walls;
        roof = builder.roof;
        yard = builder.yard;
        swimmingPool = builder.swimmingPool;
        garage = builder.garage;
    }

    @Override
    public String toString() {
        return "windows=" + windows +
                ", doors=" + doors +
                ", walls=" + walls +
                ", roof='" + roof + '\'' +
                ", yard='" + yard + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                ", garage='" + garage + '\'';
    }
}
