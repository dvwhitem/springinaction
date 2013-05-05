//<start id="instrumentalist_java" /> 
package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("duke")
@Component("kenny")
public class Instrumentalist implements Performer {
  public Instrumentalist() {
  }

  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    instrument.play();
  }

  @Value("#{systemProperties.myFavoriteSong}")
  private String song;

  public void setSong(String song) {
    this.song = song;
  }

  public String getSong() {
    return song;
  }

  public String screamSong() {
    return song;
  }

  @Autowired
  @StringedInstrument
  //@Qualifier("guitar")
  //@Qualifier("stringed")
  private Instrument instrument;

//  @Autowired
//  public void setInstrument(Instrument instrument) {
//    this.instrument = instrument;
//  }
}
