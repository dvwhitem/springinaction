/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author dv
 */
//@Qualifier("stringed")
//@StringedInstrument
@Component
public class Guitar implements Instrument {

    public Guitar() {}

    @Override
    public void play() {
        System.out.println("Strum Strum Strum");
    }
    
    
}
