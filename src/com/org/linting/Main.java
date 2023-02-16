package com.org.linting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main{


    public static void main(String[]args) {
        final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        System.out.println("asdsladlsad");
        logger.log(Level.INFO, "HELOO LINTINg USED HERE");
    }
}