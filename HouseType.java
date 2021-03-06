package com.company.w9HW;

public class HouseType {
    private int code;
    private String address;
    private int numberOfFloors;
    private String material;
    private int AreaOfSwimmingPool;

    public HouseType(HouseTypeBuilder HouseTypeBuilder){
        this.code=HouseTypeBuilder.getCode();
        this.address=HouseTypeBuilder.getAddress();
        this.material=HouseTypeBuilder.getMaterial();
        this.numberOfFloors=HouseTypeBuilder.getNumberOfFloors();
        this.AreaOfSwimmingPool=HouseTypeBuilder.getAreaOfSwimmingPool();
    }

    public static class HouseTypeBuilder{
        private int code;
        private String address;
        private int numberOfFloors;
        private String material;
        private int AreaOfSwimmingPool;
        public HouseTypeBuilder(int code){
            this.code=code;
        }

        public HouseTypeBuilder AddressOf(String address) {
            this.address = address;
            return this;
        }

        public HouseTypeBuilder NumbersOfFloorsOf(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public HouseTypeBuilder MaterialOf(String material) {
            this.material = material;
            return this;
        }

        public HouseTypeBuilder AreaOf(int AreaOfSwimmingPool) {
            this.AreaOfSwimmingPool=AreaOfSwimmingPool;
            return this;
        }
        public int getCode(){
            return code;
        }

        public String getAddress() {
            return address;
        }

        public String getMaterial() {
            return material;
        }

        public int getNumberOfFloors() {
            return numberOfFloors;
        }
        public int getAreaOfSwimmingPool(){
            return AreaOfSwimmingPool;
        }
        public HouseType build(){
            return new HouseType(this);
        }
    }

}
