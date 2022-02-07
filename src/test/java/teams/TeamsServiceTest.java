package teams;

import managers.Manager;
import org.junit.jupiter.api.Test;
import players.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamsServiceTest {

    @Test
    public void canCountEmptySpacesOnTeamWhenEmpty(){
        // Given
        //create a manager object before you can give him/her a team
        Manager manager = new Manager("test manager");
        Team team = new Team("team1",manager);
        ///create teamservice class
        TeamService underTest = new TeamService();
        // When
        //invoke method
        // store in a variable because we need to refer to it in the assertion
        int actual = underTest.countEmptySpacesOnTeam(team);

        // Then
        // assertion
        int expected = 15;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canCountEmptySpacesOnTeamWithOnePlayer(){
        // Given
        //create a manager object before you can give him/her a team
        Manager manager = new Manager("test manager");
        Team team = new Team("Test RFC",manager);
        Player player = new Player("test player", "winger", 11, 2);
        TeamService underTest = new TeamService();
        try {
            underTest.addPlayerToTeam(team, player);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // When
        int actual = underTest.countEmptySpacesOnTeam(team);

        // Then
        int expected = 14;
        assertThat(actual).isEqualTo(expected);
    }



}
