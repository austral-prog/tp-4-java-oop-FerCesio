package com.template;

public class Elevator {

    int min;
    int max;
    int capacity;
    int currentFloor;
    int passengerCount = 0;

    public Elevator(int min, int max, int capacity) {
        this.min = min;
        this.max = max;
        this.capacity = capacity;

    }

    public int getCurrentFloor(){
        return moveToFloor(currentFloor);
    }

    public int moveToFloor(int floor) {
        if (floor>max || floor<min){
            return currentFloor;
        }
        else {
            currentFloor = floor;
        }
        return floor;
    }

    public int addPassenger(){
        if (passengerCount<capacity){
            passengerCount += 1;
            return passengerCount;
        }
        else {
            return passengerCount;
        }

    }

    public int getPassengerCount(){
        return passengerCount;
    }

    public int removePassenger(){
        return passengerCount -= 1;
    }

}
