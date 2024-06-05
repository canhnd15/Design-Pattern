package com.davidnguyen.builder.mutable;

public interface HouseBuilder {
    HouseBuilder windows(int windows);
    HouseBuilder doors(int doors);
    HouseBuilder walls();
    HouseBuilder roof(String roof);
    HouseBuilder yard(String yard);
    HouseBuilder swimmingPool(String swimmingPool);
    HouseBuilder garage(String garage);
    House build();
}
