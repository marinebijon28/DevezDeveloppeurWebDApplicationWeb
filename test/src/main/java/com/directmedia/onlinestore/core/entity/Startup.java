package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;

public class Startup {

    public static void main(String... args){
        Catalogue ref = new Catalogue();
        ref.listOfWorks = new HashSet<Artist>();
        Artist artist = new Artist("ACDC");
        ref.listOfWorks.add(artist);
        artist = new Artist("Linking Park");
        ref.listOfWorks.add(artist);
        artist = new Artist("Green Day");
        ref.listOfWorks.add(artist);

       for (Artist artist1 : ref.listOfWorks) {
           System.out.println(artist1.getName());
       }
    }

}
