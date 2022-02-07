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
        // temporary variable to store count
        int count = 0;
        // Method 1
        //  Look through player array and count nulls
        //get.players is the method and will return player array
        for (Player player : team.getPlayer()){
            // If statement
            // If players is null add one to count
            // null lets you know nothing is their in the memory
            if (player == null){
                count++;
            }
            // Method 1
//        Player [] players = team.getPlayer();
//            for (int i = 0; i < players.length; i++){
//                // i = look for the index i in the array
//                if (players[i] == null){
//                    count++;
//                }
            // you do not need to know if a player is there because the above if only tell you if there is a null
        }
        // return count
        return count;
    }
}
