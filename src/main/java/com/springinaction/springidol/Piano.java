
package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component
@StringedInstrument
public class Piano implements Instrument {
  public Piano() {
  }

  public void play() {
    System.out.println("PLINK PLINK PLINK");
  }
}
