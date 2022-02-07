package teams;

import managers.Manager;
import players.Player;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    private Player[] player;
    private String name;
    private Manager manager;
    // use can use any class as a data type
    //Constructor
    public Team(){
        // we can create a team object even if we don't have all the information to pass
    }
    public Team (String name, Manager manager) {
    // only need name of team and manager because they won't be the same
    // the player array will stay the same because all teams will have 15 players
        this.name = name;
        this.manager = manager;
        //player array add new
        // initialise the player array in the constructor
        //
        this.player = new Player[15];
    }
    public String getName (){
        return name;
    }
    public void setName (String name){
        // refers to the property rather than the class
        this.name = name;
    }
    public Manager getManager (){
        return manager;
    }
    public void setManager (Manager manager){
        // you are now passing a property
        this.manager = manager;
    }
    public Player[] getPlayer(){
        return player;
    }
    public void setPlayer(Player[] player){
        this.player = player;
    }

    @Override
    public String toString() {
        return "Team{" +
                "player=" + Arrays.toString(player) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(player, team.player) && Objects.equals(name, team.name) && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(player);
        return result;
    }
}
