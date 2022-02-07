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

    public void addPlayerToTeam (Team team, Player player) throws Exception{
        // check if there's space on the team
        // for loop from earlier
        int spaces = countEmptySpacesOnTeam(team);
        // if there is space, add player
        if (spaces > 0){
            // get players array from the team(call)
            Player[] players = team.getPlayer();
            // create a variable to store
            // add  player to first available empty space
            // loop through array to find first empty space
            // to set first players exactly were the first space is in the index
            for (int i = 0; i < players.length; i++) {
            // if we find an empty space, add the player then break
                if (players[i] == null){
                    players[i] = player;
                    break;
                }
            }
            // if we find an empty space, add the player then break
        }
        else{
            throw new Exception();
        }
    }
}
