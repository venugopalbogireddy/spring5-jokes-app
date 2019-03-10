package com.vb.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by venugopal on 2019-03-10.
 */
//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
