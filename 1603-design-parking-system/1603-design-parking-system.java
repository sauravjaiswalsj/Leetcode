class ParkingSystem {
    HashMap<Integer, Integer> slots = new HashMap<>();
    public ParkingSystem(int big, int medium, int small) {
        this.slots.put(1, big);
        this.slots.put(2, medium);
        this.slots.put(3, small);
    }
    
    public boolean addCar(int carType) {
        if (isSpaceAvailable(carType)){
            slots.put(carType, slots.getOrDefault(carType, 0) -1);
            return true;
        }
        return false;
    }
    public boolean isSpaceAvailable(int carType){
        return slots.get(carType) > 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */