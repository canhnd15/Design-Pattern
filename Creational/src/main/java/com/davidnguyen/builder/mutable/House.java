package com.davidnguyen.builder.mutable;

public class House {
    private int windows;
    private int doors;
    private int walls;
    private String roof;
    private String yard;
    private String swimmingPool;
    private String garage;

    public House(int windows, int doors, int walls, String roof, String yard, String swimmingPool, String garage) {
        this.windows = windows;
        this.doors = doors;
        this.walls = walls;
        this.roof = roof;
        this.yard = yard;
        this.swimmingPool = swimmingPool;
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", walls=" + walls +
                ", roof='" + roof + '\'' +
                ", yard='" + yard + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}
