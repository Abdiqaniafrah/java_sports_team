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

        int spaces = teamService.countEmptySpacesOnTeam(england);
        System.out.println(spaces);
    }
}
