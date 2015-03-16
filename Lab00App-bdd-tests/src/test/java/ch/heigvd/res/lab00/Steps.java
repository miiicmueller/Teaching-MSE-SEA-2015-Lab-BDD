package ch.heigvd.res.lab00;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 *
 * @author Olivier Liechti
 */
public class Steps {

  List<IInstrument> orchestra;
  String music;

  @Given("^there is an orchestra available$")
  public void there_is_an_orchestra_available() throws Throwable {
    orchestra = new ArrayList<IInstrument>();
    orchestra.add(new Flute());
    orchestra.add(new Trumpet());
  }

  @When("^I ask them to play$")
  public void i_ask_them_to_play() throws Throwable {
    StringBuilder music = new StringBuilder();
    for (IInstrument instrument : orchestra) {
      music.append(instrument.play());
    }
    this.music = music.toString();
  }

  @Then("^I hear some music$")
  public void i_hear_some_music() throws Throwable {
    assertNotNull(music);
    assertNotEquals("", music);
  }

  @Given("^there is an orchestra$")
  public void there_is_an_orchestra() throws Throwable {
    orchestra = new ArrayList<>();
  }

  @Given("^there is (\\d+) flute player in the the orchestra$")
  public void there_is_flute_player_in_the_the_orchestra(int numberOfFlutes) throws Throwable {
    for (int i = 0; i < numberOfFlutes; i++) {
      orchestra.add(new Flute());
    }
  }

  @When("^I ask the orchestra to play$")
  public void i_ask_the_orchestra_to_play() throws Throwable {
    i_ask_them_to_play();
  }

  @Then("^I hear the sound of flute$")
  public void i_hear_the_sound_of_flute() throws Throwable {
    assertNotEquals(-1, music.indexOf("piout"));
  }

  @Then("^I don't hear the sound of trumpet$")
  public void i_don_t_hear_the_sound_of_trumpet() throws Throwable {
    assertEquals(-1, music.indexOf("pouet"));
  }

}
