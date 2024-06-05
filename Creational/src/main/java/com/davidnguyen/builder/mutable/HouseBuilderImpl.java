package com.davidnguyen.builder.mutable;

public class HouseBuilderImpl implements HouseBuilder {
    private int windows;
    private int doors;
    private int walls;
    private String roof;
    private String yard;
    private String swimmingPool;
    private String garage;

    @Override
    public HouseBuilder windows(int windows) {
        this.windows = windows;
        return this;
    }

    @Override
    public HouseBuilder doors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public HouseBuilderImpl walls() {
        this.walls = 4;
        return this;
    }

    @Override
    public HouseBuilder roof(String roof) {
        this.roof = roof;
        return this;
    }

    @Override
    public HouseBuilder yard(String yard) {
        this.yard = yard;
        return this;
    }

    @Override
    public HouseBuilder swimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    @Override
    public HouseBuilder garage(String garage) {
        this.garage = garage;
        return this;
    }

    @Override
    public House build() {
        return new House(windows, doors, walls, roof, yard, swimmingPool, garage);
    }
}
