package com.company.w9HW;

public class House {
    public static void main(String[] args) {
        //we can create many houses with options that we wish(if here will be a swimming pool or not)
        HouseType houseType1=new HouseType
                .HouseTypeBuilder(0001)
                .AddressOf("Ulica Pushkina")
                .MaterialOf("Wood")
                .NumbersOfFloorsOf(4)
                .AreaOf(25)                           //here we have swimming pool
                .build();
        HouseType houseType2=new HouseType
                .HouseTypeBuilder(0002)
                .AddressOf("Ulica Calatushkina")
                .MaterialOf("Iron")
                .NumbersOfFloorsOf(2)                //here not
                .build();
    }
}
