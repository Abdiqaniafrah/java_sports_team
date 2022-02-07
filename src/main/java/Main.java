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


        // need to make an instance
        TeamService teamService = new TeamService();
        int spaces = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spaces);
    }
}
