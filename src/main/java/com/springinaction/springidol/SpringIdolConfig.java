/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author dv
 */
@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke2() {
        return new PoeticJuggler(10, sonnet29());
    }

    @Bean
    public Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public SystemProperties systemProperties() {
        return new SystemProperties();
    }
}
