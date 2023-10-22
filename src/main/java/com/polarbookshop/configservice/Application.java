/*----------------------------------------------------------------------------*/
/* Source File:   APPLICATION.JAVA                                            */
/* Copyright (c), 2023 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Oct.22/2023  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.polarbookshop.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Entry point for running the application.
 *
 * @author COQ - Carlos Adolfo Ortiz Q.
 */
@SpringBootApplication
@EnableConfigServer
public class Application {
    /**
     * Running application definition entry point.
     *
     * @param args Includes the command line parameters for the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
