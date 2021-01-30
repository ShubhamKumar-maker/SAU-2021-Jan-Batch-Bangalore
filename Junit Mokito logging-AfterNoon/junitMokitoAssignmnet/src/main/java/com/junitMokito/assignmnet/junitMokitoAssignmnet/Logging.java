package com.junitMokito.assignmnet.junitMokitoAssignmnet;
import java.util.Scanner;
import org.apache.log4j.*;
public class Logging {
	private static org.apache.log4j.Logger lgr = Logger.getLogger(Logging.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Level");
        System.out.println("1->ALL");
        System.out.println("2->DEBUG");
        System.out.println("3->INFO");
        System.out.println("4->WARN");
        System.out.println("5->ERROR");
        System.out.println("6->FATAL");
        System.out.println("7->OFF");
        System.out.println("Enter choice");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                lgr.setLevel(Level.ALL);
                break;
            case 2:
                lgr.setLevel(Level.DEBUG);
                break;
            case 3:
                lgr.setLevel(Level.INFO);
                break;
            case 4:
                lgr.setLevel(Level.WARN);
                break;
            case 5:
                lgr.setLevel(Level.ERROR);
                break;
            case 6:
                lgr.setLevel(Level.FATAL);
                break;
            case 7:
                lgr.setLevel(Level.OFF);
                break;
        }
        
        lgr.trace("!!!!Trace!!!!");
        lgr.debug("!!!!Debug!!!!");
        lgr.info("!!!!Info!!!!!");
        lgr.warn("!!!!Warn!!!!!");
        lgr.error("!!!!Error!!!!!");
        lgr.fatal("!!!!Fatal!!!!!");
        
    }
	   
} 
	


 