package com.HibernateAssignment.SpringAssignment.AssignmentSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
    	Reactangle rectangle=(Reactangle)context.getBean("rectangleObj",Reactangle.class);
    		rectangle.display();
    }
    
}
