package com.davidnguyen.builder.mutable;

public class Client {
    public static void main(String[] args) {
        /* House for poor people include 2 windows, 1 doors, 4 walls and a roof which is made from bamboo */
        House poorGuysHouse = new HouseBuilderImpl()
                .windows(2)
                .doors(1)
                .walls()
                .roof("made from bamboo")
                .build();
        System.out.printf("%s%s%n", "POOR GUYS HOUSE: ", poorGuysHouse.toString());

        /* House for common people include 4 windows, 1 doors, 4 walls, a roof which is made from steel and a yard for 30 square meters*/
        House commonGuysHouse = new HouseBuilderImpl()
                .windows(4)
                .doors(1)
                .walls()
                .roof("made from steel")
                .yard("30 square meters")
                .build();
        System.out.printf("%s%s%n", "COMMON GUYS HOUSE: ", commonGuysHouse.toString());

        /* House for rich people include 8 windows, 2 doors, 4 walls, roof which is made from steel,
           yard with 300 square meter, swimming pool with 40 square meter and a garage with  50 square meter */
        House richGuysHouse = new HouseBuilderImpl()
                .windows(8)
                .doors(4)
                .walls()
                .roof("made from steel")
                .yard("300 square meters")
                .swimmingPool("40 square meters")
                .garage("50 square meters")
                .build();
        System.out.printf("%s%s%n", "RICH GUYS HOUSE: ", richGuysHouse.toString());
    }
}
