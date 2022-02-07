package pojos;

import java.util.Objects;

public class Player {
    // Properties
    // must be private so user doesn't have access to it and cannot change them
    private String name;
    private String position;
    private int number;
    private int contractLength;

    // Constructor
    public Player(String name, String position, int number, int contractLength) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.contractLength = contractLength;
        // the values we are passing are for a specific object
    }
    //default Constructor sets no properties or values.
    public Player (){

    }
    // Getters & Setters
    // Encapsulation
    // getName of our property name
    // their own methods for pojos
    public String getName(){
        return name;
    }
    public String getPosition (){
        return position;
    }
    public int getNumber (){
        return number;
    }
    public int getContractLength (){
        return contractLength;
    }
    //setters need to pass arguments inside the brackets
    // it is void because we don't need anything back
    public void setName(String name){
        this.name = name;
    }
    public  void setPosition(String position){
        this.position = position;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setContractLength(int contractLength){
        this.contractLength= contractLength;
    }
    // toString - default in object super class - give specific implementation - allows you to print
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number && contractLength == player.contractLength && Objects.equals(name, player.name) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, number, contractLength);
    }
}
