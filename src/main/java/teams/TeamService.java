package teams;

import players.Player;

public class TeamService {
    // no properties needed , no constructor needed
    public TeamService (){

    }
//count empty spaces on team
//return int value
//parameters - Team (do not need players as players array is already in Team Class)

    public int countEmptySpacesOnTeam(Team team) {
        // temprary variable to store count
        int count = 0;
        //  Look through player array and count nulls
        //get.players is the method and will return player array
        for (Player player : team.getPlayer()){
            // if statement
            // if players is null add one to count
            // null lets you know nothing is their in the memory
            if (player == null){
                count++;
            }
            // you do not need to know if a player is there because the above if only tell you if there is a null
        }
        // return count
        return count;
    }
}
