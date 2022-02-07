import managers.Manager;
import players.Player;
import teams.Team;
import teams.TeamService;

public class Main {
    public static void main (String[] args) {
        Player player = new Player("Finn Russell", "Fly Half",10, 10);
        Manager manager = new Manager("Townsend");
        Team scotland = new Team("scotland", manager);
        Manager manager2 = new Manager("Jones");
        Team england = new Team("england", manager);


        // create a teamService object
        TeamService teamService = new TeamService();

        int spacesBefore = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesBefore);
        //
        try {
            teamService.addPlayerToTeam(scotland, player);
        } catch (Exception e) {
            System.out.println("team is full");;
        }

        int spacesAfter = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesAfter);
    }
}
