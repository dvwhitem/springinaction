/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author dv
 */
//@Qualifier("stringed")
@StringedInstrument
public class Guitar implements Instrument {

    public Guitar() {}

    @Override
    public void play() {
        System.out.println("Dran Drin Tran");
    }
    
    
}
